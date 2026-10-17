package com.google.common.graph;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.ElementOrder;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
final class DirectedGraphConnections<N, V> implements GraphConnections<N, V> {
    private static final Object PRED = new Object();
    private final Map<N, Object> adjacentNodeValues;
    private final List<NodeConnection<N>> orderedNodeConnections;
    private int predecessorCount;
    private int successorCount;

    /* JADX INFO: renamed from: com.google.common.graph.DirectedGraphConnections$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

        static {
            int[] iArr = new int[ElementOrder.Type.values().length];
            $SwitchMap$com$google$common$graph$ElementOrder$Type = iArr;
            try {
                iArr[ElementOrder.Type.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$graph$ElementOrder$Type[ElementOrder.Type.STABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class NodeConnection<N> {
        final N node;

        public static final class Pred<N> extends NodeConnection<N> {
            public Pred(N n3) {
                super(n3);
            }

            public boolean equals(Object obj2) {
                if (obj2 instanceof Pred) {
                    return this.node.equals(((Pred) obj2).node);
                }
                return false;
            }

            public int hashCode() {
                return this.node.hashCode() + Pred.class.hashCode();
            }
        }

        public static final class Succ<N> extends NodeConnection<N> {
            public Succ(N n3) {
                super(n3);
            }

            public boolean equals(Object obj2) {
                if (obj2 instanceof Succ) {
                    return this.node.equals(((Succ) obj2).node);
                }
                return false;
            }

            public int hashCode() {
                return this.node.hashCode() + Succ.class.hashCode();
            }
        }

        public NodeConnection(N n3) {
            this.node = (N) Preconditions.checkNotNull(n3);
        }
    }

    public static final class PredAndSucc {
        private final Object successorValue;

        public PredAndSucc(Object obj2) {
            this.successorValue = obj2;
        }
    }

    private DirectedGraphConnections(Map<N, Object> map, List<NodeConnection<N>> list, int i, int i2) {
        this.adjacentNodeValues = (Map) Preconditions.checkNotNull(map);
        this.orderedNodeConnections = list;
        this.predecessorCount = Graphs.checkNonNegative(i);
        this.successorCount = Graphs.checkNonNegative(i2);
        Preconditions.checkState(i <= map.size() && i2 <= map.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isPredecessor(Object obj2) {
        return obj2 == PRED || (obj2 instanceof PredAndSucc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isSuccessor(Object obj2) {
        return (obj2 == PRED || obj2 == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$0(Object obj2, Object obj3) {
        return EndpointPair.ordered(obj3, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ EndpointPair lambda$incidentEdgeIterator$2(Object obj2, NodeConnection nodeConnection) {
        return nodeConnection instanceof NodeConnection.Succ ? EndpointPair.ordered(obj2, nodeConnection.node) : EndpointPair.ordered(nodeConnection.node, obj2);
    }

    public static <N, V> DirectedGraphConnections<N, V> of(ElementOrder<N> elementOrder) {
        ArrayList arrayList;
        int i = AnonymousClass5.$SwitchMap$com$google$common$graph$ElementOrder$Type[elementOrder.type().ordinal()];
        if (i == 1) {
            arrayList = null;
        } else {
            if (i != 2) {
                throw new AssertionError(elementOrder.type());
            }
            arrayList = new ArrayList();
        }
        return new DirectedGraphConnections<>(new HashMap(4, 1.0f), arrayList, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <N, V> DirectedGraphConnections<N, V> ofImmutable(N n3, Iterable<EndpointPair<N>> iterable, Function<N, V> function) {
        Preconditions.checkNotNull(n3);
        Preconditions.checkNotNull(function);
        HashMap map = new HashMap();
        ImmutableList.Builder builder = ImmutableList.builder();
        int i = 0;
        int i2 = 0;
        for (EndpointPair<N> endpointPair : iterable) {
            if (endpointPair.nodeU().equals(n3) && endpointPair.nodeV().equals(n3)) {
                map.put(n3, new PredAndSucc(function.apply(n3)));
                builder.add(new NodeConnection.Pred(n3));
                builder.add(new NodeConnection.Succ(n3));
                i++;
            } else if (endpointPair.nodeV().equals(n3)) {
                N nNodeU = endpointPair.nodeU();
                Object objPut = map.put(nNodeU, PRED);
                if (objPut != null) {
                    map.put(nNodeU, new PredAndSucc(objPut));
                }
                builder.add(new NodeConnection.Pred(nNodeU));
                i++;
            } else {
                Preconditions.checkArgument(endpointPair.nodeU().equals(n3));
                N nNodeV = endpointPair.nodeV();
                V vApply = function.apply(nNodeV);
                Object objPut2 = map.put(nNodeV, vApply);
                if (objPut2 != null) {
                    Preconditions.checkArgument(objPut2 == PRED);
                    map.put(nNodeV, new PredAndSucc(vApply));
                }
                builder.add(new NodeConnection.Succ(nNodeV));
            }
            i2++;
        }
        return new DirectedGraphConnections<>(map, builder.build(), i, i2);
    }

    @Override // com.google.common.graph.GraphConnections
    public void addPredecessor(N n3, V v) {
        Map<N, Object> map = this.adjacentNodeValues;
        Object obj2 = PRED;
        Object objPut = map.put(n3, obj2);
        if (objPut != null) {
            if (objPut instanceof PredAndSucc) {
                this.adjacentNodeValues.put(n3, objPut);
                return;
            } else if (objPut == obj2) {
                return;
            } else {
                this.adjacentNodeValues.put(n3, new PredAndSucc(objPut));
            }
        }
        int i = this.predecessorCount + 1;
        this.predecessorCount = i;
        Graphs.checkPositive(i);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.add(new NodeConnection.Pred(n3));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    public V addSuccessor(N n3, V v) {
        Object obj2 = (V) this.adjacentNodeValues.put(n3, v);
        if (obj2 == null) {
            obj2 = (V) null;
        } else if (obj2 instanceof PredAndSucc) {
            this.adjacentNodeValues.put(n3, new PredAndSucc(v));
            obj2 = (V) ((PredAndSucc) obj2).successorValue;
        } else if (obj2 == PRED) {
            this.adjacentNodeValues.put(n3, new PredAndSucc(v));
            obj2 = (V) null;
        }
        if (obj2 == null) {
            int i = this.successorCount + 1;
            this.successorCount = i;
            Graphs.checkPositive(i);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.add(new NodeConnection.Succ(n3));
            }
        }
        if (obj2 == null) {
            return null;
        }
        return (V) obj2;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> adjacentNodes() {
        return this.orderedNodeConnections == null ? Collections.unmodifiableSet(this.adjacentNodeValues.keySet()) : new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj2) {
                return DirectedGraphConnections.this.adjacentNodeValues.containsKey(obj2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.adjacentNodeValues.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                final Iterator it8 = DirectedGraphConnections.this.orderedNodeConnections.iterator();
                final HashSet hashSet = new HashSet();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.1.1
                    final /* synthetic */ AnonymousClass1 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (it8.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it8.next();
                            if (hashSet.add(nodeConnection.node)) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Iterator<EndpointPair<N>> incidentEdgeIterator(N n3) {
        Preconditions.checkNotNull(n3);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        final Iterator itConcat = list == null ? Iterators.concat(Iterators.transform(predecessors().iterator(), new h(n3, 0)), Iterators.transform(successors().iterator(), new h(n3, 1))) : Iterators.transform(list.iterator(), new h(n3, 2));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        return new AbstractIterator<EndpointPair<N>>(this) { // from class: com.google.common.graph.DirectedGraphConnections.4
            final /* synthetic */ DirectedGraphConnections this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.AbstractIterator
            public EndpointPair<N> computeNext() {
                while (itConcat.hasNext()) {
                    EndpointPair<N> endpointPair = (EndpointPair) itConcat.next();
                    if (!endpointPair.nodeU().equals(endpointPair.nodeV()) || !atomicBoolean.getAndSet(true)) {
                        return endpointPair;
                    }
                }
                return endOfData();
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> predecessors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.2
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj2) {
                return DirectedGraphConnections.isPredecessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj2));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.predecessorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                    final Iterator it8 = DirectedGraphConnections.this.adjacentNodeValues.entrySet().iterator();
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.1
                        final /* synthetic */ AnonymousClass2 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        public N computeNext() {
                            while (it8.hasNext()) {
                                Map.Entry entry = (Map.Entry) it8.next();
                                if (DirectedGraphConnections.isPredecessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final Iterator it9 = DirectedGraphConnections.this.orderedNodeConnections.iterator();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.2.2
                    final /* synthetic */ AnonymousClass2 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (it9.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it9.next();
                            if (nodeConnection instanceof NodeConnection.Pred) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    @Override // com.google.common.graph.GraphConnections
    public void removePredecessor(N n3) {
        Preconditions.checkNotNull(n3);
        Object obj2 = this.adjacentNodeValues.get(n3);
        if (obj2 == PRED) {
            this.adjacentNodeValues.remove(n3);
        } else if (!(obj2 instanceof PredAndSucc)) {
            return;
        } else {
            this.adjacentNodeValues.put(n3, ((PredAndSucc) obj2).successorValue);
        }
        int i = this.predecessorCount - 1;
        this.predecessorCount = i;
        Graphs.checkNonNegative(i);
        List<NodeConnection<N>> list = this.orderedNodeConnections;
        if (list != null) {
            list.remove(new NodeConnection.Pred(n3));
        }
    }

    @Override // com.google.common.graph.GraphConnections
    public V removeSuccessor(Object obj2) {
        Object obj3;
        Preconditions.checkNotNull(obj2);
        Object obj4 = (V) this.adjacentNodeValues.get(obj2);
        if (obj4 == null || obj4 == (obj3 = PRED)) {
            obj4 = (V) null;
        } else if (obj4 instanceof PredAndSucc) {
            this.adjacentNodeValues.put(obj2, obj3);
            obj4 = (V) ((PredAndSucc) obj4).successorValue;
        } else {
            this.adjacentNodeValues.remove(obj2);
        }
        if (obj4 != null) {
            int i = this.successorCount - 1;
            this.successorCount = i;
            Graphs.checkNonNegative(i);
            List<NodeConnection<N>> list = this.orderedNodeConnections;
            if (list != null) {
                list.remove(new NodeConnection.Succ(obj2));
            }
        }
        if (obj4 == null) {
            return null;
        }
        return (V) obj4;
    }

    @Override // com.google.common.graph.GraphConnections
    public Set<N> successors() {
        return new AbstractSet<N>() { // from class: com.google.common.graph.DirectedGraphConnections.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj2) {
                return DirectedGraphConnections.isSuccessor(DirectedGraphConnections.this.adjacentNodeValues.get(obj2));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DirectedGraphConnections.this.successorCount;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<N> iterator() {
                if (DirectedGraphConnections.this.orderedNodeConnections == null) {
                    final Iterator it8 = DirectedGraphConnections.this.adjacentNodeValues.entrySet().iterator();
                    return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.1
                        final /* synthetic */ AnonymousClass3 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override // com.google.common.collect.AbstractIterator
                        public N computeNext() {
                            while (it8.hasNext()) {
                                Map.Entry entry = (Map.Entry) it8.next();
                                if (DirectedGraphConnections.isSuccessor(entry.getValue())) {
                                    return (N) entry.getKey();
                                }
                            }
                            return endOfData();
                        }
                    };
                }
                final Iterator it9 = DirectedGraphConnections.this.orderedNodeConnections.iterator();
                return new AbstractIterator<N>(this) { // from class: com.google.common.graph.DirectedGraphConnections.3.2
                    final /* synthetic */ AnonymousClass3 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public N computeNext() {
                        while (it9.hasNext()) {
                            NodeConnection nodeConnection = (NodeConnection) it9.next();
                            if (nodeConnection instanceof NodeConnection.Succ) {
                                return nodeConnection.node;
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.graph.GraphConnections
    public V value(N n3) {
        Preconditions.checkNotNull(n3);
        V v = (V) this.adjacentNodeValues.get(n3);
        if (v == PRED) {
            return null;
        }
        return v instanceof PredAndSucc ? (V) ((PredAndSucc) v).successorValue : v;
    }
}
