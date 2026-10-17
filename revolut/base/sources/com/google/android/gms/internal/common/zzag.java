package com.google.android.gms.internal.common;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final class zzag extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f39231zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f39232zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzah f39233zzc;

    public zzag(zzah zzahVar, int i, int i2) {
        Objects.requireNonNull(zzahVar);
        this.f39233zzc = zzahVar;
        this.f39231zza = i;
        this.f39232zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzr.zzb(i, this.f39232zzb, "index");
        return this.f39233zzc.get(i + this.f39231zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f39232zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final Object[] zzb() {
        return this.f39233zzc.zzb();
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzc() {
        return this.f39233zzc.zzc() + this.f39231zza;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final int zzd() {
        return this.f39233zzc.zzc() + this.f39231zza + this.f39232zzb;
    }

    @Override // com.google.android.gms.internal.common.zzac
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    /* JADX INFO: renamed from: zzi */
    public final zzah subList(int i, int i2) {
        zzr.zzd(i, i2, this.f39232zzb);
        int i3 = this.f39231zza;
        return this.f39233zzc.subList(i + i3, i2 + i3);
    }
}
