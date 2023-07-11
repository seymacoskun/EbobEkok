package EbEk;
import java.util.Scanner;

public class EbobEkok
{
	public static void main(String[] args)
	{
		int n1; int n2; int i=1; int ebob=1; int ekok=1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("n1 degerini giriniz: ");
		n1 = input.nextInt();
		System.out.println("n2 degerini giriniz: ");
		n2 = input.nextInt();
		
		while (i <= n1) 
		{
			if(n1%i==0 && n2%i==0) 
			{
				ebob=i;
			}
			i++;
		}
		System.out.println("Ebob: " +ebob);
		
		
		while (i<=n1*n2)
		{
			if(i%n1==0 && i%n2==0) 
			{
				ekok=i;
				break;
			}
			i++;
		}
		System.out.println("Ekok: " +ekok);
	}

}
