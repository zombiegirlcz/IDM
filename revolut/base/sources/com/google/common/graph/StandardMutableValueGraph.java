package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
final class StandardMutableValueGraph<N, V> extends StandardValueGraph<N, V> implements MutableValueGraph<N, V> {
    private final ElementOrder<N> incidentEdgeOrder;

    public StandardMutableValueGraph(AbstractGraphBuilder<? super N> abstractGraphBuilder) {
        super(abstractGraphBuilder);
        this.incidentEdgeOrder = (ElementOrder<N>) abstractGraphBuilder.incidentEdgeOrder.cast();
    }

    private GraphConnections<N, V> addNodeInternal(N n3) {
        GraphConnections<N, V> graphConnectionsNewConnections = newConnections();
        Preconditions.checkState(this.nodeConnections.put(n3, graphConnectionsNewConnections) == null);
        return graphConnectionsNewConnections;
    }

    private GraphConnections<N, V> newConnections() {
        return isDirected() ? DirectedGraphConnections.of(this.incidentEdgeOrder) : UndirectedGraphConnections.of(this.incidentEdgeOrder);
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean addNode(N n3) {
        Preconditions.checkNotNull(n3, "node");
        if (containsNode(n3)) {
            return false;
        }
        addNodeInternal(n3);
        return true;
    }

    @Override // com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return this.incidentEdgeOrder;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public V putEdgeValue(N n3, N n39, V v) {
        Preconditions.checkNotNull(n3, "nodeU");
        Preconditions.checkNotNull(n39, "nodeV");
        Preconditions.checkNotNull(v, "value");
        if (!allowsSelfLoops()) {
            Preconditions.checkArgument(!n3.equals(n39), "Cannot add self-loop edge on node %s, as self-loops are not allowed. To construct a graph that allows self-loops, call allowsSelfLoops(true) on the Builder.", n3);
        }
        GraphConnections<N, V> graphConnectionsAddNodeInternal = this.nodeConnections.get(n3);
        if (graphConnectionsAddNodeInternal == null) {
            graphConnectionsAddNodeInternal = addNodeInternal(n3);
        }
        V vAddSuccessor = graphConnectionsAddNodeInternal.addSuccessor(n39, v);
        GraphConnections<N, V> graphConnectionsAddNodeInternal2 = this.nodeConnections.get(n39);
        if (graphConnectionsAddNodeInternal2 == null) {
            graphConnectionsAddNodeInternal2 = addNodeInternal(n39);
        }
        graphConnectionsAddNodeInternal2.addPredecessor(n3, v);
        if (vAddSuccessor == null) {
            long j2 = this.edgeCount + 1;
            this.edgeCount = j2;
            Graphs.checkPositive(j2);
        }
        return vAddSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public V removeEdge(N n3, N n39) {
        Preconditions.checkNotNull(n3, "nodeU");
        Preconditions.checkNotNull(n39, "nodeV");
        GraphConnections<N, V> graphConnections = this.nodeConnections.get(n3);
        GraphConnections<N, V> graphConnections2 = this.nodeConnections.get(n39);
        if (graphConnections == null || graphConnections2 == null) {
            return null;
        }
        V vRemoveSuccessor = graphConnections.removeSuccessor(n39);
        if (vRemoveSuccessor != null) {
            graphConnections2.removePredecessor(n3);
            long j2 = this.edgeCount - 1;
            this.edgeCount = j2;
            Graphs.checkNonNegative(j2);
        }
        return vRemoveSuccessor;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public boolean removeNode(N n3) {
        Preconditions.checkNotNull(n3, "node");
        GraphConnections graphConnections = (GraphConnections<N, V>) this.nodeConnections.get(n3);
        if (graphConnections == null) {
            return false;
        }
        if (allowsSelfLoops() && graphConnections.removeSuccessor(n3) != null) {
            graphConnections.removePredecessor(n3);
            this.edgeCount--;
        }
        UnmodifiableIterator it8 = ImmutableList.copyOf((Collection) graphConnections.successors()).iterator();
        while (it8.hasNext()) {
            E next = it8.next();
            GraphConnections<N, V> withoutCaching = this.nodeConnections.getWithoutCaching(next);
            Objects.requireNonNull(withoutCaching);
            withoutCaching.removePredecessor(n3);
            Objects.requireNonNull(graphConnections.removeSuccessor(next));
            this.edgeCount--;
        }
        if (isDirected()) {
            UnmodifiableIterator it9 = ImmutableList.copyOf((Collection) graphConnections.predecessors()).iterator();
            while (it9.hasNext()) {
                E next2 = it9.next();
                GraphConnections<N, V> withoutCaching2 = this.nodeConnections.getWithoutCaching(next2);
                Objects.requireNonNull(withoutCaching2);
                Preconditions.checkState(withoutCaching2.removeSuccessor(n3) != null);
                graphConnections.removePredecessor(next2);
                this.edgeCount--;
            }
        }
        this.nodeConnections.remove(n3);
        Graphs.checkNonNegative(this.edgeCount);
        return true;
    }

    @Override // com.google.common.graph.MutableValueGraph
    public V removeEdge(EndpointPair<N> endpointPair) {
        validateEndpoints(endpointPair);
        return removeEdge(endpointPair.nodeU(), endpointPair.nodeV());
    }

    @Override // com.google.common.graph.MutableValueGraph
    public V putEdgeValue(EndpointPair<N> endpointPair, V v) {
        validateEndpoints(endpointPair);
        return putEdgeValue(endpointPair.nodeU(), endpointPair.nodeV(), v);
    }
}
