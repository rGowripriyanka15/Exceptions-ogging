package com.epam.epamtask5;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import com.epam.logging.Simple_Compound_Interest;

public class CalculateInterest {
	public static Logger LOGGER = LogManager.getLogger(CalculateInterest.class);
	public static void CalInterest() {
//		PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
		Scanner sc = new Scanner(System.in);
		LOGGER.info("Enter the principle amount: ");
		try {
			double principal = sc.nextDouble();
			LOGGER.info("Enter the time period(in years) : ");
			double timePeriod = sc.nextDouble();
			LOGGER.info("Enter the rate: ");
			double rate = sc.nextDouble();
			LOGGER.info("The simple interest = " +((principal * timePeriod * rate) / 100));
			LOGGER.info("The compound interest = " +((principal * Math.pow(1 + (rate / 100), timePeriod)) - principal));
			
		} catch (Exception e) {
			LOGGER.info("Please enter a valid input!");
			
		}
		LOGGER.info("*******************************************");
		
		
	}
		
}