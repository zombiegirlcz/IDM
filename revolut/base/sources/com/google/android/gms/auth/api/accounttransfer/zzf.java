package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes16.dex */
final class zzf extends zzj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzg f37320zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzg zzgVar, zzl zzlVar) {
        super(zzlVar);
        this.f37320zza = zzgVar;
    }

    @Override // com.google.android.gms.internal.auth.zzan, com.google.android.gms.internal.auth.zzat
    public final void zzc(DeviceMetaData deviceMetaData) {
        this.f37320zza.f37325zzb.setResult(deviceMetaData);
    }
}
