package prog75;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Prog75{
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	City city = new City("Amogusland");
	Building building1 = new Building("Sasova", 1, 1000, city);
	Building building2 = new Building("Asasova", 1, 2600, city);
	
	ArrayList<String> res1 = new ArrayList();
	res1.add("sasov");
	res1.add("asasov");
	ArrayList<String> res2 = new ArrayList();
	res2.add("tosh");
	res2.add("irg");
	
	Apartment ap1 = new Apartment(1, 20, building1);
	ap1.addRes(res1);
	Apartment ap2 = new Apartment(1, 30, building2);
	ap2.addRes(res2);
	
	Office of1 = new Office(2, 45, building1, "NaoTou", "nasvainaya");
	Office of2 = new Office(2, 50, building2, "Tosh", "domKultury");
	
	FileIO FileIO = new FileIO();
	FileIO.saveCity(city, "data.txt");
	City city2 = FileIO.loadCity("data.txt");
	
	System.out.print(city2.report());
    }
}