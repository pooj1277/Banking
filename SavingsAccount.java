/*
 * Author : Pooja Avhad
 * Program :Banking - Saving Account Annual and Monthly Interest rate Calculation
 */

package com.bridgelabz.banking;

public class SavingsAccount {
	static double annualInterestRate=0;
	private static double savingsBalance=0;	

	//constructor
	public SavingsAccount(double balance) {
		savingsBalance = balance;
	}
	
	public static void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
		System.out.println("new Interest Rate:" +newInterestRate);
	}
	public void calculateMonthlyInterest() {
		
		savingsBalance += (savingsBalance * annualInterestRate) /12;
		System.out.println("New Saving Balance : " +savingsBalance);
	}


	public static void main(String[] args) {
		System.out.println("Initial annualInterestRate:"+annualInterestRate+ "\n savingsBalance:"+savingsBalance);
		SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount(3000);
		System.out.println("Saving Balance for SAVER1:");
		saver1.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest();
		saver1.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest();
		
		System.out.println("\n Saving Balance for SAVER2:");
		saver2.modifyInterestRate(0.04);
		saver2.calculateMonthlyInterest();
		saver2.modifyInterestRate(0.05);
		saver2.calculateMonthlyInterest();
	}
}
