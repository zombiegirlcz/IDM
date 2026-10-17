package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
final class zzcu extends zzcv {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final transient int f41318zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final transient int f41319zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzcv f41320zzc;

    public zzcu(zzcv zzcvVar, int i, int i2) {
        this.f41320zzc = zzcvVar;
        this.f41318zza = i;
        this.f41319zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzbc.zza(i, this.f41319zzb, "index");
        return this.f41320zzc.get(i + this.f41318zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f41319zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zzb() {
        return this.f41320zzc.zzc() + this.f41318zza + this.f41319zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final int zzc() {
        return this.f41320zzc.zzc() + this.f41318zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcq
    public final Object[] zze() {
        return this.f41320zzc.zze();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzcv, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzcv subList(int i, int i2) {
        zzbc.zzd(i, i2, this.f41319zzb);
        zzcv zzcvVar = this.f41320zzc;
        int i3 = this.f41318zza;
        return zzcvVar.subList(i + i3, i2 + i3);
    }
}
