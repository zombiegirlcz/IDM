package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class t1 extends c implements h1, RandomAccess, n2 {
    public static final t1 d = new t1(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f49794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49795c;

    public t1() {
        this(new long[10], 0, true);
    }

    public static t1 c() {
        return d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        long jLongValue = ((Long) obj2).longValue();
        a();
        if (i < 0 || i > (i2 = this.f49795c)) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49795c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        long[] jArr = this.f49794b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[a0.d.D(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f49794b, i, jArr2, i + 1, this.f49795c - i);
            this.f49794b = jArr2;
        }
        this.f49794b[i] = jLongValue;
        this.f49795c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = j1.f49738a;
        collection.getClass();
        if (!(collection instanceof t1)) {
            return super.addAll(collection);
        }
        t1 t1Var = (t1) collection;
        int i = t1Var.f49795c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f49795c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f49794b;
        if (i3 > jArr.length) {
            this.f49794b = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(t1Var.f49794b, 0, this.f49794b, this.f49795c, t1Var.f49795c);
        this.f49795c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(long j2) {
        a();
        int i = this.f49795c;
        long[] jArr = this.f49794b;
        if (i == jArr.length) {
            long[] jArr2 = new long[a0.d.D(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f49794b = jArr2;
        }
        long[] jArr3 = this.f49794b;
        int i2 = this.f49795c;
        this.f49795c = i2 + 1;
        jArr3[i2] = j2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f49795c) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49795c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    public final long e(int i) {
        d(i);
        return this.f49794b[i];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t1)) {
            return super.equals(obj2);
        }
        t1 t1Var = (t1) obj2;
        if (this.f49795c != t1Var.f49795c) {
            return false;
        }
        long[] jArr = t1Var.f49794b;
        for (int i = 0; i < this.f49795c; i++) {
            if (this.f49794b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.i1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final t1 mutableCopyWithCapacity(int i) {
        if (i >= this.f49795c) {
            return new t1(Arrays.copyOf(this.f49794b, i), this.f49795c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(e(i));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.f49795c; i++) {
            iB = (iB * 31) + j1.b(this.f49794b[i]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj2).longValue();
        int i = this.f49795c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f49794b[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        d(i);
        long[] jArr = this.f49794b;
        long j2 = jArr[i];
        if (i < this.f49795c - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f49795c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f49794b;
        System.arraycopy(jArr, i2, jArr, i, this.f49795c - i2);
        this.f49795c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        long jLongValue = ((Long) obj2).longValue();
        a();
        d(i);
        long[] jArr = this.f49794b;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49795c;
    }

    public t1(long[] jArr, int i, boolean z) {
        super(z);
        this.f49794b = jArr;
        this.f49795c = i;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        b(((Long) obj2).longValue());
        return true;
    }
}
