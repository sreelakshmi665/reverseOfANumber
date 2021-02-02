package reverseOfANumber;

import java.util.Scanner;

public class revOrder {
	static int reve(int n)
	{
	int rev=0,rem;
	while(n>0)
	{
		rem=n%10;

		rev=rev*10+rem;
		n=n/10;
		}
		return rev;
		
	}
		public static void main(String[] args)
		{
			int n;
			
			Scanner q=new Scanner(System.in);
			n=q.nextInt();
			System.out.println("rev is: "+reve(n));
			q.close();
		
}
		
}
