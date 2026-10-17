package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes17.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface Table<R, C, V> {

    public interface Cell<R, C, V> {
        boolean equals(Object obj2);

        @ParametricNullness
        C getColumnKey();

        @ParametricNullness
        R getRowKey();

        @ParametricNullness
        V getValue();

        int hashCode();
    }

    Set<Cell<R, C, V>> cellSet();

    void clear();

    Map<R, V> column(@ParametricNullness C c2);

    Set<C> columnKeySet();

    Map<C, Map<R, V>> columnMap();

    boolean contains(Object obj2, Object obj3);

    boolean containsColumn(Object obj2);

    boolean containsRow(Object obj2);

    boolean containsValue(Object obj2);

    boolean equals(Object obj2);

    V get(Object obj2, Object obj3);

    int hashCode();

    boolean isEmpty();

    V put(@ParametricNullness R r2, @ParametricNullness C c2, @ParametricNullness V v);

    void putAll(Table<? extends R, ? extends C, ? extends V> table);

    V remove(Object obj2, Object obj3);

    Map<C, V> row(@ParametricNullness R r2);

    Set<R> rowKeySet();

    Map<R, Map<C, V>> rowMap();

    int size();

    Collection<V> values();
}
