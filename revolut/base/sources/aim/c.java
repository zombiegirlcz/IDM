package aim;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import zhm.p;
import zhm.u;

/* JADX INFO: loaded from: classes14.dex */
public final class c extends zhm.h implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f5313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5315c;
    public final c d;
    public final e e;

    public c(Object[] backing, int i, int i2, c cVar, e root) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        Intrinsics.checkNotNullParameter(root, "root");
        this.f5313a = backing;
        this.f5314b = i;
        this.f5315c = i2;
        this.d = cVar;
        this.e = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        e();
        d();
        c(this.f5314b + this.f5315c, obj2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        e();
        d();
        int size = elements.size();
        b(this.f5314b + this.f5315c, elements, size);
        return size > 0;
    }

    public final void b(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        e eVar = this.e;
        c cVar = this.d;
        if (cVar != null) {
            cVar.b(i, collection, i2);
        } else {
            e eVar2 = e.d;
            eVar.b(i, collection, i2);
        }
        this.f5313a = eVar.f5316a;
        this.f5315c += i2;
    }

    public final void c(int i, Object obj2) {
        ((AbstractList) this).modCount++;
        e eVar = this.e;
        c cVar = this.d;
        if (cVar != null) {
            cVar.c(i, obj2);
        } else {
            e eVar2 = e.d;
            eVar.c(i, obj2);
        }
        this.f5313a = eVar.f5316a;
        this.f5315c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        d();
        h(this.f5314b, this.f5315c);
    }

    public final void d() {
        if (((AbstractList) this.e).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void e() {
        if (this.e.f5318c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        d();
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof List) {
            List list = (List) obj2;
            Object[] objArr = this.f5313a;
            int i = this.f5315c;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.f(objArr[this.f5314b + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object f(int i) {
        Object objF;
        ((AbstractList) this).modCount++;
        c cVar = this.d;
        if (cVar != null) {
            objF = cVar.f(i);
        } else {
            e eVar = e.d;
            objF = this.e.f(i);
        }
        this.f5315c--;
        return objF;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d();
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int i2 = this.f5315c;
        companion.getClass();
        a.Companion.b(i, i2);
        return this.f5313a[this.f5314b + i];
    }

    @Override // zhm.h
    /* JADX INFO: renamed from: getSize */
    public final int getF186390c() {
        d();
        return this.f5315c;
    }

    public final void h(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        c cVar = this.d;
        if (cVar != null) {
            cVar.h(i, i2);
        } else {
            e eVar = e.d;
            this.e.h(i, i2);
        }
        this.f5315c -= i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        d();
        Object[] objArr = this.f5313a;
        int i = this.f5315c;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[this.f5314b + i2];
            iHashCode = (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public final int i(int i, int i2, Collection collection, boolean z) {
        int i3;
        c cVar = this.d;
        if (cVar != null) {
            i3 = cVar.i(i, i2, collection, z);
        } else {
            e eVar = e.d;
            i3 = this.e.i(i, i2, collection, z);
        }
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5315c -= i3;
        return i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        d();
        for (int i = 0; i < this.f5315c; i++) {
            if (Intrinsics.f(this.f5313a[this.f5314b + i], obj2)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        d();
        return this.f5315c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj2) {
        d();
        for (int i = this.f5315c - 1; i >= 0; i--) {
            if (Intrinsics.f(this.f5313a[this.f5314b + i], obj2)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj2) {
        e();
        d();
        int iIndexOf = indexOf(obj2);
        if (iIndexOf >= 0) {
            removeAt(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        e();
        d();
        return i(this.f5314b, this.f5315c, elements, false) > 0;
    }

    @Override // zhm.h
    public final Object removeAt(int i) {
        e();
        d();
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int i2 = this.f5315c;
        companion.getClass();
        a.Companion.b(i, i2);
        return f(this.f5314b + i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        e();
        d();
        return i(this.f5314b, this.f5315c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        e();
        d();
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int i2 = this.f5315c;
        companion.getClass();
        a.Companion.b(i, i2);
        Object[] objArr = this.f5313a;
        int i3 = this.f5314b + i;
        Object obj3 = objArr[i3];
        objArr[i3] = obj2;
        return obj3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int i3 = this.f5315c;
        companion.getClass();
        a.Companion.d(i, i2, i3);
        return new c(this.f5313a, this.f5314b + i, i2 - i, this, this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        d();
        int length = array.length;
        int i = this.f5315c;
        int i2 = this.f5314b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f5313a, i2, i + i2, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        p.i(this.f5313a, array, 0, i2, i + i2);
        u.d(this.f5315c, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        d();
        return com.bumptech.glide.c.c(this.f5313a, this.f5314b, this.f5315c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        d();
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int i2 = this.f5315c;
        companion.getClass();
        a.Companion.c(i, i2);
        return new b(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        e();
        d();
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int i2 = this.f5315c;
        companion.getClass();
        a.Companion.c(i, i2);
        c(this.f5314b + i, obj2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        e();
        d();
        a.Companion companion = kotlin.collections.a.INSTANCE;
        int i2 = this.f5315c;
        companion.getClass();
        a.Companion.c(i, i2);
        int size = elements.size();
        b(this.f5314b + i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        d();
        Object[] objArr = this.f5313a;
        int i = this.f5315c;
        int i2 = this.f5314b;
        return p.n(i2, i + i2, objArr);
    }
}
