package Problema1;
import java.time.LocalDate;
public class Solicitud {
        private String nombre;
        private LocalDate fechaSolicitud;
        private LocalDate fechaAutorizacion;
        private String compania;
        private Composicion composicion;

        public Solicitud(String nombre, LocalDate fechaSolicitud, LocalDate fechaAutorizacion, String compania, Composicion composicion) {
            if (fechaAutorizacion.isBefore(fechaSolicitud)){throw new IllegalArgumentException("Error en la fecha de autorizacion");}
            this.nombre = nombre;
            this.fechaSolicitud = fechaSolicitud;
            this.fechaAutorizacion = fechaAutorizacion;
            this.compania = compania;
            this.composicion = composicion;

            composicion.addSolicitud(this);
        }

        public String getNombre() {
            return nombre;
        }

        public LocalDate getFechaSolicitud() {
            return fechaSolicitud;
        }

        public LocalDate getFechaAutorizacion() {
            return fechaAutorizacion;
        }

        public String getCompania() {
            return compania;
        }

        @Override
        public String toString() {
            return "Solicitud{" +
                    "Nombre='" + nombre + '\'' +
                    ", Fecha de Solicitud=" + fechaSolicitud +
                    ", Fecha de Autorizacion=" + fechaAutorizacion +
                    ", Compania='" + compania + '\'' +
                    '}';
        }
    }
