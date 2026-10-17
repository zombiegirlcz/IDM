package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
final class zzur implements zzek {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzpk f42515zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ float f42516zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzuv f42517zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ float f42518zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzus f42519zze;

    public zzur(zzus zzusVar, zzpk zzpkVar, float f, zzuv zzuvVar, float f4) {
        this.f42519zze = zzusVar;
        this.f42515zza = zzpkVar;
        this.f42516zzb = f;
        this.f42517zzc = zzuvVar;
        this.f42518zzd = f4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final void zza(Throwable th10) {
        zzus.f42520zzf.w("AutoZoom", "Unable to set zoom to " + this.f42518zzd, th10);
        this.f42519zze.f42526zzg.set(false);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzek
    public final /* bridge */ /* synthetic */ void zzb(Object obj2) {
        Float f = (Float) obj2;
        if (f.floatValue() >= 1.0f) {
            zzus.zzg(this.f42519zze, f.floatValue());
            this.f42519zze.zzq(this.f42515zza, this.f42516zzb, f.floatValue(), this.f42517zzc);
        }
        this.f42519zze.f42526zzg.set(false);
    }
}
