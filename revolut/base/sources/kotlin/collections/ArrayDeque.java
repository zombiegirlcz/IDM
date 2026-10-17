package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;
import zhm.h;
import zhm.p;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0006B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lzhm/h;", "<init>", "()V", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ArrayDeque<E> extends h {
    public static final Object[] d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f186388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f186389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f186390c;

    public ArrayDeque() {
        this.f186389b = d;
    }

    public final void a(int i, Collection collection) {
        Iterator<E> it8 = collection.iterator();
        int length = this.f186389b.length;
        while (i < length && it8.hasNext()) {
            this.f186389b[i] = it8.next();
            i++;
        }
        int i2 = this.f186388a;
        for (int i3 = 0; i3 < i2 && it8.hasNext(); i3++) {
            this.f186389b[i3] = it8.next();
        }
        this.f186390c = collection.size() + size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        addLast(obj2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        k();
        b(elements.size() + size());
        a(i(size() + this.f186388a), elements);
        return true;
    }

    public final void addFirst(Object obj2) {
        k();
        b(size() + 1);
        int i = this.f186388a;
        int iT = i == 0 ? d.T(this.f186389b) : i - 1;
        this.f186388a = iT;
        this.f186389b[iT] = obj2;
        this.f186390c = size() + 1;
    }

    public final void addLast(Object obj2) {
        k();
        b(size() + 1);
        this.f186389b[i(size() + this.f186388a)] = obj2;
        this.f186390c = size() + 1;
    }

    public final void b(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f186389b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.f186389b = new Object[i];
            return;
        }
        a.Companion c1058a = a.INSTANCE;
        int length = objArr.length;
        c1058a.getClass();
        Object[] objArr2 = new Object[a.Companion.e(length, i)];
        Object[] objArr3 = this.f186389b;
        p.i(objArr3, objArr2, 0, this.f186388a, objArr3.length);
        Object[] objArr4 = this.f186389b;
        int length2 = objArr4.length;
        int i2 = this.f186388a;
        p.i(objArr4, objArr2, length2 - i2, 0, i2);
        this.f186388a = 0;
        this.f186389b = objArr2;
    }

    public final Object c() {
        if (isEmpty()) {
            return null;
        }
        return this.f186389b[this.f186388a];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            h(this.f186388a, i(size() + this.f186388a));
        }
        this.f186388a = 0;
        this.f186390c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    public final int d(int i) {
        if (i == d.T(this.f186389b)) {
            return 0;
        }
        return i + 1;
    }

    public final Object e() {
        if (isEmpty()) {
            return null;
        }
        return this.f186389b[i(v.j(this) + this.f186388a)];
    }

    public final int f(int i) {
        return i < 0 ? i + this.f186389b.length : i;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f186389b[this.f186388a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        a.Companion c1058a = a.INSTANCE;
        int size = size();
        c1058a.getClass();
        a.Companion.b(i, size);
        return this.f186389b[i(this.f186388a + i)];
    }

    @Override // zhm.h
    public final int getSize() {
        return this.f186390c;
    }

    public final void h(int i, int i2) {
        if (i < i2) {
            p.p(this.f186389b, i, i2, null);
            return;
        }
        Object[] objArr = this.f186389b;
        p.p(objArr, i, objArr.length, null);
        p.p(this.f186389b, 0, i2, null);
    }

    public final int i(int i) {
        Object[] objArr = this.f186389b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        int i;
        int i2 = i(size() + this.f186388a);
        int length = this.f186388a;
        if (length < i2) {
            while (length < i2) {
                if (Intrinsics.f(obj2, this.f186389b[length])) {
                    i = this.f186388a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < i2) {
            return -1;
        }
        int length2 = this.f186389b.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (Intrinsics.f(obj2, this.f186389b[i3])) {
                        length = i3 + this.f186389b.length;
                        i = this.f186388a;
                    }
                }
                return -1;
            }
            if (Intrinsics.f(obj2, this.f186389b[length])) {
                i = this.f186388a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f186389b[i(v.j(this) + this.f186388a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj2) {
        int iT;
        int i;
        int i2 = i(size() + this.f186388a);
        int i3 = this.f186388a;
        if (i3 < i2) {
            iT = i2 - 1;
            if (i3 <= iT) {
                while (!Intrinsics.f(obj2, this.f186389b[iT])) {
                    if (iT != i3) {
                        iT--;
                    }
                }
                i = this.f186388a;
                return iT - i;
            }
            return -1;
        }
        if (i3 > i2) {
            int i5 = i2 - 1;
            while (true) {
                if (-1 >= i5) {
                    iT = d.T(this.f186389b);
                    int i6 = this.f186388a;
                    if (i6 <= iT) {
                        while (!Intrinsics.f(obj2, this.f186389b[iT])) {
                            if (iT != i6) {
                                iT--;
                            }
                        }
                        i = this.f186388a;
                    }
                } else {
                    if (Intrinsics.f(obj2, this.f186389b[i5])) {
                        iT = i5 + this.f186389b.length;
                        i = this.f186388a;
                        break;
                    }
                    i5--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj2) {
        int iIndexOf = indexOf(obj2);
        if (iIndexOf == -1) {
            return false;
        }
        removeAt(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int i;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f186389b.length != 0) {
            int i2 = i(size() + this.f186388a);
            int i3 = this.f186388a;
            if (i3 < i2) {
                i = i3;
                while (i3 < i2) {
                    Object obj2 = this.f186389b[i3];
                    if (elements.contains(obj2)) {
                        z = true;
                    } else {
                        this.f186389b[i] = obj2;
                        i++;
                    }
                    i3++;
                }
                p.p(this.f186389b, i, i2, null);
            } else {
                int length = this.f186389b.length;
                boolean z3 = false;
                int i5 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f186389b;
                    Object obj3 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f186389b[i5] = obj3;
                        i5++;
                    }
                    i3++;
                }
                i = i(i5);
                for (int i6 = 0; i6 < i2; i6++) {
                    Object[] objArr2 = this.f186389b;
                    Object obj4 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj4)) {
                        z3 = true;
                    } else {
                        this.f186389b[i] = obj4;
                        i = d(i);
                    }
                }
                z = z3;
            }
            if (z) {
                k();
                this.f186390c = f(i - this.f186388a);
            }
        }
        return z;
    }

    @Override // zhm.h
    public final Object removeAt(int i) {
        a.Companion c1058a = a.INSTANCE;
        int size = size();
        c1058a.getClass();
        a.Companion.b(i, size);
        if (i == v.j(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        k();
        int i2 = i(this.f186388a + i);
        Object obj2 = this.f186389b[i2];
        if (i < (size() >> 1)) {
            int i3 = this.f186388a;
            if (i2 >= i3) {
                Object[] objArr = this.f186389b;
                p.i(objArr, objArr, i3 + 1, i3, i2);
            } else {
                Object[] objArr2 = this.f186389b;
                p.i(objArr2, objArr2, 1, 0, i2);
                Object[] objArr3 = this.f186389b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i5 = this.f186388a;
                p.i(objArr3, objArr3, i5 + 1, i5, objArr3.length - 1);
            }
            Object[] objArr4 = this.f186389b;
            int i6 = this.f186388a;
            objArr4[i6] = null;
            this.f186388a = d(i6);
        } else {
            int i21 = i(v.j(this) + this.f186388a);
            if (i2 <= i21) {
                Object[] objArr5 = this.f186389b;
                p.i(objArr5, objArr5, i2, i2 + 1, i21 + 1);
            } else {
                Object[] objArr6 = this.f186389b;
                p.i(objArr6, objArr6, i2, i2 + 1, objArr6.length);
                Object[] objArr7 = this.f186389b;
                objArr7[objArr7.length - 1] = objArr7[0];
                p.i(objArr7, objArr7, 0, 1, i21 + 1);
            }
            this.f186389b[i21] = null;
        }
        this.f186390c = size() - 1;
        return obj2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        Object[] objArr = this.f186389b;
        int i = this.f186388a;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.f186388a = d(i);
        this.f186390c = size() - 1;
        return obj2;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        int i = i(v.j(this) + this.f186388a);
        Object[] objArr = this.f186389b;
        Object obj2 = objArr[i];
        objArr[i] = null;
        this.f186390c = size() - 1;
        return obj2;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a.Companion c1058a = a.INSTANCE;
        int size = size();
        c1058a.getClass();
        a.Companion.d(i, i2, size);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            removeAt(i);
            return;
        }
        k();
        if (i < size() - i2) {
            int i5 = i(this.f186388a + (i - 1));
            int i6 = i(this.f186388a + (i2 - 1));
            while (i > 0) {
                int i21 = i5 + 1;
                int iMin = Math.min(i, Math.min(i21, i6 + 1));
                Object[] objArr = this.f186389b;
                int i22 = i6 - iMin;
                int i32 = i5 - iMin;
                p.i(objArr, objArr, i22 + 1, i32 + 1, i21);
                i5 = f(i32);
                i6 = f(i22);
                i -= iMin;
            }
            int i33 = i(this.f186388a + i3);
            h(this.f186388a, i33);
            this.f186388a = i33;
        } else {
            int i43 = i(this.f186388a + i2);
            int i59 = i(this.f186388a + i);
            int size2 = size();
            while (true) {
                size2 -= i2;
                if (size2 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f186389b;
                i2 = Math.min(size2, Math.min(objArr2.length - i43, objArr2.length - i59));
                Object[] objArr3 = this.f186389b;
                int i66 = i43 + i2;
                p.i(objArr3, objArr3, i59, i43, i66);
                i43 = i(i66);
                i59 = i(i59 + i2);
            }
            int i74 = i(size() + this.f186388a);
            h(f(i74 - i3), i74);
        }
        this.f186390c = size() - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int i;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f186389b.length != 0) {
            int i2 = i(size() + this.f186388a);
            int i3 = this.f186388a;
            if (i3 < i2) {
                i = i3;
                while (i3 < i2) {
                    Object obj2 = this.f186389b[i3];
                    if (elements.contains(obj2)) {
                        this.f186389b[i] = obj2;
                        i++;
                    } else {
                        z = true;
                    }
                    i3++;
                }
                p.p(this.f186389b, i, i2, null);
            } else {
                int length = this.f186389b.length;
                boolean z3 = false;
                int i5 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f186389b;
                    Object obj3 = objArr[i3];
                    objArr[i3] = null;
                    if (elements.contains(obj3)) {
                        this.f186389b[i5] = obj3;
                        i5++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                i = i(i5);
                for (int i6 = 0; i6 < i2; i6++) {
                    Object[] objArr2 = this.f186389b;
                    Object obj4 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj4)) {
                        this.f186389b[i] = obj4;
                        i = d(i);
                    } else {
                        z3 = true;
                    }
                }
                z = z3;
            }
            if (z) {
                k();
                this.f186390c = f(i - this.f186388a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        a.Companion c1058a = a.INSTANCE;
        int size = size();
        c1058a.getClass();
        a.Companion.b(i, size);
        int i2 = i(this.f186388a + i);
        Object[] objArr = this.f186389b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] reference) {
        Intrinsics.checkNotNullParameter(reference, "array");
        if (reference.length < size()) {
            int size = size();
            Intrinsics.checkNotNullParameter(reference, "reference");
            Object objNewInstance = Array.newInstance(reference.getClass().getComponentType(), size);
            Intrinsics.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            reference = (Object[]) objNewInstance;
        }
        int i = i(size() + this.f186388a);
        int i2 = this.f186388a;
        if (i2 < i) {
            p.l(this.f186389b, reference, i2, i, 2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f186389b;
            p.i(objArr, reference, 0, this.f186388a, objArr.length);
            Object[] objArr2 = this.f186389b;
            p.i(objArr2, reference, objArr2.length - this.f186388a, 0, i);
        }
        u.d(size(), reference);
        return reference;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        a.Companion c1058a = a.INSTANCE;
        int size = size();
        c1058a.getClass();
        a.Companion.c(i, size);
        if (i == size()) {
            addLast(obj2);
            return;
        }
        if (i == 0) {
            addFirst(obj2);
            return;
        }
        k();
        b(size() + 1);
        int i2 = i(this.f186388a + i);
        if (i < ((size() + 1) >> 1)) {
            int iT = i2 == 0 ? d.T(this.f186389b) : i2 - 1;
            int i3 = this.f186388a;
            int iT2 = i3 == 0 ? d.T(this.f186389b) : i3 - 1;
            int i5 = this.f186388a;
            if (iT >= i5) {
                Object[] objArr = this.f186389b;
                objArr[iT2] = objArr[i5];
                p.i(objArr, objArr, i5, i5 + 1, iT + 1);
            } else {
                Object[] objArr2 = this.f186389b;
                p.i(objArr2, objArr2, i5 - 1, i5, objArr2.length);
                Object[] objArr3 = this.f186389b;
                objArr3[objArr3.length - 1] = objArr3[0];
                p.i(objArr3, objArr3, 0, 1, iT + 1);
            }
            this.f186389b[iT] = obj2;
            this.f186388a = iT2;
        } else {
            int i6 = i(size() + this.f186388a);
            if (i2 < i6) {
                Object[] objArr4 = this.f186389b;
                p.i(objArr4, objArr4, i2 + 1, i2, i6);
            } else {
                Object[] objArr5 = this.f186389b;
                p.i(objArr5, objArr5, 1, 0, i6);
                Object[] objArr6 = this.f186389b;
                objArr6[0] = objArr6[objArr6.length - 1];
                p.i(objArr6, objArr6, i2 + 1, i2, objArr6.length - 1);
            }
            this.f186389b[i2] = obj2;
        }
        this.f186390c = size() + 1;
    }

    public ArrayDeque(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(a0.d.n("Illegal Capacity: ", i));
        }
        this.f186389b = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        a.Companion c1058a = a.INSTANCE;
        int size = size();
        c1058a.getClass();
        a.Companion.c(i, size);
        if (elements.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(elements);
        }
        k();
        b(elements.size() + size());
        int i2 = i(size() + this.f186388a);
        int i3 = i(this.f186388a + i);
        int size2 = elements.size();
        if (i < ((size() + 1) >> 1)) {
            int i5 = this.f186388a;
            int length = i5 - size2;
            if (i3 < i5) {
                Object[] objArr = this.f186389b;
                p.i(objArr, objArr, length, i5, objArr.length);
                if (size2 >= i3) {
                    Object[] objArr2 = this.f186389b;
                    p.i(objArr2, objArr2, objArr2.length - size2, 0, i3);
                } else {
                    Object[] objArr3 = this.f186389b;
                    p.i(objArr3, objArr3, objArr3.length - size2, 0, size2);
                    Object[] objArr4 = this.f186389b;
                    p.i(objArr4, objArr4, 0, size2, i3);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f186389b;
                p.i(objArr5, objArr5, length, i5, i3);
            } else {
                Object[] objArr6 = this.f186389b;
                length += objArr6.length;
                int i6 = i3 - i5;
                int length2 = objArr6.length - length;
                if (length2 >= i6) {
                    p.i(objArr6, objArr6, length, i5, i3);
                } else {
                    p.i(objArr6, objArr6, length, i5, i5 + length2);
                    Object[] objArr7 = this.f186389b;
                    p.i(objArr7, objArr7, 0, this.f186388a + length2, i3);
                }
            }
            this.f186388a = length;
            a(f(i3 - size2), elements);
            return true;
        }
        int i21 = i3 + size2;
        if (i3 < i2) {
            int i22 = size2 + i2;
            Object[] objArr8 = this.f186389b;
            if (i22 <= objArr8.length) {
                p.i(objArr8, objArr8, i21, i3, i2);
            } else if (i21 >= objArr8.length) {
                p.i(objArr8, objArr8, i21 - objArr8.length, i3, i2);
            } else {
                int length3 = i2 - (i22 - objArr8.length);
                p.i(objArr8, objArr8, 0, length3, i2);
                Object[] objArr9 = this.f186389b;
                p.i(objArr9, objArr9, i21, i3, length3);
            }
        } else {
            Object[] objArr10 = this.f186389b;
            p.i(objArr10, objArr10, size2, 0, i2);
            Object[] objArr11 = this.f186389b;
            if (i21 >= objArr11.length) {
                p.i(objArr11, objArr11, i21 - objArr11.length, i3, objArr11.length);
            } else {
                p.i(objArr11, objArr11, 0, objArr11.length - size2, objArr11.length);
                Object[] objArr12 = this.f186389b;
                p.i(objArr12, objArr12, i21, i3, objArr12.length - size2);
            }
        }
        a(i3, elements);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public ArrayDeque(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] array = elements.toArray(new Object[0]);
        this.f186389b = array;
        this.f186390c = array.length;
        if (array.length == 0) {
            this.f186389b = d;
        }
    }
}
