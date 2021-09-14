package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        Scanner numInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);
        double tax = 0;
        double total = 0;

        // Calculates tax and total
        // If state is WI add a tax
        System.out.print("What is the order amount? ");
        double orderAmt = numInput.nextDouble();
        System.out.print("What is the state? ");
        String state = stringInput.nextLine();

        if (state.equals("WI"))
        {
            tax = 0.055 * orderAmt;
        }

        total = orderAmt + tax;

        System.out.format("The subtotal is $%.2f. \nThe tax is $%.2f. \nThe total is $%.2f. \n", orderAmt, tax, total);
    }
}
