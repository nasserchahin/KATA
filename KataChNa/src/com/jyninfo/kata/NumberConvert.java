package com.jyninfo.kata;

import java.io.Console;

public class NumberConvert {

	public static void main (String[] args)
	{
		System.out.println("************ Number Convert Begin ******** ");
		Console cnsl  = System.console(); 
        if (cnsl ==null) {    
		 System.out.println("No console available");    
		 return;       
		 }     
		 // Read line     
		 String str = cnsl.readLine(  "Enter number : ");  

		String p_input = str;
		StringBuilder p_output = new StringBuilder();
		int p_num = 0;
		if (null == p_input || "".equals(p_input) )
		{
			System.out.println("Could you verify your Input");
			System.exit(0);
		}
		try
		{
		 p_num = Integer.parseInt(p_input);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Could you verify your Input");
			System.exit(0);
		}
		
		if (p_num % 3 == 0 )
		{
			p_output.append("Gbsu");
		}
		
		if (p_num % 5 == 0 )
		{
			p_output.append("Ftb");
		}
		for (int i = 0;i< p_input.length();i++ )
		{
			if ('3' == p_input.charAt(i)) 
			{
				p_output.append("Gbsu");
			}
			
			if ('5' == p_input.charAt(i))
			{
				p_output.append("Ftb");
			}
			
			if ('7' == p_input.charAt(i))
			{
				p_output.append("Lai");
			}
		}
		
		
		if ("".equals(p_output.toString()))
		{
			p_output.append( p_input);
		}
		System.out.println( "the result is : "+ p_output );
		System.out.println("************ Number Convert End ******** ");
	}
}
