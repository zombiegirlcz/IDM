package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Multiset<E> extends Collection<E> {

    public interface Entry<E> {
        boolean equals(Object obj2);

        int getCount();

        @ParametricNullness
        E getElement();

        int hashCode();

        String toString();
    }

    int add(@ParametricNullness E e, int i);

    boolean add(@ParametricNullness E e);

    boolean contains(Object obj2);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    int count(Object obj2);

    Set<E> elementSet();

    Set<Entry<E>> entrySet();

    boolean equals(Object obj2);

    int hashCode();

    Iterator<E> iterator();

    int remove(Object obj2, int i);

    boolean remove(Object obj2);

    boolean removeAll(Collection<?> collection);

    boolean retainAll(Collection<?> collection);

    int setCount(@ParametricNullness E e, int i);

    boolean setCount(@ParametricNullness E e, int i, int i2);

    int size();

    String toString();
}
