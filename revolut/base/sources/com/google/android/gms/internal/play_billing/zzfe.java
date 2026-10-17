package com.google.android.gms.internal.play_billing;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzfe extends zzeh implements RandomAccess, zzfz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final double[] f45988zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private double[] f45989zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f45990zzc;

    static {
        double[] dArr = new double[0];
        f45988zza = dArr;
        new zzfe(dArr, 0, false);
    }

    public zzfe() {
        this(f45988zza, 0, true);
    }

    private static int zzh(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzi(int i) {
        return d.g(i, this.f45990zzc, "Index:", ", Size:");
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.f45990zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        double dDoubleValue = ((Double) obj2).doubleValue();
        zza();
        if (i < 0 || i > (i2 = this.f45990zzc)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        double[] dArr = this.f45989zzb;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[zzh(length)];
            System.arraycopy(this.f45989zzb, 0, dArr2, 0, i);
            System.arraycopy(this.f45989zzb, i, dArr2, i3, this.f45990zzc - i);
            this.f45989zzb = dArr2;
        }
        this.f45989zzb[i] = dDoubleValue;
        this.f45990zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzga.f46030zzb;
        collection.getClass();
        if (!(collection instanceof zzfe)) {
            return super.addAll(collection);
        }
        zzfe zzfeVar = (zzfe) collection;
        int i = zzfeVar.f45990zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f45990zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f45989zzb;
        if (i3 > dArr.length) {
            this.f45989zzb = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zzfeVar.f45989zzb, 0, this.f45989zzb, this.f45990zzc, zzfeVar.f45990zzc);
        this.f45990zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzfe)) {
            return super.equals(obj2);
        }
        zzfe zzfeVar = (zzfe) obj2;
        if (this.f45990zzc != zzfeVar.f45990zzc) {
            return false;
        }
        double[] dArr = zzfeVar.f45989zzb;
        for (int i = 0; i < this.f45990zzc; i++) {
            if (Double.doubleToLongBits(this.f45989zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Double.valueOf(this.f45989zzb[i]);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f45990zzc; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f45989zzb[i2]);
            byte[] bArr = zzga.f46030zzb;
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
        int i = this.f45990zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f45989zzb[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzj(i);
        double[] dArr = this.f45989zzb;
        double d = dArr[i];
        if (i < this.f45990zzc - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f45990zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f45989zzb;
        System.arraycopy(dArr, i2, dArr, i, this.f45990zzc - i2);
        this.f45990zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        double dDoubleValue = ((Double) obj2).doubleValue();
        zza();
        zzj(i);
        double[] dArr = this.f45989zzb;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45990zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final /* bridge */ /* synthetic */ zzfz zzd(int i) {
        if (i >= this.f45990zzc) {
            return new zzfe(i == 0 ? f45988zza : Arrays.copyOf(this.f45989zzb, i), this.f45990zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i) {
        zzj(i);
        return this.f45989zzb[i];
    }

    public final void zzf(double d) {
        zza();
        int i = this.f45990zzc;
        int length = this.f45989zzb.length;
        if (i == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.f45989zzb, 0, dArr, 0, this.f45990zzc);
            this.f45989zzb = dArr;
        }
        double[] dArr2 = this.f45989zzb;
        int i2 = this.f45990zzc;
        this.f45990zzc = i2 + 1;
        dArr2[i2] = d;
    }

    public final void zzg(int i) {
        int length = this.f45989zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f45989zzb = new double[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.f45989zzb = Arrays.copyOf(this.f45989zzb, length);
    }

    private zzfe(double[] dArr, int i, boolean z) {
        super(z);
        this.f45989zzb = dArr;
        this.f45990zzc = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zzf(((Double) obj2).doubleValue());
        return true;
    }
}
