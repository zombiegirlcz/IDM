package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
@Beta
@ElementTypesAreNonnullByDefault
public abstract class Traverser<N> {
    private final SuccessorsFunction<N> successorFunction;

    public enum InsertionOrder {
        FRONT { // from class: com.google.common.graph.Traverser.InsertionOrder.1
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t2) {
                deque.addFirst(t2);
            }
        },
        BACK { // from class: com.google.common.graph.Traverser.InsertionOrder.2
            @Override // com.google.common.graph.Traverser.InsertionOrder
            public <T> void insertInto(Deque<T> deque, T t2) {
                deque.addLast(t2);
            }
        };

        public abstract <T> void insertInto(Deque<T> deque, T t2);
    }

    public static abstract class Traversal<N> {
        final SuccessorsFunction<N> successorFunction;

        public Traversal(SuccessorsFunction<N> successorsFunction) {
            this.successorFunction = successorsFunction;
        }

        public static <N> Traversal<N> inGraph(SuccessorsFunction<N> successorsFunction) {
            final HashSet hashSet = new HashSet();
            return new Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.1
                @Override // com.google.common.graph.Traverser.Traversal
                public N visitNext(Deque<Iterator<? extends N>> deque) {
                    Iterator<? extends N> first = deque.getFirst();
                    while (first.hasNext()) {
                        N next = first.next();
                        Objects.requireNonNull(next);
                        if (hashSet.add(next)) {
                            return next;
                        }
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        public static <N> Traversal<N> inTree(SuccessorsFunction<N> successorsFunction) {
            return new Traversal<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.Traversal.2
                @Override // com.google.common.graph.Traverser.Traversal
                public N visitNext(Deque<Iterator<? extends N>> deque) {
                    Iterator<? extends N> first = deque.getFirst();
                    if (first.hasNext()) {
                        return (N) Preconditions.checkNotNull(first.next());
                    }
                    deque.removeFirst();
                    return null;
                }
            };
        }

        private Iterator<N> topDown(Iterator<? extends N> it8, final InsertionOrder insertionOrder) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(it8);
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.3
                final /* synthetic */ Traversal this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    do {
                        N n3 = (N) this.this$0.visitNext(arrayDeque);
                        if (n3 != null) {
                            Iterator<? extends N> it9 = this.this$0.successorFunction.successors(n3).iterator();
                            if (it9.hasNext()) {
                                insertionOrder.insertInto(arrayDeque, it9);
                            }
                            return n3;
                        }
                    } while (!arrayDeque.isEmpty());
                    return endOfData();
                }
            };
        }

        public final Iterator<N> breadthFirst(Iterator<? extends N> it8) {
            return topDown(it8, InsertionOrder.BACK);
        }

        public final Iterator<N> postOrder(Iterator<? extends N> it8) {
            final ArrayDeque arrayDeque = new ArrayDeque();
            final ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.add(it8);
            return new AbstractIterator<N>(this) { // from class: com.google.common.graph.Traverser.Traversal.4
                final /* synthetic */ Traversal this$0;

                {
                    this.this$0 = this;
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.common.collect.AbstractIterator
                public N computeNext() {
                    while (true) {
                        N n3 = (N) this.this$0.visitNext(arrayDeque2);
                        if (n3 == null) {
                            return !arrayDeque.isEmpty() ? (N) arrayDeque.pop() : endOfData();
                        }
                        Iterator<? extends N> it9 = this.this$0.successorFunction.successors(n3).iterator();
                        if (!it9.hasNext()) {
                            return n3;
                        }
                        arrayDeque2.addFirst(it9);
                        arrayDeque.push(n3);
                    }
                }
            };
        }

        public final Iterator<N> preOrder(Iterator<? extends N> it8) {
            return topDown(it8, InsertionOrder.FRONT);
        }

        public abstract N visitNext(Deque<Iterator<? extends N>> deque);
    }

    public static <N> Traverser<N> forGraph(final SuccessorsFunction<N> successorsFunction) {
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.1
            @Override // com.google.common.graph.Traverser
            public Traversal<N> newTraversal() {
                return Traversal.inGraph(successorsFunction);
            }
        };
    }

    public static <N> Traverser<N> forTree(final SuccessorsFunction<N> successorsFunction) {
        if (successorsFunction instanceof BaseGraph) {
            Preconditions.checkArgument(((BaseGraph) successorsFunction).isDirected(), "Undirected graphs can never be trees.");
        }
        if (successorsFunction instanceof Network) {
            Preconditions.checkArgument(((Network) successorsFunction).isDirected(), "Undirected networks can never be trees.");
        }
        return new Traverser<N>(successorsFunction) { // from class: com.google.common.graph.Traverser.2
            @Override // com.google.common.graph.Traverser
            public Traversal<N> newTraversal() {
                return Traversal.inTree(successorsFunction);
            }
        };
    }

    private ImmutableSet<N> validate(Iterable<? extends N> iterable) {
        ImmutableSet<N> immutableSetCopyOf = ImmutableSet.copyOf(iterable);
        UnmodifiableIterator<N> it8 = immutableSetCopyOf.iterator();
        while (it8.hasNext()) {
            this.successorFunction.successors(it8.next());
        }
        return immutableSetCopyOf;
    }

    public final Iterable<N> breadthFirst(N n3) {
        return breadthFirst((Iterable) ImmutableSet.of(n3));
    }

    public final Iterable<N> depthFirstPostOrder(N n3) {
        return depthFirstPostOrder((Iterable) ImmutableSet.of(n3));
    }

    public final Iterable<N> depthFirstPreOrder(N n3) {
        return depthFirstPreOrder((Iterable) ImmutableSet.of(n3));
    }

    public abstract Traversal<N> newTraversal();

    private Traverser(SuccessorsFunction<N> successorsFunction) {
        this.successorFunction = (SuccessorsFunction) Preconditions.checkNotNull(successorsFunction);
    }

    public final Iterable<N> breadthFirst(Iterable<? extends N> iterable) {
        final ImmutableSet<N> immutableSetValidate = validate(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.3
            final /* synthetic */ Traverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.this$0.newTraversal().breadthFirst(immutableSetValidate.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPostOrder(Iterable<? extends N> iterable) {
        final ImmutableSet<N> immutableSetValidate = validate(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.5
            final /* synthetic */ Traverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.this$0.newTraversal().postOrder(immutableSetValidate.iterator());
            }
        };
    }

    public final Iterable<N> depthFirstPreOrder(Iterable<? extends N> iterable) {
        final ImmutableSet<N> immutableSetValidate = validate(iterable);
        return new Iterable<N>(this) { // from class: com.google.common.graph.Traverser.4
            final /* synthetic */ Traverser this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Iterable
            public Iterator<N> iterator() {
                return this.this$0.newTraversal().preOrder(immutableSetValidate.iterator());
            }
        };
    }
}
