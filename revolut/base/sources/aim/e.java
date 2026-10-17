package aim;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;
import zhm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends zhm.h implements List, RandomAccess, Serializable {

    @NotNull
    private static final d Companion = new d();
    public static final e d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f5316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5318c;

    static {
        e eVar = new e(0);
        eVar.f5318c = true;
        d = eVar;
    }

    public e() {
        this((Object) null);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        d();
        int i = this.f5317b;
        ((AbstractList) this).modCount++;
        e(i, 1);
        this.f5316a[i] = obj2;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        int size = elements.size();
        b(this.f5317b, elements, size);
        return size > 0;
    }

    public final void b(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        e(i, i2);
        Iterator it8 = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f5316a[i + i3] = it8.next();
        }
    }

    public final void c(int i, Object obj2) {
        ((AbstractList) this).modCount++;
        e(i, 1);
        this.f5316a[i] = obj2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        h(0, this.f5317b);
    }

    public final void d() {
        if (this.f5318c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void e(int i, int i2) {
        int i3 = this.f5317b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f5316a;
        if (i3 > objArr.length) {
            a.Companion c1058a = kotlin.collections.a.INSTANCE;
            int length = objArr.length;
            c1058a.getClass();
            int iE = a.Companion.e(length, i3);
            Object[] objArr2 = this.f5316a;
            Intrinsics.checkNotNullParameter(objArr2, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, iE);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.f5316a = objArrCopyOf;
        }
        Object[] objArr3 = this.f5316a;
        p.i(objArr3, objArr3, i + i2, i, this.f5317b);
        this.f5317b += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof List) {
            List list = (List) obj2;
            Object[] objArr = this.f5316a;
            int i = this.f5317b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (Intrinsics.f(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final Object f(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f5316a;
        Object obj2 = objArr[i];
        p.i(objArr, objArr, i, i + 1, this.f5317b);
        Object[] objArr2 = this.f5316a;
        int i2 = this.f5317b - 1;
        Intrinsics.checkNotNullParameter(objArr2, "<this>");
        objArr2[i2] = null;
        this.f5317b--;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int i2 = this.f5317b;
        c1058a.getClass();
        a.Companion.b(i, i2);
        return this.f5316a[i];
    }

    @Override // zhm.h
    /* JADX INFO: renamed from: getSize */
    public final int getF186390c() {
        return this.f5317b;
    }

    public final void h(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f5316a;
        p.i(objArr, objArr, i, i + i2, this.f5317b);
        Object[] objArr2 = this.f5316a;
        int i3 = this.f5317b;
        com.bumptech.glide.c.z(i3 - i2, i3, objArr2);
        this.f5317b -= i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f5316a;
        int i = this.f5317b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public final int i(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i5 = 0;
        while (i3 < i2) {
            int i6 = i + i3;
            if (collection.contains(this.f5316a[i6]) == z) {
                Object[] objArr = this.f5316a;
                i3++;
                objArr[i5 + i] = objArr[i6];
                i5++;
            } else {
                i3++;
            }
        }
        int i21 = i2 - i5;
        Object[] objArr2 = this.f5316a;
        p.i(objArr2, objArr2, i + i5, i2 + i, this.f5317b);
        Object[] objArr3 = this.f5316a;
        int i22 = this.f5317b;
        com.bumptech.glide.c.z(i22 - i21, i22, objArr3);
        if (i21 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5317b -= i21;
        return i21;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        for (int i = 0; i < this.f5317b; i++) {
            if (Intrinsics.f(this.f5316a[i], obj2)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5317b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj2) {
        for (int i = this.f5317b - 1; i >= 0; i--) {
            if (Intrinsics.f(this.f5316a[i], obj2)) {
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
        d();
        return i(0, this.f5317b, elements, false) > 0;
    }

    @Override // zhm.h
    public final Object removeAt(int i) {
        d();
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int i2 = this.f5317b;
        c1058a.getClass();
        a.Companion.b(i, i2);
        return f(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        return i(0, this.f5317b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        d();
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int i2 = this.f5317b;
        c1058a.getClass();
        a.Companion.b(i, i2);
        Object[] objArr = this.f5316a;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int i3 = this.f5317b;
        c1058a.getClass();
        a.Companion.d(i, i2, i3);
        return new c(this.f5316a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        int length = array.length;
        int i = this.f5317b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f5316a, 0, i, array.getClass());
            Intrinsics.checkNotNullExpressionValue(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        p.i(this.f5316a, array, 0, 0, i);
        u.d(this.f5317b, array);
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return com.bumptech.glide.c.c(this.f5316a, 0, this.f5317b, this);
    }

    public /* synthetic */ e(Object obj2) {
        this(10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int i2 = this.f5317b;
        c1058a.getClass();
        a.Companion.c(i, i2);
        return new b(this, i);
    }

    public e(int i) {
        if (i >= 0) {
            this.f5316a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        d();
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int i2 = this.f5317b;
        c1058a.getClass();
        a.Companion.c(i, i2);
        int size = elements.size();
        b(i, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return p.n(0, this.f5317b, this.f5316a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        d();
        a.Companion c1058a = kotlin.collections.a.INSTANCE;
        int i2 = this.f5317b;
        c1058a.getClass();
        a.Companion.c(i, i2);
        ((AbstractList) this).modCount++;
        e(i, 1);
        this.f5316a[i] = obj2;
    }
}
