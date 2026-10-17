package com.google.android.gms.internal.measurement;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzmw extends zzkq implements RandomAccess, zzmi, zzno {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final long[] f40485zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzmw f40486zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private long[] f40487zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40488zzd;

    static {
        long[] jArr = new long[0];
        f40485zza = jArr;
        f40486zzb = new zzmw(jArr, 0, false);
    }

    public zzmw() {
        this(f40485zza, 0, true);
    }

    public static zzmw zzf() {
        return f40486zzb;
    }

    private static int zzi(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzj(int i) {
        return d.g(i, this.f40488zzd, "Index:", ", Size:");
    }

    private final void zzk(int i) {
        if (i < 0 || i >= this.f40488zzd) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        long jLongValue = ((Long) obj2).longValue();
        zzcE();
        if (i < 0 || i > (i2 = this.f40488zzd)) {
            throw new IndexOutOfBoundsException(zzj(i));
        }
        int i3 = i + 1;
        long[] jArr = this.f40487zzc;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[zzi(length)];
            System.arraycopy(this.f40487zzc, 0, jArr2, 0, i);
            System.arraycopy(this.f40487zzc, i, jArr2, i3, this.f40488zzd - i);
            this.f40487zzc = jArr2;
        }
        this.f40487zzc[i] = jLongValue;
        this.f40488zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.f40466zzb;
        collection.getClass();
        if (!(collection instanceof zzmw)) {
            return super.addAll(collection);
        }
        zzmw zzmwVar = (zzmw) collection;
        int i = zzmwVar.f40488zzd;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40488zzd;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f40487zzc;
        if (i3 > jArr.length) {
            this.f40487zzc = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(zzmwVar.f40487zzc, 0, this.f40487zzc, this.f40488zzd, zzmwVar.f40488zzd);
        this.f40488zzd = i3;
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
        if (!(obj2 instanceof zzmw)) {
            return super.equals(obj2);
        }
        zzmw zzmwVar = (zzmw) obj2;
        if (this.f40488zzd != zzmwVar.f40488zzd) {
            return false;
        }
        long[] jArr = zzmwVar.f40487zzc;
        for (int i = 0; i < this.f40488zzd; i++) {
            if (this.f40487zzc[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzk(i);
        return Long.valueOf(this.f40487zzc[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f40488zzd; i2++) {
            long j2 = this.f40487zzc[i2];
            byte[] bArr = zzmk.f40466zzb;
            i = (i * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj2).longValue();
        int i = this.f40488zzd;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40487zzc[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzcE();
        zzk(i);
        long[] jArr = this.f40487zzc;
        long j2 = jArr[i];
        if (i < this.f40488zzd - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f40488zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f40487zzc;
        System.arraycopy(jArr, i2, jArr, i, this.f40488zzd - i2);
        this.f40488zzd -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        long jLongValue = ((Long) obj2).longValue();
        zzcE();
        zzk(i);
        long[] jArr = this.f40487zzc;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40488zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmi
    public final long zza(int i) {
        zzk(i);
        return this.f40487zzc[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzmi zzd(int i) {
        if (i >= this.f40488zzd) {
            return new zzmw(i == 0 ? f40485zza : Arrays.copyOf(this.f40487zzc, i), this.f40488zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzg(long j2) {
        zzcE();
        int i = this.f40488zzd;
        int length = this.f40487zzc.length;
        if (i == length) {
            long[] jArr = new long[zzi(length)];
            System.arraycopy(this.f40487zzc, 0, jArr, 0, this.f40488zzd);
            this.f40487zzc = jArr;
        }
        long[] jArr2 = this.f40487zzc;
        int i2 = this.f40488zzd;
        this.f40488zzd = i2 + 1;
        jArr2[i2] = j2;
    }

    public final void zzh(int i) {
        int length = this.f40487zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f40487zzc = new long[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzi(length);
        }
        this.f40487zzc = Arrays.copyOf(this.f40487zzc, length);
    }

    private zzmw(long[] jArr, int i, boolean z) {
        super(z);
        this.f40487zzc = jArr;
        this.f40488zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zzg(((Long) obj2).longValue());
        return true;
    }
}
