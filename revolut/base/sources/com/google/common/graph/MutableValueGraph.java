package com.google.common.graph;

import com.google.common.annotations.Beta;

/* JADX INFO: loaded from: classes17.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface MutableValueGraph<N, V> extends ValueGraph<N, V> {
    boolean addNode(N n3);

    V putEdgeValue(EndpointPair<N> endpointPair, V v);

    V putEdgeValue(N n3, N n39, V v);

    V removeEdge(EndpointPair<N> endpointPair);

    V removeEdge(N n3, N n39);

    boolean removeNode(N n3);
}
