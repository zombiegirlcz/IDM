package com.google.common.graph;

import com.google.common.annotations.Beta;

/* JADX INFO: loaded from: classes17.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface MutableNetwork<N, E> extends Network<N, E> {
    boolean addEdge(EndpointPair<N> endpointPair, E e);

    boolean addEdge(N n3, N n39, E e);

    boolean addNode(N n3);

    boolean removeEdge(E e);

    boolean removeNode(N n3);
}
