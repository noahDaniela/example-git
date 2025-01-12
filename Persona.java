public class Persona {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private String correo;

    // Constructor vacío
    public Persona() {
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Método para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona = new Persona("Noah", 25, "noah@example.com");

        // Mostrar la información de la persona
        persona.mostrarInformacion();
    }
}
