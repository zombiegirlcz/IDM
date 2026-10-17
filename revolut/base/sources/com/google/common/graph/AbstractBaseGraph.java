package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.AbstractBaseGraph;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
abstract class AbstractBaseGraph<N> implements BaseGraph<N> {

    /* JADX INFO: renamed from: com.google.common.graph.AbstractBaseGraph$2, reason: invalid class name */
    public class AnonymousClass2 extends IncidentEdgeSet<N> {
        public AnonymousClass2(BaseGraph baseGraph, Object obj2) {
            super(baseGraph, obj2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$0(Object obj2) {
            return EndpointPair.ordered(obj2, this.node);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$1(Object obj2) {
            return EndpointPair.ordered(this.node, obj2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ EndpointPair lambda$iterator$2(Object obj2) {
            return EndpointPair.unordered(this.node, obj2);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public UnmodifiableIterator<EndpointPair<N>> iterator() {
            if (!this.graph.isDirected()) {
                final int i = 2;
                return Iterators.unmodifiableIterator(Iterators.transform(this.graph.adjacentNodes(this.node).iterator(), new Function(this) { // from class: com.google.common.graph.d

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f49251b;

                    {
                        this.f49251b = this;
                    }

                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj2) {
                        switch (i) {
                            case 0:
                                return this.f49251b.lambda$iterator$0(obj2);
                            case 1:
                                return this.f49251b.lambda$iterator$1(obj2);
                            default:
                                return this.f49251b.lambda$iterator$2(obj2);
                        }
                    }
                }));
            }
            final int i2 = 0;
            final int i3 = 1;
            return Iterators.unmodifiableIterator(Iterators.concat(Iterators.transform(this.graph.predecessors((Object) this.node).iterator(), new Function(this) { // from class: com.google.common.graph.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f49251b;

                {
                    this.f49251b = this;
                }

                @Override // com.google.common.base.Function
                public final Object apply(Object obj2) {
                    switch (i2) {
                        case 0:
                            return this.f49251b.lambda$iterator$0(obj2);
                        case 1:
                            return this.f49251b.lambda$iterator$1(obj2);
                        default:
                            return this.f49251b.lambda$iterator$2(obj2);
                    }
                }
            }), Iterators.transform(Sets.difference(this.graph.successors((Object) this.node), ImmutableSet.of(this.node)).iterator(), new Function(this) { // from class: com.google.common.graph.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AbstractBaseGraph.AnonymousClass2 f49251b;

                {
                    this.f49251b = this;
                }

                @Override // com.google.common.base.Function
                public final Object apply(Object obj2) {
                    switch (i3) {
                        case 0:
                            return this.f49251b.lambda$iterator$0(obj2);
                        case 1:
                            return this.f49251b.lambda$iterator$1(obj2);
                        default:
                            return this.f49251b.lambda$iterator$2(obj2);
                    }
                }
            })));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$nodeInvalidatableSet$0(Object obj2) {
        return Boolean.valueOf(nodes().contains(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nodeInvalidatableSet$1(Object obj2) {
        return String.format("Node %s that was used to generate this set is no longer in the graph.", obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$nodePairInvalidatableSet$2(Object obj2, Object obj3) {
        return Boolean.valueOf(nodes().contains(obj2) && nodes().contains(obj3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$nodePairInvalidatableSet$3(Object obj2, Object obj3) {
        return String.format("Node %s or node %s that were used to generate this set are no longer in the graph.", obj2, obj3);
    }

    @Override // com.google.common.graph.BaseGraph
    public int degree(N n3) {
        if (isDirected()) {
            return IntMath.saturatedAdd(predecessors((Object) n3).size(), successors((Object) n3).size());
        }
        Set<N> setAdjacentNodes = adjacentNodes(n3);
        return IntMath.saturatedAdd(setAdjacentNodes.size(), (allowsSelfLoops() && setAdjacentNodes.contains(n3)) ? 1 : 0);
    }

    public long edgeCount() {
        Iterator<N> it8 = nodes().iterator();
        long jDegree = 0;
        while (it8.hasNext()) {
            jDegree += (long) degree(it8.next());
        }
        Preconditions.checkState((1 & jDegree) == 0);
        return jDegree >>> 1;
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> edges() {
        return new AbstractSet<EndpointPair<N>>() { // from class: com.google.common.graph.AbstractBaseGraph.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj2) {
                if (!(obj2 instanceof EndpointPair)) {
                    return false;
                }
                EndpointPair<?> endpointPair = (EndpointPair) obj2;
                return AbstractBaseGraph.this.isOrderingCompatible(endpointPair) && AbstractBaseGraph.this.nodes().contains(endpointPair.nodeU()) && AbstractBaseGraph.this.successors(endpointPair.nodeU()).contains(endpointPair.nodeV());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj2) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return Ints.saturatedCast(AbstractBaseGraph.this.edgeCount());
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<EndpointPair<N>> iterator() {
                return EndpointPairIterator.of(AbstractBaseGraph.this);
            }
        };
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(N n3, N n39) {
        Preconditions.checkNotNull(n3);
        Preconditions.checkNotNull(n39);
        return nodes().contains(n3) && successors((Object) n3).contains(n39);
    }

    @Override // com.google.common.graph.BaseGraph
    public int inDegree(N n3) {
        return isDirected() ? predecessors((Object) n3).size() : degree(n3);
    }

    @Override // com.google.common.graph.BaseGraph
    public ElementOrder<N> incidentEdgeOrder() {
        return ElementOrder.unordered();
    }

    @Override // com.google.common.graph.BaseGraph
    public Set<EndpointPair<N>> incidentEdges(N n3) {
        Preconditions.checkNotNull(n3);
        Preconditions.checkArgument(nodes().contains(n3), "Node %s is not an element of this graph.", n3);
        return (Set<EndpointPair<N>>) nodeInvalidatableSet(new AnonymousClass2(this, n3), n3);
    }

    public final boolean isOrderingCompatible(EndpointPair<?> endpointPair) {
        return endpointPair.isOrdered() == isDirected();
    }

    public final <T> Set<T> nodeInvalidatableSet(Set<T> set, N n3) {
        return InvalidatableSet.of((Set) set, (Supplier<Boolean>) new b(this, n3), (Supplier<String>) new c(n3, 0));
    }

    public final <T> Set<T> nodePairInvalidatableSet(Set<T> set, N n3, N n39) {
        return InvalidatableSet.of((Set) set, (Supplier<Boolean>) new a(this, 0, n3, n39), (Supplier<String>) new b(n3, n39, 0));
    }

    @Override // com.google.common.graph.BaseGraph
    public int outDegree(N n3) {
        return isDirected() ? successors((Object) n3).size() : degree(n3);
    }

    public final void validateEndpoints(EndpointPair<?> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        Preconditions.checkArgument(isOrderingCompatible(endpointPair), "Mismatch: endpoints' ordering is not compatible with directionality of the graph");
    }

    @Override // com.google.common.graph.BaseGraph
    public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
        Preconditions.checkNotNull(endpointPair);
        if (!isOrderingCompatible(endpointPair)) {
            return false;
        }
        N nNodeU = endpointPair.nodeU();
        return nodes().contains(nNodeU) && successors((Object) nNodeU).contains(endpointPair.nodeV());
    }
}
