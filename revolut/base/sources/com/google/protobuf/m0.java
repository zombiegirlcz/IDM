package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes17.dex */
public final class m0 extends c implements d1, RandomAccess, n2 {
    public static final m0 d = new m0(new float[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f49746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49747c;

    public m0(float[] fArr, int i, boolean z) {
        super(z);
        this.f49746b = fArr;
        this.f49747c = i;
    }

    public static m0 c() {
        return d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        float fFloatValue = ((Float) obj2).floatValue();
        a();
        if (i < 0 || i > (i2 = this.f49747c)) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49747c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
        float[] fArr = this.f49746b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[a0.d.D(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f49746b, i, fArr2, i + 1, this.f49747c - i);
            this.f49746b = fArr2;
        }
        this.f49746b[i] = fFloatValue;
        this.f49747c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = j1.f49738a;
        collection.getClass();
        if (!(collection instanceof m0)) {
            return super.addAll(collection);
        }
        m0 m0Var = (m0) collection;
        int i = m0Var.f49747c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f49747c;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f49746b;
        if (i3 > fArr.length) {
            this.f49746b = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(m0Var.f49746b, 0, this.f49746b, this.f49747c, m0Var.f49747c);
        this.f49747c = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(float f) {
        a();
        int i = this.f49747c;
        float[] fArr = this.f49746b;
        if (i == fArr.length) {
            float[] fArr2 = new float[a0.d.D(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f49746b = fArr2;
        }
        float[] fArr3 = this.f49746b;
        int i2 = this.f49747c;
        this.f49747c = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f49747c) {
            StringBuilder sbW = a0.d.w(i, "Index:", ", Size:");
            sbW.append(this.f49747c);
            throw new IndexOutOfBoundsException(sbW.toString());
        }
    }

    @Override // com.google.protobuf.i1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final m0 mutableCopyWithCapacity(int i) {
        if (i >= this.f49747c) {
            return new m0(Arrays.copyOf(this.f49746b, i), this.f49747c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return super.equals(obj2);
        }
        m0 m0Var = (m0) obj2;
        if (this.f49747c != m0Var.f49747c) {
            return false;
        }
        float[] fArr = m0Var.f49746b;
        for (int i = 0; i < this.f49747c; i++) {
            if (Float.floatToIntBits(this.f49746b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Float.valueOf(this.f49746b[i]);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f49747c; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f49746b[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj2).floatValue();
        int i = this.f49747c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f49746b[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        d(i);
        float[] fArr = this.f49746b;
        float f = fArr[i];
        if (i < this.f49747c - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (r2 - i) - 1);
        }
        this.f49747c--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        a();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f49746b;
        System.arraycopy(fArr, i2, fArr, i, this.f49747c - i2);
        this.f49747c -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        a();
        d(i);
        float[] fArr = this.f49746b;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f49747c;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        b(((Float) obj2).floatValue());
        return true;
    }
}
