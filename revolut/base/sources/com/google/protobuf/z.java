package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class z extends c implements z0, RandomAccess, n2 {
    public static final z d = new z(new double[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f49838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49839c;

    public z(double[] dArr, int i, boolean z) {
        super(z);
        this.f49838b = dArr;
        this.f49839c = i;
    }

    public static z c() {
        return d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        double dDoubleValue = ((Double) obj2).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.f49839c)) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49839c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        double[] dArr = this.f49838b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[a0.d.D(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f49838b, i, dArr2, i + 1, this.f49839c - i);
            this.f49838b = dArr2;
        }
        this.f49838b[i] = dDoubleValue;
        this.f49839c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = j1.f49738a;
        collection.getClass();
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i = zVar.f49839c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f49839c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f49838b;
        if (i3 > dArr.length) {
            this.f49838b = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zVar.f49838b, 0, this.f49838b, this.f49839c, zVar.f49839c);
        this.f49839c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(double d5) {
        a();
        int i = this.f49839c;
        double[] dArr = this.f49838b;
        if (i == dArr.length) {
            double[] dArr2 = new double[a0.d.D(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f49838b = dArr2;
        }
        double[] dArr3 = this.f49838b;
        int i2 = this.f49839c;
        this.f49839c = i2 + 1;
        dArr3[i2] = d5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f49839c) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49839c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // com.google.protobuf.i1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final z mutableCopyWithCapacity(int i) {
        if (i >= this.f49839c) {
            return new z(Arrays.copyOf(this.f49838b, i), this.f49839c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return super.equals(obj2);
        }
        z zVar = (z) obj2;
        if (this.f49839c != zVar.f49839c) {
            return false;
        }
        double[] dArr = zVar.f49838b;
        for (int i = 0; i < this.f49839c; i++) {
            if (Double.doubleToLongBits(this.f49838b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Double.valueOf(this.f49838b[i]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iB = 1;
        for (int i = 0; i < this.f49839c; i++) {
            iB = (iB * 31) + j1.b(Double.doubleToLongBits(this.f49838b[i]));
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj2).doubleValue();
        int i = this.f49839c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f49838b[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        d(i);
        double[] dArr = this.f49838b;
        double d5 = dArr[i];
        if (i < this.f49839c - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f49839c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f49838b;
        System.arraycopy(dArr, i2, dArr, i, this.f49839c - i2);
        this.f49839c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        double dDoubleValue = ((Double) obj2).doubleValue();
        a();
        d(i);
        double[] dArr = this.f49838b;
        double d5 = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49839c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        b(((Double) obj2).doubleValue());
        return true;
    }
}
