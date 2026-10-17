package com.google.common.graph;

import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
interface NetworkConnections<N, E> {
    void addInEdge(E e, N n3, boolean z);

    void addOutEdge(E e, N n3);

    N adjacentNode(E e);

    Set<N> adjacentNodes();

    Set<E> edgesConnecting(N n3);

    Set<E> inEdges();

    Set<E> incidentEdges();

    Set<E> outEdges();

    Set<N> predecessors();

    N removeInEdge(E e, boolean z);

    N removeOutEdge(E e);

    Set<N> successors();
}
