package com.google.common.graph;

import com.google.common.annotations.Beta;

/* JADX INFO: loaded from: classes17.dex */
@Beta
@ElementTypesAreNonnullByDefault
public interface MutableGraph<N> extends Graph<N> {
    boolean addNode(N n3);

    boolean putEdge(EndpointPair<N> endpointPair);

    boolean putEdge(N n3, N n39);

    boolean removeEdge(EndpointPair<N> endpointPair);

    boolean removeEdge(N n3, N n39);

    boolean removeNode(N n3);
}
