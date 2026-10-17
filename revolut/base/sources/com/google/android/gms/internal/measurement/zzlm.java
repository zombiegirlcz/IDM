package com.google.android.gms.internal.measurement;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzlm extends zzkq implements RandomAccess, zzmj, zzno {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final double[] f40423zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private double[] f40424zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f40425zzc;

    static {
        double[] dArr = new double[0];
        f40423zza = dArr;
        new zzlm(dArr, 0, false);
    }

    public zzlm() {
        this(f40423zza, 0, true);
    }

    private static int zzh(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzi(int i) {
        return d.g(i, this.f40425zzc, "Index:", ", Size:");
    }

    private final void zzj(int i) {
        if (i < 0 || i >= this.f40425zzc) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        double dDoubleValue = ((Double) obj2).doubleValue();
        zzcE();
        if (i < 0 || i > (i2 = this.f40425zzc)) {
            throw new IndexOutOfBoundsException(zzi(i));
        }
        int i3 = i + 1;
        double[] dArr = this.f40424zzb;
        int length = dArr.length;
        if (i2 < length) {
            System.arraycopy(dArr, i, dArr, i3, i2 - i);
        } else {
            double[] dArr2 = new double[zzh(length)];
            System.arraycopy(this.f40424zzb, 0, dArr2, 0, i);
            System.arraycopy(this.f40424zzb, i, dArr2, i3, this.f40425zzc - i);
            this.f40424zzb = dArr2;
        }
        this.f40424zzb[i] = dDoubleValue;
        this.f40425zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.f40466zzb;
        collection.getClass();
        if (!(collection instanceof zzlm)) {
            return super.addAll(collection);
        }
        zzlm zzlmVar = (zzlm) collection;
        int i = zzlmVar.f40425zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40425zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f40424zzb;
        if (i3 > dArr.length) {
            this.f40424zzb = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(zzlmVar.f40424zzb, 0, this.f40424zzb, this.f40425zzc, zzlmVar.f40425zzc);
        this.f40425zzc = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj2) {
        return indexOf(obj2) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zzlm)) {
            return super.equals(obj2);
        }
        zzlm zzlmVar = (zzlm) obj2;
        if (this.f40425zzc != zzlmVar.f40425zzc) {
            return false;
        }
        double[] dArr = zzlmVar.f40424zzb;
        for (int i = 0; i < this.f40425zzc; i++) {
            if (Double.doubleToLongBits(this.f40424zzb[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzj(i);
        return Double.valueOf(this.f40424zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f40425zzc; i2++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f40424zzb[i2]);
            byte[] bArr = zzmk.f40466zzb;
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
        int i = this.f40425zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40424zzb[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzcE();
        zzj(i);
        double[] dArr = this.f40424zzb;
        double d = dArr[i];
        if (i < this.f40425zzc - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (r3 - i) - 1);
        }
        this.f40425zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f40424zzb;
        System.arraycopy(dArr, i2, dArr, i, this.f40425zzc - i2);
        this.f40425zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        double dDoubleValue = ((Double) obj2).doubleValue();
        zzcE();
        zzj(i);
        double[] dArr = this.f40424zzb;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40425zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmj zzd(int i) {
        if (i >= this.f40425zzc) {
            return new zzlm(i == 0 ? f40423zza : Arrays.copyOf(this.f40424zzb, i), this.f40425zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i) {
        zzj(i);
        return this.f40424zzb[i];
    }

    public final void zzf(double d) {
        zzcE();
        int i = this.f40425zzc;
        int length = this.f40424zzb.length;
        if (i == length) {
            double[] dArr = new double[zzh(length)];
            System.arraycopy(this.f40424zzb, 0, dArr, 0, this.f40425zzc);
            this.f40424zzb = dArr;
        }
        double[] dArr2 = this.f40424zzb;
        int i2 = this.f40425zzc;
        this.f40425zzc = i2 + 1;
        dArr2[i2] = d;
    }

    public final void zzg(int i) {
        int length = this.f40424zzb.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f40424zzb = new double[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzh(length);
        }
        this.f40424zzb = Arrays.copyOf(this.f40424zzb, length);
    }

    private zzlm(double[] dArr, int i, boolean z) {
        super(z);
        this.f40424zzb = dArr;
        this.f40425zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zzf(((Double) obj2).doubleValue());
        return true;
    }
}
