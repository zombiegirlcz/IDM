package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX INFO: loaded from: classes16.dex */
final class zzbj extends zzbk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f44482zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f44483zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzbk f44484zzc;

    public zzbj(zzbk zzbkVar, int i, int i2) {
        this.f44484zzc = zzbkVar;
        this.f44482zza = i;
        this.f44483zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzx.zza(i, this.f44483zzb, "index");
        return this.f44484zzc.get(i + this.f44482zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f44483zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzb() {
        return this.f44484zzc.zzc() + this.f44482zza + this.f44483zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final int zzc() {
        return this.f44484zzc.zzc() + this.f44482zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbf
    public final Object[] zze() {
        return this.f44484zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzbk, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzbk subList(int i, int i2) {
        zzx.zzc(i, i2, this.f44483zzb);
        int i3 = this.f44482zza;
        return this.f44484zzc.subList(i + i3, i2 + i3);
    }
}
