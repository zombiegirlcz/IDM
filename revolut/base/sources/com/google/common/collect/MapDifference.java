package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface MapDifference<K, V> {

    public interface ValueDifference<V> {
        boolean equals(Object obj2);

        int hashCode();

        @ParametricNullness
        V leftValue();

        @ParametricNullness
        V rightValue();
    }

    boolean areEqual();

    Map<K, ValueDifference<V>> entriesDiffering();

    Map<K, V> entriesInCommon();

    Map<K, V> entriesOnlyOnLeft();

    Map<K, V> entriesOnlyOnRight();

    boolean equals(Object obj2);

    int hashCode();
}
