package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzaj extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzah f39236zza = new zzaj(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f39237zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f39238zzc;

    public zzaj(Object[] objArr, int i) {
        this.f39237zzb = objArr;
        this.f39238zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzr.zzb(i, this.f39238zzc, "index");
        Object obj2 = this.f39237zzb[i];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39238zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzb() {
        return this.f39237zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzd() {
        return this.f39238zzc;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.common.zzah, com.google.android.gms.internal.common.zzac
    public final int zzg(Object[] objArr, int i) {
        Object[] objArr2 = this.f39237zzb;
        int i2 = this.f39238zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }
}
