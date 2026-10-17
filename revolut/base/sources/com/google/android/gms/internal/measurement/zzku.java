package com.google.android.gms.internal.measurement;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzku extends zzkq implements RandomAccess, zzmj, zzno {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final boolean[] f40399zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean[] f40400zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f40401zzc;

    static {
        boolean[] zArr = new boolean[0];
        f40399zza = zArr;
        new zzku(zArr, 0, false);
    }

    public zzku() {
        this(f40399zza, 0, true);
    }

    private static int zzg(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzh(int i) {
        return d.g(i, this.f40401zzc, "Index:", ", Size:");
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.f40401zzc) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zzcE();
        if (i < 0 || i > (i2 = this.f40401zzc)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        int i3 = i + 1;
        boolean[] zArr = this.f40400zzb;
        int length = zArr.length;
        if (i2 < length) {
            System.arraycopy(zArr, i, zArr, i3, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[zzg(length)];
            System.arraycopy(this.f40400zzb, 0, zArr2, 0, i);
            System.arraycopy(this.f40400zzb, i, zArr2, i3, this.f40401zzc - i);
            this.f40400zzb = zArr2;
        }
        this.f40400zzb[i] = zBooleanValue;
        this.f40401zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcE();
        byte[] bArr = zzmk.f40466zzb;
        collection.getClass();
        if (!(collection instanceof zzku)) {
            return super.addAll(collection);
        }
        zzku zzkuVar = (zzku) collection;
        int i = zzkuVar.f40401zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f40401zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f40400zzb;
        if (i3 > zArr.length) {
            this.f40400zzb = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(zzkuVar.f40400zzb, 0, this.f40400zzb, this.f40401zzc, zzkuVar.f40401zzc);
        this.f40401zzc = i3;
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
        if (!(obj2 instanceof zzku)) {
            return super.equals(obj2);
        }
        zzku zzkuVar = (zzku) obj2;
        if (this.f40401zzc != zzkuVar.f40401zzc) {
            return false;
        }
        boolean[] zArr = zzkuVar.f40400zzb;
        for (int i = 0; i < this.f40401zzc; i++) {
            if (this.f40400zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzi(i);
        return Boolean.valueOf(this.f40400zzb[i]);
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.f40401zzc; i++) {
            iZza = (iZza * 31) + zzmk.zza(this.f40400zzb[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i = this.f40401zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f40400zzb[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzcE();
        zzi(i);
        boolean[] zArr = this.f40400zzb;
        boolean z = zArr[i];
        if (i < this.f40401zzc - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f40401zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zzcE();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f40400zzb;
        System.arraycopy(zArr, i2, zArr, i, this.f40401zzc - i2);
        this.f40401zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zzcE();
        zzi(i);
        boolean[] zArr = this.f40400zzb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40401zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmj zzd(int i) {
        if (i >= this.f40401zzc) {
            return new zzku(i == 0 ? f40399zza : Arrays.copyOf(this.f40400zzb, i), this.f40401zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z) {
        zzcE();
        int i = this.f40401zzc;
        int length = this.f40400zzb.length;
        if (i == length) {
            boolean[] zArr = new boolean[zzg(length)];
            System.arraycopy(this.f40400zzb, 0, zArr, 0, this.f40401zzc);
            this.f40400zzb = zArr;
        }
        boolean[] zArr2 = this.f40400zzb;
        int i2 = this.f40401zzc;
        this.f40401zzc = i2 + 1;
        zArr2[i2] = z;
    }

    public final boolean zzf(int i) {
        zzi(i);
        return this.f40400zzb[i];
    }

    private zzku(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f40400zzb = zArr;
        this.f40401zzc = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zze(((Boolean) obj2).booleanValue());
        return true;
    }
}
