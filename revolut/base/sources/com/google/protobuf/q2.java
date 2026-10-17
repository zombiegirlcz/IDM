package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends c implements RandomAccess {
    public static final q2 d = new q2(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f49775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49776c;

    public q2(Object[] objArr, int i, boolean z) {
        super(z);
        this.f49775b = objArr;
        this.f49776c = i;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        a();
        int i = this.f49776c;
        Object[] objArr = this.f49775b;
        if (i == objArr.length) {
            this.f49775b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f49775b;
        int i2 = this.f49776c;
        this.f49776c = i2 + 1;
        objArr2[i2] = obj2;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f49776c) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49776c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f49775b[i];
    }

    @Override // com.google.protobuf.i1
    public final i1 mutableCopyWithCapacity(int i) {
        if (i >= this.f49776c) {
            return new q2(Arrays.copyOf(this.f49775b, i), this.f49776c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f49775b;
        Object obj2 = objArr[i];
        if (i < this.f49776c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f49776c--;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        a();
        b(i);
        Object[] objArr = this.f49775b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        ((AbstractList) this).modCount++;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49776c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.f49776c)) {
            Object[] objArr = this.f49775b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[a0.d.D(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f49775b, i, objArr2, i + 1, this.f49776c - i);
                this.f49775b = objArr2;
            }
            this.f49775b[i] = obj2;
            this.f49776c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
        sbW.append(this.f49776c);
        throw new IndexOutOfBoundsException(sbW.toString());
    }
}
