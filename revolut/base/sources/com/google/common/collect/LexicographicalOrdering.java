package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class LexicographicalOrdering<T> extends Ordering<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T> elementOrder;

    public LexicographicalOrdering(Comparator<? super T> comparator) {
        this.elementOrder = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof LexicographicalOrdering) {
            return this.elementOrder.equals(((LexicographicalOrdering) obj2).elementOrder);
        }
        return false;
    }

    public int hashCode() {
        return this.elementOrder.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.elementOrder + ".lexicographical()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it8 = iterable.iterator();
        Iterator<T> it9 = iterable2.iterator();
        while (it8.hasNext()) {
            if (!it9.hasNext()) {
                return 1;
            }
            int iCompare = this.elementOrder.compare(it8.next(), it9.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it9.hasNext() ? -1 : 0;
    }
}
