package br.com.edukacode.api;
import lombok.*;
import jakarta.persistence.*;

@Table(name="tbgenero")
@Entity(name="Genero")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Genero {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String nome;
}
