package zc;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
public abstract class i extends f implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f320985b = new g(k.d, 0);

    @Override // zc.f
    public int a(Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) >= 0;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public i subList(int i, int i2) {
        vc.s.f(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? k.d : new h(this, i, i3);
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        Object next;
        Object next2;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof List) {
            List list = (List) obj2;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        Object obj3 = get(i);
                        Object obj4 = list.get(i);
                        if (obj3 == obj4 || (obj3 != null && obj3.equals(obj4))) {
                        }
                    }
                    return true;
                }
                g gVarListIterator = listIterator(0);
                Iterator it8 = list.iterator();
                while (true) {
                    if (gVarListIterator.hasNext()) {
                        if (!it8.hasNext() || ((next = gVarListIterator.next()) != (next2 = it8.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it8.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final g listIterator(int i) {
        int size = size();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(vc.s.l(i, size, "index"));
        }
        return isEmpty() ? f320985b : new g(this, i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj2) {
        if (obj2 == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj2.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj2) {
        if (obj2 == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj2.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj2) {
        throw new UnsupportedOperationException();
    }
}
