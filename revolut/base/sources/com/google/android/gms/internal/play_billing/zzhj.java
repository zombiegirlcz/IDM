package com.google.android.gms.internal.play_billing;

import a0.d;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes16.dex */
final class zzhj extends zzeh implements RandomAccess {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Object[] f46090zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhj f46091zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private Object[] f46092zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private int f46093zzd;

    static {
        Object[] objArr = new Object[0];
        f46090zza = objArr;
        f46091zzb = new zzhj(objArr, 0, false);
    }

    public zzhj() {
        this(f46090zza, 0, true);
    }

    public static zzhj zze() {
        return f46091zzb;
    }

    private static int zzg(int i) {
        return Math.max(((i * 3) / 2) + 1, 10);
    }

    private final String zzh(int i) {
        return d.g(i, this.f46093zzd, "Index:", ", Size:");
    }

    private final void zzi(int i) {
        if (i < 0 || i >= this.f46093zzd) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj2) {
        int i2;
        zza();
        if (i < 0 || i > (i2 = this.f46093zzd)) {
            throw new IndexOutOfBoundsException(zzh(i));
        }
        int i3 = i + 1;
        Object[] objArr = this.f46092zzc;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[zzg(length)];
            System.arraycopy(this.f46092zzc, 0, objArr2, 0, i);
            System.arraycopy(this.f46092zzc, i, objArr2, i3, this.f46093zzd - i);
            this.f46092zzc = objArr2;
        }
        this.f46092zzc[i] = obj2;
        this.f46093zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zzi(i);
        return this.f46092zzc[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        zza();
        zzi(i);
        Object[] objArr = this.f46092zzc;
        Object obj2 = objArr[i];
        if (i < this.f46093zzd - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f46093zzd--;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj2) {
        zza();
        zzi(i);
        Object[] objArr = this.f46092zzc;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        ((AbstractList) this).modCount++;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f46093zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzfz
    public final /* bridge */ /* synthetic */ zzfz zzd(int i) {
        if (i >= this.f46093zzd) {
            return new zzhj(i == 0 ? f46090zza : Arrays.copyOf(this.f46092zzc, i), this.f46093zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzf(int i) {
        int length = this.f46092zzc.length;
        if (i <= length) {
            return;
        }
        if (length == 0) {
            this.f46092zzc = new Object[Math.max(i, 10)];
            return;
        }
        while (length < i) {
            length = zzg(length);
        }
        this.f46092zzc = Arrays.copyOf(this.f46092zzc, length);
    }

    private zzhj(Object[] objArr, int i, boolean z) {
        super(z);
        this.f46092zzc = objArr;
        this.f46093zzd = i;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj2) {
        zza();
        int i = this.f46093zzd;
        int length = this.f46092zzc.length;
        if (i == length) {
            this.f46092zzc = Arrays.copyOf(this.f46092zzc, zzg(length));
        }
        Object[] objArr = this.f46092zzc;
        int i2 = this.f46093zzd;
        this.f46093zzd = i2 + 1;
        objArr[i2] = obj2;
        ((AbstractList) this).modCount++;
        return true;
    }
}
