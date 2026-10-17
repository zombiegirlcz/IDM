package com.google.android.gms.internal.play_billing;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzcd extends zzbw {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzbw f45866zza = new zzcd(new Object[0], 0);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient Object[] f45867zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final transient int f45868zzc;

    public zzcd(Object[] objArr, int i) {
        this.f45867zzb = objArr;
        this.f45868zzc = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbj.zza(i, this.f45868zzc, "index");
        Object obj2 = this.f45867zzb[i];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f45868zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw, com.google.android.gms.internal.play_billing.zzbt
    public final int zza(Object[] objArr, int i) {
        Object[] objArr2 = this.f45867zzb;
        int i2 = this.f45868zzc;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int zzb() {
        return this.f45868zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbt
    public final Object[] zzg() {
        return this.f45867zzb;
    }
}
