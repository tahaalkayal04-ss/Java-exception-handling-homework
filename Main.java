class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class WorkshopRegistration {
    public void registerParticipant(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Registration denied for " + name + ": Must be at least 18 years old (provided age: " + age + ")");
        }
        System.out.println("Registration successful for " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        WorkshopRegistration w = new WorkshopRegistration();
        try {
            w.registerParticipant("Ali", 16);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
