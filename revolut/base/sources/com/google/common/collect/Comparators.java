package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes17.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Comparators {
    private Comparators() {
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> greatest(int i, Comparator<? super T> comparator) {
        return least(i, comparator.reversed());
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return true;
        }
        T next = it8.next();
        while (it8.hasNext()) {
            T next2 = it8.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, Comparator<T> comparator) {
        Preconditions.checkNotNull(comparator);
        Iterator<? extends T> it8 = iterable.iterator();
        if (!it8.hasNext()) {
            return true;
        }
        T next = it8.next();
        while (it8.hasNext()) {
            T next2 = it8.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @IgnoreJRERequirement
    public static <T> Collector<T, ?, List<T>> least(final int i, final Comparator<? super T> comparator) {
        CollectPreconditions.checkNonnegative(i, "k");
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.o
            @Override // java.util.function.Supplier
            public final Object get() {
                return TopKSelector.least(i, comparator);
            }
        }, new d(1), new a(7), new e(3), Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> Comparator<Iterable<S>> lexicographical(Comparator<T> comparator) {
        return new LexicographicalOrdering((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <T extends Comparable<? super T>> T max(T t2, T t3) {
        return t2.compareTo(t3) >= 0 ? t2 : t3;
    }

    public static <T extends Comparable<? super T>> T min(T t2, T t3) {
        return t2.compareTo(t3) <= 0 ? t2 : t3;
    }

    @ParametricNullness
    public static <T> T max(@ParametricNullness T t2, @ParametricNullness T t3, Comparator<? super T> comparator) {
        return comparator.compare(t2, t3) >= 0 ? t2 : t3;
    }

    @ParametricNullness
    public static <T> T min(@ParametricNullness T t2, @ParametricNullness T t3, Comparator<? super T> comparator) {
        return comparator.compare(t2, t3) <= 0 ? t2 : t3;
    }
}
