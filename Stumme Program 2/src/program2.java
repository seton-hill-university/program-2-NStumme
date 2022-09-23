// Application:		Program 2
// Name:			Nicky Stumme
// GitHub User:		NStumme
// Date:			September 23, 2022
// Version: 		1.0
// Description:		Scanner and if/else
import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Activate keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please answer the following questions.");
		System.out.println();
		//Get first number
		System.out.print("What is your first number? Number 1: ");
		int num1 = keyboard.nextInt();
		
		//Get second number
		System.out.print("What is your second number? Number 2: ");
		int num2 = keyboard.nextInt();
		
		//Get third number
		System.out.print("What is your third number? Number 3: ");
		int num3 = keyboard.nextInt();
		
		//Menu time
		System.out.println();
		System.out.println("\t Menu");
		System.out.println();
		System.out.println("Please choose an action to be performed on your first and second number.");
		System.out.println("1.) Add");
		System.out.println("2.) Subtract");
		System.out.println("3.) Multiply");
		System.out.println("4.) Divide");
		System.out.println("5.) Exit");
		System.out.println();
		System.out.print("What is your choice? ");
		
		
		//Switch statements
		switch (keyboard.nextInt())
		{ 
		case 1:
			int anum = num1 + num2;
			
			System.out.println();
			System.out.println("Your numbers added equal: " + anum);
			System.out.println();
			
			if (anum > num3)
			{
				System.out.println(anum + " is greater than " + num3);
			}
			else
			{
				System.out.println(anum + " is not greater than " + num3);
			}
			break;
			
		case 2:
			int snum = num1 - num2;
			
			System.out.println();
			System.out.println("Your numbers subtracted equal: " + snum);
			System.out.println();
			
			if (snum > num3)
			{
				System.out.println(snum + " is greater than " + num3);
			}
			else
			{
				System.out.println(snum + " is not greater than " + num3);
			}
			break;
			
		case 3:
			int mnum = num1 * num2;
			
			System.out.println();
			System.out.println("Your numbers multiplied equal: " + mnum);
			System.out.println();
			
			if (mnum > num3)
			{
				System.out.println(mnum + " is greater than " + num3);
			}
			else
			{
				System.out.println(mnum + " is not greater than " + num3);
			}
			
			break;
			
		case 4:
			int dnum = num1/num2;
			
			System.out.println();
			System.out.println("Your numbers divided equals: " + dnum);
			System.out.println();
			
			if (dnum > num3)
			{
				System.out.println(dnum + " is greater than " + num3);
			}
			else
			{
				System.out.println(dnum + " is not greater than " + num3);
			}
			
			break;	
			
		case 5:
			System.out.println();
			System.out.println("Have a nice day!");
			
			break;
			
		}
		// Using if-else for number greater or smaller than third number

	
		}
		
		
	}

