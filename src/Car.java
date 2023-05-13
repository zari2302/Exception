public class Car implements AutoCloseable {
    public void drive(){
        System.out.println("машина жүрүп жатат");
    }

    @Override
    public void close() {
        System.out.println("Машина жабылып жатат");
    }
}
