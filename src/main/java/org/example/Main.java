package org.example;

import java.text.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //creating a scanner object
        //System.in = receiving input from keyboard
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your buying price per share:");
        //storing the input for the buying price into buyingPrice
        double buyingPrice = scan.nextDouble();
        //day begins at 1
        int day = 1;
        double closingPrice = 0.1;
        DecimalFormat df = new DecimalFormat("0.00");

        while (true){
            System.out.println("Enter the closing price for day "
            + day + " (input any negative value to leave) ");
            closingPrice = scan.nextDouble();
            if(closingPrice < 0.0) break;
            double earnings = closingPrice - buyingPrice;
            if(earnings > 0){
                System.out.println("After day " + day + ", you earned $" + df.format(earnings) + " per share.");
            }
            else if(earnings < 0){
                System.out.println("After day " + day + ", you lost $" + df.format(earnings) + " per share.");
            } else {
                System.out.println("You made $0 today. Better luck tomorrow!");
            }
            day += 1;
        }
        //close scan object
        scan.close();


    }
}