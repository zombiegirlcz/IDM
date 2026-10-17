package com.google.common.graph;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
interface GraphConnections<N, V> {
    void addPredecessor(N n3, V v);

    V addSuccessor(N n3, V v);

    Set<N> adjacentNodes();

    Iterator<EndpointPair<N>> incidentEdgeIterator(N n3);

    Set<N> predecessors();

    void removePredecessor(N n3);

    V removeSuccessor(N n3);

    Set<N> successors();

    V value(N n3);
}
