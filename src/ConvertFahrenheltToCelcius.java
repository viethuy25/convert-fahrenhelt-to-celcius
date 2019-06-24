//Exercise 1//
public class ConvertFahrenheltToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahr,cel;
		fahr=100;
		final double const1= 5/9.0;
		final double const2= 32;
		cel = const1*(fahr-const2);
		System.out.println("The Celcius degree"
				+ " of " + fahr+ " Fahr is" 
				+ cel+ "degree");
	}

}
