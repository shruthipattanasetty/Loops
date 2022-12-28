package com.perscholas.loops_303_3_1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		question1();
		question2();
		question3();

	}
 
	public static void question1() {
		//Write a program that uses nested for loops to print a multiplication table.
		for (int x = 1;x<13;x++) {
			for (int y =1;y<13;y++) {
				System.out.printf("%4d", x*y);	
			}
			System.out.println();
		}
		System.out.println("_________________________________________________________________");
		System.out.println();
	}
	
	public static void question2() {
		/*Write a program that prompts the user to enter two positive integers, 
		 * and find their greatest common divisor (GCD).
		 * Examples:
			Enter 2 and 4. The gcd is 2. 
			Enter 16 and 24.  The gcd is 8. 
			How do you find the gcd? 
			Name the two input integers n1 and n2. 
			You know number 1 is a common divisor, but it may not be the gcd. 
			Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, 
			until k is greater than n1 or n2.
		 */
		
		int x,y, gcd = 1;
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the First Number: ");  
		x = sc.nextInt();     
		System.out.print("Enter the Second Number: ");  
		y = sc.nextInt();
		for(int i = 1; i <= x && i <= y; i++)  
		{    
		if(x%i==0 && y%i==0)  
		gcd = i;  	
		}  		
		System.out.printf("GCD of %d and %d is: %d", x, y, gcd); 
		System.out.println();
		System.out.println("_________________________________________________________________");
		}
	
	public static void question3() {
		
		/*Suppose the tuition for a university is $10,000 for the current year 
		 * and increases by 7 percent every year. 
		 * In how many years will the tuition be doubled?
		 */
		
		double tuition =10000;
		int x=0;
		while (tuition<=20000) {
			tuition*=1.07;
			x++;			
		}
		System.out.println("The tuition will be doubled in " + x + " years");
		System.out.println(tuition);
	}
	}

