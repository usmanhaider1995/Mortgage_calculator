package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage_Calculator {



    public static void main(String[] args) {

        double principle;
        double annual_Interest;
        double periods;
        double monthly_Payments;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the principle amount($1k - $1M) : ");
        principle=input.nextDouble();

        while (!(principle>1000 && principle<1000000)) {
            System.out.println("Enter the principle amount($1k - $1M) : ");
            principle = input.nextDouble();
        }

        System.out.println("Principle amount you have entered is : " + principle);




        System.out.println("Enter the annual interest amount : ");
        annual_Interest=input.nextDouble();
        while (!(annual_Interest>0))
        {
            System.out.println("Enter the annual interest amount : ");
            annual_Interest=input.nextDouble();

        }

        annual_Interest= (annual_Interest /12) / 100;
        System.out.println("Annual interset amount you have entered is : " + annual_Interest);


        System.out.println("Enter the total number of years between 1 & 30 : ");
        periods=input.nextDouble();
        while (!(periods>1 && periods<30))
        {
            System.out.println("Enter the total number of years between 1 & 30 : ");
            periods=input.nextDouble();

        }
        periods = periods *12;
        System.out.println("Total number of years you have entered is : " + periods);


        monthly_Payments = principle * ((annual_Interest* Math.pow(1+annual_Interest,periods))/(Math.pow(1 + annual_Interest, periods)-1));
        String  mortgage_format = NumberFormat.getCurrencyInstance().format(monthly_Payments);
        System.out.println("Monthly payment would be "+ mortgage_format);

    }

}





