package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes16.dex */
final class zzex extends zzeu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzey f41387zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzup f41388zzb;

    public zzex(zzey zzeyVar, zzup zzupVar) {
        this.f41387zza = zzeyVar;
        this.f41388zzb = zzupVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        return this.f41388zzb.zza();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final String zzb() {
        return this.f41388zzb.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final void zzc(Throwable th10) {
        this.f41387zza.zzl(th10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final /* synthetic */ void zzd(Object obj2) {
        this.f41387zza.zzm(obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzeu
    public final boolean zzf() {
        return this.f41387zza.isDone();
    }
}
