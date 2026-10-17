package com.google.android.gms.internal.measurement;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zznq extends zzkq implements RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object[] f40517zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zznq f40518zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Object[] f40519zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f40520zzd;

    static {
        Object[] objArr = new Object[0];
        f40517zza = objArr;
        f40518zzb = new zznq(objArr, 0, false);
    }

    public zznq() {
        this(f40517zza, 0, true);
    }

    public static zznq zze() {
        return f40518zzb;
    }

    private static int zzg(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzh(int i) {
        return d.g(i, this.f40520zzd, "Index:", ", Size:");
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.f40520zzd) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        zzcE();
        if (i < 0 || i > (i2 = this.f40520zzd)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.f40519zzc;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.f40519zzc, 0, objArr2, 0, i);
            System.arraycopy(this.f40519zzc, i, objArr2, i3, this.f40520zzd - i);
            this.f40519zzc = objArr2;
        }
        this.f40519zzc[i] = obj2;
        this.f40520zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzi(i);
        return this.f40519zzc[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zzcE();
        zzi(i);
        Object[] objArr = this.f40519zzc;
        Object obj2 = objArr[i];
        if (i < this.f40520zzd - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f40520zzd--;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        zzcE();
        zzi(i);
        Object[] objArr = this.f40519zzc;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        ((AbstractList) this).modCount++;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40520zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmj
    public final /* bridge */ /* synthetic */ zzmj zzd(int i) {
        if (i >= this.f40520zzd) {
            return new zznq(i == 0 ? f40517zza : Arrays.copyOf(this.f40519zzc, i), this.f40520zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i) {
        int length = this.f40519zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f40519zzc = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzg(length);
        }
        this.f40519zzc = Arrays.copyOf(this.f40519zzc, length);
    }

    private zznq(Object[] objArr, int i, boolean z) {
        super(z);
        this.f40519zzc = objArr;
        this.f40520zzd = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzkq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        zzcE();
        int i = this.f40520zzd;
        int length = this.f40519zzc.length;
        if (i == length) {
            this.f40519zzc = Arrays.copyOf(this.f40519zzc, zzg(length));
        }
        Object[] objArr = this.f40519zzc;
        int i2 = this.f40520zzd;
        this.f40520zzd = i2 + 1;
        objArr[i2] = obj2;
        ((AbstractList) this).modCount++;
        return true;
    }
}
