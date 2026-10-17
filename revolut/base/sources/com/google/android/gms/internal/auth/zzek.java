package com.google.android.gms.internal.auth;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzek extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzek f39019zza = new zzek(new double[0], 0, false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private double[] f39020zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39021zzc;

    public zzek() {
        this(new double[10], 0, true);
    }

    private final String zzf(int i) {
        return d.g(i, this.f39021zzc, "Index:", ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.f39021zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        double dDoubleValue = ((Double) obj2).doubleValue();
        zza();
        if (i < 0 || i > (i2 = this.f39021zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        double[] dArr = this.f39020zzb;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[d.D(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f39020zzb, i, dArr2, i + 1, this.f39021zzc - i);
            this.f39020zzb = dArr2;
        }
        this.f39020zzb[i] = dDoubleValue;
        this.f39021zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.f39048zzd;
        collection.getClass();
        if (!(collection instanceof zzek)) {
            return super.addAll(collection);
        }
        zzek zzekVar = (zzek) collection;
        int i = zzekVar.f39021zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39021zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f39020zzb;
        if (i3 > dArr.length) {
            this.f39020zzb = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zzekVar.f39020zzb, 0, this.f39020zzb, this.f39021zzc, zzekVar.f39021zzc);
        this.f39021zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzek)) {
            return super.equals(obj2);
        }
        zzek zzekVar = (zzek) obj2;
        if (this.f39021zzc != zzekVar.f39021zzc) {
            return false;
        }
        double[] dArr = zzekVar.f39020zzb;
        for (int i = 0; i < this.f39021zzc; i++) {
            if (Double.doubleToLongBits(this.f39020zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Double.valueOf(this.f39020zzb[i]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f39021zzc; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f39020zzb[i2]);
            byte[] bArr = zzfa.f39048zzd;
            i = (i * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj2).doubleValue();
        int i = this.f39021zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39020zzb[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        double[] dArr = this.f39020zzb;
        double d = dArr[i];
        if (i < this.f39021zzc - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f39021zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f39020zzb;
        System.arraycopy(dArr, i2, dArr, i, this.f39021zzc - i2);
        this.f39021zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        double dDoubleValue = ((Double) obj2).doubleValue();
        zza();
        zzg(i);
        double[] dArr = this.f39020zzb;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39021zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i >= this.f39021zzc) {
            return new zzek(Arrays.copyOf(this.f39020zzb, i), this.f39021zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(double d) {
        zza();
        int i = this.f39021zzc;
        double[] dArr = this.f39020zzb;
        if (i == dArr.length) {
            double[] dArr2 = new double[d.D(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f39020zzb = dArr2;
        }
        double[] dArr3 = this.f39020zzb;
        int i2 = this.f39021zzc;
        this.f39021zzc = i2 + 1;
        dArr3[i2] = d;
    }

    private zzek(double[] dArr, int i, boolean z) {
        super(z);
        this.f39020zzb = dArr;
        this.f39021zzc = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zze(((Double) obj2).doubleValue());
        return true;
    }
}
