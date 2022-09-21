public class Main {
    public static void main(String[] args){
        Flat mieszkanie1=new Flat(5, "Berlin", true);
        System.out.println(mieszkanie1.getFloor());
        System.out.println(mieszkanie1.getCity());
        System.out.println(mieszkanie1.balcony());
        mieszkanie1.setBalcony(false);
        System.out.println(mieszkanie1.getBalcony());
        mieszkanie1.setCity("Amsterdam");
        Flat mieszkanie2=new Flat(10, "Wroclaw", true);
        mieszkanie2.setFloor(0);
        System.out.println(mieszkanie2.getFloor());
    }

}