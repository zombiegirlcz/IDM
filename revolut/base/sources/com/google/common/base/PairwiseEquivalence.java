package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class PairwiseEquivalence<E, T extends E> extends Equivalence<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 1;
    final Equivalence<E> elementEquivalence;

    public PairwiseEquivalence(Equivalence<E> equivalence) {
        this.elementEquivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof PairwiseEquivalence) {
            return this.elementEquivalence.equals(((PairwiseEquivalence) obj2).elementEquivalence);
        }
        return false;
    }

    public int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public String toString() {
        return this.elementEquivalence + ".pairwise()";
    }

    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it8 = iterable.iterator();
        Iterator<T> it9 = iterable2.iterator();
        while (it8.hasNext() && it9.hasNext()) {
            if (!this.elementEquivalence.equivalent(it8.next(), it9.next())) {
                return false;
            }
        }
        return (it8.hasNext() || it9.hasNext()) ? false : true;
    }

    @Override // com.google.common.base.Equivalence
    public int doHash(Iterable<T> iterable) {
        Iterator<T> it8 = iterable.iterator();
        int iHash = 78721;
        while (it8.hasNext()) {
            iHash = (iHash * 24943) + this.elementEquivalence.hash(it8.next());
        }
        return iHash;
    }
}
