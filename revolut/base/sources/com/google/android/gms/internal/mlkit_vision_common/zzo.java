package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzo extends zzp {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f43424zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f43425zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzp f43426zzc;

    public zzo(zzp zzpVar, int i, int i2) {
        this.f43426zzc = zzpVar;
        this.f43424zza = i;
        this.f43425zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzf.zza(i, this.f43425zzb, "index");
        return this.f43426zzc.get(i + this.f43424zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f43425zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzb() {
        return this.f43426zzc.zzc() + this.f43424zza + this.f43425zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final int zzc() {
        return this.f43426zzc.zzc() + this.f43424zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzl
    public final Object[] zze() {
        return this.f43426zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzp, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzp subList(int i, int i2) {
        zzf.zzc(i, i2, this.f43425zzb);
        zzp zzpVar = this.f43426zzc;
        int i3 = this.f43424zza;
        return zzpVar.subList(i + i3, i2 + i3);
    }
}
