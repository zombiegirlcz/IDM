package com.google.android.gms.internal.auth;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzdv extends zzdr implements RandomAccess, zzez, zzge {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzdv f39001zza = new zzdv(new boolean[0], 0, false);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private boolean[] f39002zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private int f39003zzc;

    public zzdv() {
        this(new boolean[10], 0, true);
    }

    private final String zzf(int i) {
        return d.g(i, this.f39003zzc, "Index:", ", Size:");
    }

    private final void zzg(int i) {
        if (i < 0 || i >= this.f39003zzc) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj2) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zza();
        if (i < 0 || i > (i2 = this.f39003zzc)) {
            throw new IndexOutOfBoundsException(zzf(i));
        }
        boolean[] zArr = this.f39002zzb;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[d.D(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f39002zzb, i, zArr2, i + 1, this.f39003zzc - i);
            this.f39002zzb = zArr2;
        }
        this.f39002zzb[i] = zBooleanValue;
        this.f39003zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzfa.f39048zzd;
        collection.getClass();
        if (!(collection instanceof zzdv)) {
            return super.addAll(collection);
        }
        zzdv zzdvVar = (zzdv) collection;
        int i = zzdvVar.f39003zzc;
        if (i == 0) {
            return false;
        }
        int i2 = this.f39003zzc;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f39002zzb;
        if (i3 > zArr.length) {
            this.f39002zzb = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(zzdvVar.f39002zzb, 0, this.f39002zzb, this.f39003zzc, zzdvVar.f39003zzc);
        this.f39003zzc = i3;
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
        if (!(obj2 instanceof zzdv)) {
            return super.equals(obj2);
        }
        zzdv zzdvVar = (zzdv) obj2;
        if (this.f39003zzc != zzdvVar.f39003zzc) {
            return false;
        }
        boolean[] zArr = zzdvVar.f39002zzb;
        for (int i = 0; i < this.f39003zzc; i++) {
            if (this.f39002zzb[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zzg(i);
        return Boolean.valueOf(this.f39002zzb[i]);
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZza = 1;
        for (int i = 0; i < this.f39003zzc; i++) {
            iZza = (iZza * 31) + zzfa.zza(this.f39002zzb[i]);
        }
        return iZza;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj2) {
        if (!(obj2 instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int i = this.f39003zzc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f39002zzb[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zza();
        zzg(i);
        boolean[] zArr = this.f39002zzb;
        boolean z = zArr[i];
        if (i < this.f39003zzc - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (r2 - i) - 1);
        }
        this.f39003zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zza();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f39002zzb;
        System.arraycopy(zArr, i2, zArr, i, this.f39003zzc - i2);
        this.f39003zzc -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        zza();
        zzg(i);
        boolean[] zArr = this.f39002zzb;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39003zzc;
    }

    @Override // com.google.android.gms.internal.auth.zzez
    public final /* bridge */ /* synthetic */ zzez zzd(int i) {
        if (i >= this.f39003zzc) {
            return new zzdv(Arrays.copyOf(this.f39002zzb, i), this.f39003zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zze(boolean z) {
        zza();
        int i = this.f39003zzc;
        boolean[] zArr = this.f39002zzb;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[d.D(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f39002zzb = zArr2;
        }
        boolean[] zArr3 = this.f39002zzb;
        int i2 = this.f39003zzc;
        this.f39003zzc = i2 + 1;
        zArr3[i2] = z;
    }

    private zzdv(boolean[] zArr, int i, boolean z) {
        super(z);
        this.f39002zzb = zArr;
        this.f39003zzc = i;
    }

    @Override // com.google.android.gms.internal.auth.zzdr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj2) {
        zze(((Boolean) obj2).booleanValue());
        return true;
    }
}
