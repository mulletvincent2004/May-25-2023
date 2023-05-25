package May252023;

public class Test extends Vehicles{
    public static void main(String args[]) {
    
    ToyotaVios car = new ToyotaVios();
    //ToyotaVios
    System.out.println("ToyotaVios: ");
    System.out.println(car.Speed);
    System.out.println(car.Color);
    System.out.println(car.Price);
    System.out.println(car.tireType);
    car.Drive();
    car.Stop();	
    
    u2Spy_Plane pln = new u2Spy_Plane();
    //U2spyplane
    System.out.println("---------------------------------------");
    System.out.println("U2 Spy Plane: ");
    System.out.println(pln.planeSpeed);
    System.out.println(pln.planeColor);
    System.out.println(pln.planePrice);
    System.out.println(pln.Wingspan);
    pln.Fly();
    pln.Stop();
    
    Fandango_Yacht ych = new Fandango_Yacht();
    //FandangoYacht
    System.out.println("----------------------------------------");
    System.out.println("Fandango Yacht: ");
    System.out.println(ych.yachtSpeed);
    System.out.println(ych.yachtColor);
    System.out.println(ych.yachtPrice);
    System.out.println(ych.MainSailColor);
    ych.Float();
    ych.Stop();
    }
    }
