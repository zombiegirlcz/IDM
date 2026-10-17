package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableNetwork<N, E> extends StandardNetwork<N, E> implements MutableNetwork<N, E> {
    public StandardMutableNetwork(NetworkBuilder<? super N, ? super E> networkBuilder) {
        super(networkBuilder);
    }

    private NetworkConnections<N, E> addNodeInternal(N n3) {
        NetworkConnections<N, E> networkConnectionsNewConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n3, networkConnectionsNewConnections) == null);
        return networkConnectionsNewConnections;
    }

    private NetworkConnections<N, E> newConnections() {
        return isDirected() ? allowsParallelEdges() ? DirectedMultiNetworkConnections.of() : DirectedNetworkConnections.of() : allowsParallelEdges() ? UndirectedMultiNetworkConnections.of() : UndirectedNetworkConnections.of();
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(N n3, N n39, E e) {
        Preconditions.checkNotNull(n3, "nodeU");
        Preconditions.checkNotNull(n39, "nodeV");
        Preconditions.checkNotNull(e, "edge");
        if (containsEdge(e)) {
            EndpointPair<N> endpointPairIncidentNodes = incidentNodes(e);
            EndpointPair endpointPairOf = EndpointPair.of(this, n3, n39);
            Preconditions.checkArgument(endpointPairIncidentNodes.equals(endpointPairOf), "Edge %s already exists between the following nodes: %s, so it cannot be reused to connect the following nodes: %s.", e, endpointPairIncidentNodes, endpointPairOf);
            return false;
        }
        NetworkConnections<N, E> networkConnectionsAddNodeInternal = this.nodeConnections.get(n3);
        if (!allowsParallelEdges()) {
            Preconditions.checkArgument(networkConnectionsAddNodeInternal == null || !networkConnectionsAddNodeInternal.successors().contains(n39), "Nodes %s and %s are already connected by a different edge. To construct a graph that allows parallel edges, call allowsParallelEdges(true) on the Builder.", n3, n39);
        }
        boolean zEquals = n3.equals(n39);
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!zEquals, "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n3);
        }
        if (networkConnectionsAddNodeInternal == null) {
            networkConnectionsAddNodeInternal = addNodeInternal(n3);
        }
        networkConnectionsAddNodeInternal.addOutEdge(e, n39);
        NetworkConnections<N, E> networkConnectionsAddNodeInternal2 = this.nodeConnections.get(n39);
        if (networkConnectionsAddNodeInternal2 == null) {
            networkConnectionsAddNodeInternal2 = addNodeInternal(n39);
        }
        networkConnectionsAddNodeInternal2.addInEdge(e, n3, zEquals);
        this.edgeToReferenceNode.put(e, n3);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addNode(N n3) {
        Preconditions.checkNotNull(n3, "node");
        if (containsNode(n3)) {
            return false;
        }
        addNodeInternal(n3);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeEdge(E e) {
        Preconditions.checkNotNull(e, "edge");
        N n3 = this.edgeToReferenceNode.get(e);
        boolean z = false;
        if (n3 == null) {
            return false;
        }
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n3);
        Objects.requireNonNull(networkConnections);
        NetworkConnections<N, E> networkConnections2 = networkConnections;
        N nAdjacentNode = networkConnections2.adjacentNode(e);
        NetworkConnections<N, E> networkConnections3 = this.nodeConnections.get(nAdjacentNode);
        Objects.requireNonNull(networkConnections3);
        NetworkConnections<N, E> networkConnections4 = networkConnections3;
        networkConnections2.removeOutEdge(e);
        if (allowsSelfLoops() && n3.equals(nAdjacentNode)) {
            z = true;
        }
        networkConnections4.removeInEdge(e, z);
        this.edgeToReferenceNode.remove(e);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean removeNode(N n3) {
        Preconditions.checkNotNull(n3, "node");
        NetworkConnections<N, E> networkConnections = this.nodeConnections.get(n3);
        if (networkConnections == null) {
            return false;
        }
        UnmodifiableIterator<E> it8 = ImmutableList.copyOf((Collection) networkConnections.incidentEdges()).iterator();
        while (it8.hasNext()) {
            removeEdge(it8.next());
        }
        this.nodeConnections.remove(n3);
        return true;
    }

    @Override // com.google.common.graph.MutableNetwork
    public boolean addEdge(EndpointPair<N> endpointPair, E e) {
        validateEndpoints(endpointPair);
        return addEdge(endpointPair.nodeU(), endpointPair.nodeV(), e);
    }
}
