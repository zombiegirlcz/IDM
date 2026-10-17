package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends c implements e1, RandomAccess, n2 {
    public static final x0 d = new x0(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f49828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49829c;

    public x0() {
        this(new int[10], 0, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        int iIntValue = ((Integer) obj2).intValue();
        a();
        if (i < 0 || i > (i2 = this.f49829c)) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49829c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        int[] iArr = this.f49828b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[a0.d.D(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f49828b, i, iArr2, i + 1, this.f49829c - i);
            this.f49828b = iArr2;
        }
        this.f49828b[i] = iIntValue;
        this.f49829c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = j1.f49738a;
        collection.getClass();
        if (!(collection instanceof x0)) {
            return super.addAll(collection);
        }
        x0 x0Var = (x0) collection;
        int i = x0Var.f49829c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f49829c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f49828b;
        if (i3 > iArr.length) {
            this.f49828b = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(x0Var.f49828b, 0, this.f49828b, this.f49829c, x0Var.f49829c);
        this.f49829c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        a();
        int i2 = this.f49829c;
        int[] iArr = this.f49828b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[a0.d.D(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f49828b = iArr2;
        }
        int[] iArr3 = this.f49828b;
        int i3 = this.f49829c;
        this.f49829c = i3 + 1;
        iArr3[i3] = i;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f49829c) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49829c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    public final int d(int i) {
        c(i);
        return this.f49828b[i];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return super.equals(obj2);
        }
        x0 x0Var = (x0) obj2;
        if (this.f49829c != x0Var.f49829c) {
            return false;
        }
        int[] iArr = x0Var.f49828b;
        for (int i = 0; i < this.f49829c; i++) {
            if (this.f49828b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Integer.valueOf(d(i));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f49829c; i2++) {
            i = (i * 31) + this.f49828b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj2).intValue();
        int i = this.f49829c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f49828b[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.i1
    public final i1 mutableCopyWithCapacity(int i) {
        if (i >= this.f49829c) {
            return new x0(Arrays.copyOf(this.f49828b, i), this.f49829c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        int[] iArr = this.f49828b;
        int i2 = iArr[i];
        if (i < this.f49829c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f49829c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f49828b;
        System.arraycopy(iArr, i2, iArr, i, this.f49829c - i2);
        this.f49829c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        int iIntValue = ((Integer) obj2).intValue();
        a();
        c(i);
        int[] iArr = this.f49828b;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49829c;
    }

    public x0(int[] iArr, int i, boolean z) {
        super(z);
        this.f49828b = iArr;
        this.f49829c = i;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        b(((Integer) obj2).intValue());
        return true;
    }
}
