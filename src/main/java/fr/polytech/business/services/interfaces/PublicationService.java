package fr.polytech.business.services.interfaces;

/**
 * Polytech Marseille
 * Case 925 - 163, avenue de Luminy
 * 13288 Marseille CEDEX 9
 * <p>
 * Ce fichier est l'oeuvre d'eleves de Polytech Marseille. Il ne peut etre
 * reproduit, utilise ou modifie sans l'avis express de ses auteurs.
 */

/**
 * @author Sudreau
 */

import fr.polytech.business.Post;

import java.util.List;

public interface PublicationService {
    void post(Post toPost);

    Post getById(long id);

    List<Post> fetchAll();
}
