package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double squareRoot(double num){
        logger.info("[SQUARE ROOT OPERATION] [START] " + num);

        double c = Math.sqrt(num);

        logger.info("[SQUARE ROOT OPERATION] [END] " + c);

        return c;
    }
    public static int factorial(int num){
        logger.info("[FACTORIAL OPERATION] [START] " + num);

        int c = num ;
        for(int i=num-1; i>=1; i--) c = c*i;

        logger.info("[FACTORIAL OPERATION] [END] " + c);

        return c;
    }
    public static double naturalLog(double num){
        logger.info("[LOGARITHM OPERATION] [START] " + num);

        double c = Math.log(num);

        logger.info("[LOGARITHM OPERATION] [END] " + c);

        return c;
    }
    public static double power(double num, double exp){
        logger.info("[POWER OPERATION] [START] " + num);

        double c = Math.pow(num,exp);

        logger.info("[POWER OPERATION] [END] " + c);

        return c;
    }

    public static void main(String[] args) {
        logger.info("[MAIN] [START] ");

        Scanner reader = new Scanner(System.in);
        int op, flag = 0;
        double num, exp;
        int int_num;

        System.out.println("------------Calculator--------------");

        do{
            System.out.println("");
            System.out.println("Choose an operation:");
            System.out.println("1. Square root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log");
            System.out.println("4. Power");
            System.out.println("5. Exit");
            System.out.println("");
            op = reader.nextInt();

            if(op==5) flag = 1;
            else{
                switch(op){
                    case 1:  // Square Root
                        System.out.print("Enter the number: ");
                        num = reader.nextDouble();
                        double sqrt = squareRoot(num);
                        System.out.println("The Result is "+ sqrt);
                        System.out.println("");
                        System.out.println("------------------------------------");
                        break;

                    case 2: //Factorial
                        System.out.print("Enter the number: ");
                        int_num = reader.nextInt();
                        int fact = factorial(int_num);
                        System.out.println("The Result is "+ fact);
                        System.out.println("");
                        System.out.println("------------------------------------");
                        break;

                    case 3: //Natural Log
                        System.out.print("Enter the number: ");
                        num = reader.nextDouble();
                        double log = naturalLog(num);
                        System.out.println("The Result is "+ log);
                        System.out.println("");
                        System.out.println("------------------------------------");
                        break;

                    case 4: //Power
                        System.out.print("Enter the number: ");
                        num = reader.nextDouble();
                        System.out.print("Enter the exponent: ");
                        exp = reader.nextDouble();
                        double pow = power(num,exp);
                        System.out.println("The Result is "+ pow);
                        System.out.println("");
                        System.out.println("------------------------------------");
                        break;

                    default:
                        System.out.println("Invalid input");
                        System.out.println("");
                        System.out.println("------------------------------------");
                }
            }
        }
        while(flag == 0);
    }
}
