package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class k extends c implements y0, RandomAccess, n2 {
    public static final k d = new k(new boolean[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f49740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49741c;

    public k(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f49740b = zArr;
        this.f49741c = i;
    }

    public static k c() {
        return d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.f49741c)) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49741c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        boolean[] zArr = this.f49740b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[a0.d.D(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f49740b, i, zArr2, i + 1, this.f49741c - i);
            this.f49740b = zArr2;
        }
        this.f49740b[i] = zBooleanValue;
        this.f49741c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = j1.f49738a;
        collection.getClass();
        if (!(collection instanceof k)) {
            return super.addAll(collection);
        }
        k kVar = (k) collection;
        int i = kVar.f49741c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f49741c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f49740b;
        if (i3 > zArr.length) {
            this.f49740b = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(kVar.f49740b, 0, this.f49740b, this.f49741c, kVar.f49741c);
        this.f49741c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(boolean z) {
        a();
        int i = this.f49741c;
        boolean[] zArr = this.f49740b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[a0.d.D(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f49740b = zArr2;
        }
        boolean[] zArr3 = this.f49740b;
        int i2 = this.f49741c;
        this.f49741c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f49741c) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49741c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // com.google.protobuf.i1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k mutableCopyWithCapacity(int i) {
        if (i >= this.f49741c) {
            return new k(Arrays.copyOf(this.f49740b, i), this.f49741c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return super.equals(obj2);
        }
        k kVar = (k) obj2;
        if (this.f49741c != kVar.f49741c) {
            return false;
        }
        boolean[] zArr = kVar.f49740b;
        for (int i = 0; i < this.f49741c; i++) {
            if (this.f49740b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Boolean.valueOf(this.f49740b[i]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f49741c; i2++) {
            int i3 = i * 31;
            boolean z = this.f49740b[i2];
            Charset charset = j1.f49738a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i = this.f49741c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f49740b[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        d(i);
        boolean[] zArr = this.f49740b;
        boolean z = zArr[i];
        if (i < this.f49741c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f49741c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f49740b;
        System.arraycopy(zArr, i2, zArr, i, this.f49741c - i2);
        this.f49741c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        a();
        d(i);
        boolean[] zArr = this.f49740b;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49741c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        b(((Boolean) obj2).booleanValue());
        return true;
    }
}
