package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class e1 extends b implements RandomAccess {
    public static final e1 d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f49355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49356c;

    static {
        e1 e1Var = new e1(new Object[0], 0);
        d = e1Var;
        e1Var.f49346a = false;
    }

    public e1(Object[] objArr, int i) {
        this.f49355b = objArr;
        this.f49356c = i;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        a();
        int i = this.f49356c;
        Object[] objArr = this.f49355b;
        if (i == objArr.length) {
            this.f49355b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f49355b;
        int i2 = this.f49356c;
        this.f49356c = i2 + 1;
        objArr2[i2] = obj2;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i) {
        if (i < 0 || i >= this.f49356c) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49356c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.f49355b[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public final f0 mutableCopyWithCapacity(int i) {
        if (i >= this.f49356c) {
            return new e1(Arrays.copyOf(this.f49355b, i), this.f49356c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        b(i);
        Object[] objArr = this.f49355b;
        Object obj2 = objArr[i];
        if (i < this.f49356c - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f49356c--;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        a();
        b(i);
        Object[] objArr = this.f49355b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        ((AbstractList) this).modCount++;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49356c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.f49356c)) {
            Object[] objArr = this.f49355b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[a0.d.D(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.f49355b, i, objArr2, i + 1, this.f49356c - i);
                this.f49355b = objArr2;
            }
            this.f49355b[i] = obj2;
            this.f49356c++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
        sbW.append(this.f49356c);
        throw new IndexOutOfBoundsException(sbW.toString());
    }
}
