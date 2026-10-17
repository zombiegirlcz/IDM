package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Iterators {

    /* JADX INFO: loaded from: classes17.dex */
    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        static final UnmodifiableListIterator<Object> EMPTY = new ArrayItr(new Object[0], 0);
        private final T[] array;

        public ArrayItr(T[] tArr, int i) {
            super(tArr.length, i);
            this.array = tArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        public T get(int i) {
            return this.array[i];
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class ConcatenatedIterator<T> implements Iterator<T> {
        private Iterator<? extends T> iterator = Iterators.emptyIterator();
        private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;
        private Iterator<? extends T> toRemove;
        private Iterator<? extends Iterator<? extends T>> topMetaIterator;

        public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it8) {
            this.topMetaIterator = (Iterator) Preconditions.checkNotNull(it8);
        }

        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it8 = this.topMetaIterator;
                if (it8 != null && it8.hasNext()) {
                    return this.topMetaIterator;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.metaIterators;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.topMetaIterator = this.metaIterators.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.iterator)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Iterator<? extends T> it8 = this.iterator;
            this.toRemove = it8;
            return it8.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it8 = this.toRemove;
            if (it8 == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it8.remove();
            this.toRemove = null;
        }
    }

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(false);
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        final Queue<PeekingIterator<T>> queue;

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
            this.queue = new PriorityQueue(2, new r(comparator, 0));
            for (Iterator<? extends T> it8 : iterable) {
                if (it8.hasNext()) {
                    this.queue.add(Iterators.peekingIterator(it8));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ int lambda$new$0(Comparator comparator, PeekingIterator peekingIterator, PeekingIterator peekingIterator2) {
            return comparator.compare(peekingIterator.peek(), peekingIterator2.peek());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            PeekingIterator<T> peekingIteratorRemove = this.queue.remove();
            T next = peekingIteratorRemove.next();
            if (peekingIteratorRemove.hasNext()) {
                this.queue.add(peekingIteratorRemove);
            }
            return next;
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;
        private E peekedElement;

        public PeekingImpl(Iterator<? extends E> it8) {
            this.iterator = (Iterator) Preconditions.checkNotNull(it8);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e = (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
            this.hasPeeked = false;
            this.peekedElement = null;
            return e;
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class SingletonIterator<T> extends UnmodifiableIterator<T> {
        private boolean done;
        private final T value;

        public SingletonIterator(T t2) {
            this.value = t2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.done;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (this.done) {
                throw new NoSuchElementException();
            }
            this.done = true;
            return this.value;
        }
    }

    private Iterators() {
    }

    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it8) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it8);
        boolean zAdd = false;
        while (it8.hasNext()) {
            zAdd |= collection.add(it8.next());
        }
        return zAdd;
    }

    public static int advance(Iterator<?> it8, int i) {
        Preconditions.checkNotNull(it8);
        int i2 = 0;
        Preconditions.checkArgument(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it8.hasNext()) {
            it8.next();
            i2++;
        }
        return i2;
    }

    public static <T> boolean all(Iterator<T> it8, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it8.hasNext()) {
            if (!predicate.apply(it8.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it8, Predicate<? super T> predicate) {
        return indexOf(it8, predicate) != -1;
    }

    public static <T> Enumeration<T> asEnumeration(final Iterator<T> it8) {
        Preconditions.checkNotNull(it8);
        return new Enumeration<T>() { // from class: com.google.common.collect.Iterators.10
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it8.hasNext();
            }

            @Override // java.util.Enumeration
            @ParametricNullness
            public T nextElement() {
                return (T) it8.next();
            }
        };
    }

    public static void checkNonnegative(int i) {
        if (i < 0) {
            throw new IndexOutOfBoundsException(j6.a.l(i, "position (", ") must not be negative"));
        }
    }

    public static void clear(Iterator<?> it8) {
        Preconditions.checkNotNull(it8);
        while (it8.hasNext()) {
            it8.next();
            it8.remove();
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it8, Iterator<? extends T> it9) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkNotNull(it9);
        return concat(consumingForArray(it8, it9));
    }

    public static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... itArr) {
        for (Iterator it8 : (Iterator[]) Preconditions.checkNotNull(itArr)) {
            Preconditions.checkNotNull(it8);
        }
        return concat(consumingForArray(itArr));
    }

    private static <I extends Iterator<?>> Iterator<I> consumingForArray(final I... iArr) {
        return new UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3
            int index = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < iArr.length;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TI; */
            @Override // java.util.Iterator
            public Iterator next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator it8 = iArr[this.index];
                Objects.requireNonNull(it8);
                Iterator it9 = it8;
                Iterator[] itArr = iArr;
                int i = this.index;
                itArr[i] = null;
                this.index = i + 1;
                return it9;
            }
        };
    }

    public static <T> Iterator<T> consumingIterator(final Iterator<T> it8) {
        Preconditions.checkNotNull(it8);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it8.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t2 = (T) it8.next();
                it8.remove();
                return t2;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    public static boolean contains(Iterator<?> it8, Object obj2) {
        if (obj2 == null) {
            while (it8.hasNext()) {
                if (it8.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it8.hasNext()) {
            if (obj2.equals(it8.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.2
            Iterator<T> iterator = Iterators.emptyModifiableIterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.iterator.hasNext()) {
                    Iterator<T> it8 = iterable.iterator();
                    this.iterator = it8;
                    if (!it8.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    public static boolean elementsEqual(Iterator<?> it8, Iterator<?> it9) {
        while (it8.hasNext()) {
            if (!it9.hasNext() || !com.google.common.base.Objects.equal(it8.next(), it9.next())) {
                return false;
            }
        }
        return !it9.hasNext();
    }

    public static <T> UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    public static <T> UnmodifiableListIterator<T> emptyListIterator() {
        return (UnmodifiableListIterator<T>) ArrayItr.EMPTY;
    }

    public static <T> Iterator<T> emptyModifiableIterator() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> UnmodifiableIterator<T> filter(final Iterator<T> it8, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
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
            public T computeNext() {
                while (it8.hasNext()) {
                    T t2 = (T) it8.next();
                    if (predicate.apply(t2)) {
                        return t2;
                    }
                }
                return endOfData();
            }
        };
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> it8, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkNotNull(predicate);
        while (it8.hasNext()) {
            T next = it8.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return forArrayWithPosition(tArr, 0);
    }

    public static <T> UnmodifiableListIterator<T> forArrayWithPosition(T[] tArr, int i) {
        if (tArr.length != 0) {
            return new ArrayItr(tArr, i);
        }
        Preconditions.checkPositionIndex(i, tArr.length);
        return emptyListIterator();
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(final Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) enumeration.nextElement();
            }
        };
    }

    public static int frequency(Iterator<?> it8, Object obj2) {
        int i = 0;
        while (contains(it8, obj2)) {
            i++;
        }
        return i;
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> it8, int i) {
        checkNonnegative(i);
        int iAdvance = advance(it8, i);
        if (it8.hasNext()) {
            return it8.next();
        }
        throw new IndexOutOfBoundsException(com.google.android.gms.internal.mlkit_vision_face.a.m("position (", i, iAdvance, ") must be less than the number of elements that remained (", ")"));
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> it8) {
        T next;
        do {
            next = it8.next();
        } while (it8.hasNext());
        return next;
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> it8, @ParametricNullness T t2) {
        return it8.hasNext() ? it8.next() : t2;
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> it8) {
        T next = it8.next();
        if (!it8.hasNext()) {
            return next;
        }
        StringBuilder sb6 = new StringBuilder("expected one element but was: <");
        sb6.append(next);
        for (int i = 0; i < 4 && it8.hasNext(); i++) {
            sb6.append(", ");
            sb6.append(it8.next());
        }
        if (it8.hasNext()) {
            sb6.append(", ...");
        }
        sb6.append('>');
        throw new IllegalArgumentException(sb6.toString());
    }

    public static <T> int indexOf(Iterator<T> it8, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it8.hasNext()) {
            if (predicate.apply(it8.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <T> Iterator<T> limit(final Iterator<T> it8, final int i) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkArgument(i >= 0, "limit is negative");
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.7
            private int count;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < i && it8.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.count++;
                return (T) it8.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                it8.remove();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it8, int i) {
        return partitionImpl(it8, i, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it8, int i) {
        return partitionImpl(it8, i, false);
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(final Iterator<T> it8, final int i, final boolean z) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkArgument(i > 0);
        return new UnmodifiableIterator<List<T>>() { // from class: com.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it8.hasNext();
            }

            @Override // java.util.Iterator
            public List<T> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = new Object[i];
                int i2 = 0;
                while (i2 < i && it8.hasNext()) {
                    objArr[i2] = it8.next();
                    i2++;
                }
                for (int i3 = i2; i3 < i; i3++) {
                    objArr[i3] = null;
                }
                List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                return (z || i2 == i) ? listUnmodifiableList : listUnmodifiableList.subList(0, i2);
            }
        };
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it8) {
        return it8 instanceof PeekingImpl ? (PeekingImpl) it8 : new PeekingImpl(it8);
    }

    public static <T> T pollNext(Iterator<T> it8) {
        if (!it8.hasNext()) {
            return null;
        }
        T next = it8.next();
        it8.remove();
        return next;
    }

    public static boolean removeAll(Iterator<?> it8, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it8.hasNext()) {
            if (collection.contains(it8.next())) {
                it8.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeIf(Iterator<T> it8, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it8.hasNext()) {
            if (predicate.apply(it8.next())) {
                it8.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean retainAll(Iterator<?> it8, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it8.hasNext()) {
            if (!collection.contains(it8.next())) {
                it8.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness T t2) {
        return new SingletonIterator(t2);
    }

    public static int size(Iterator<?> it8) {
        long j2 = 0;
        while (it8.hasNext()) {
            it8.next();
            j2++;
        }
        return Ints.saturatedCast(j2);
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it8, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it8), cls);
    }

    public static String toString(Iterator<?> it8) {
        StringBuilder sb6 = new StringBuilder("[");
        boolean z = true;
        while (it8.hasNext()) {
            if (!z) {
                sb6.append(", ");
            }
            sb6.append(it8.next());
            z = false;
        }
        sb6.append(']');
        return sb6.toString();
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it8, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(it8) { // from class: com.google.common.collect.Iterators.6
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            public T transform(@ParametricNullness F f) {
                return (T) function.apply(f);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterator<T> it8, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkNotNull(predicate);
        while (it8.hasNext()) {
            T next = it8.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<? extends T> it8) {
        Preconditions.checkNotNull(it8);
        return it8 instanceof UnmodifiableIterator ? (UnmodifiableIterator) it8 : new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it8.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) it8.next();
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it8, @ParametricNullness T t2) {
        return it8.hasNext() ? (T) getLast(it8) : t2;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it8, Iterator<? extends T> it9, Iterator<? extends T> it10) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkNotNull(it9);
        Preconditions.checkNotNull(it10);
        return concat(consumingForArray(it8, it9, it10));
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it8, Class<T> cls) {
        return filter(it8, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        return (PeekingIterator) Preconditions.checkNotNull(peekingIterator);
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(unmodifiableIterator);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T find(Iterator<? extends T> it8, Predicate<? super T> predicate, T t2) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkNotNull(predicate);
        while (it8.hasNext()) {
            T next = it8.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t2;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it8, Iterator<? extends T> it9, Iterator<? extends T> it10, Iterator<? extends T> it11) {
        Preconditions.checkNotNull(it8);
        Preconditions.checkNotNull(it9);
        Preconditions.checkNotNull(it10);
        Preconditions.checkNotNull(it11);
        return concat(consumingForArray(it8, it9, it10, it11));
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it8, @ParametricNullness T t2) {
        return it8.hasNext() ? (T) getOnlyElement(it8) : t2;
    }

    @SafeVarargs
    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return concatNoDefensiveCopy((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it8) {
        return new ConcatenatedIterator(it8);
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it8, int i, @ParametricNullness T t2) {
        checkNonnegative(i);
        advance(it8, i);
        return (T) getNext(it8, t2);
    }
}
