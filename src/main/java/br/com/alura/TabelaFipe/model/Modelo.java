package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelo(List<Dados> modelos) {
}
