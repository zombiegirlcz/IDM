package pmm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import omm.c;
import qmm.b;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements c, Collection, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f237648a;

    @Override // java.util.Collection
    public final boolean add(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj2) {
        return this.f237648a.contains(obj2);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f237648a.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f237648a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it8 = this.f237648a.iterator();
        if (it8 != null) {
            return it8 instanceof c ? it8 : new b(it8);
        }
        throw new NullPointerException("Iterator must not be null");
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f237648a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return this.f237648a.toArray();
    }

    public final String toString() {
        return this.f237648a.toString();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f237648a.toArray(objArr);
    }
}
