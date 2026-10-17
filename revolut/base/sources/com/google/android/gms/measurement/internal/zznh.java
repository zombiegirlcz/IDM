package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes16.dex */
final class zznh implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbh f47522zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47523zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47524zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzny f47525zzd;

    public zznh(zzny zznyVar, zzbh zzbhVar, String str, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.f47522zza = zzbhVar;
        this.f47523zzb = str;
        this.f47524zzc = zzcyVar;
        this.f47525zzd = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcy zzcyVar;
        zzqf zzqfVarZzw;
        zzny zznyVar;
        zzgl zzglVar;
        byte[] bArrZzD = null;
        try {
            try {
                zznyVar = this.f47525zzd;
                zzglVar = zznyVar.f47570zzb;
            } catch (RemoteException e) {
                this.f47525zzd.zzu.zzaW().zze().zzb("Failed to send event to the service to bundle", e);
            }
            if (zzglVar == null) {
                zzio zzioVar = zznyVar.zzu;
                zzioVar.zzaW().zze().zza("Discarding data. Failed to send event to service to bundle");
                zzqfVarZzw = zzioVar.zzw();
                zzcyVar = this.f47524zzc;
                zzqfVarZzw.zzW(zzcyVar, bArrZzD);
            }
            bArrZzD = zzglVar.zzD(this.f47522zza, this.f47523zzb);
            zznyVar.zzag();
            zzny zznyVar2 = this.f47525zzd;
            zzcyVar = this.f47524zzc;
            zzqfVarZzw = zznyVar2.zzu.zzw();
            zzqfVarZzw.zzW(zzcyVar, bArrZzD);
        } catch (Throwable th10) {
            zzny zznyVar3 = this.f47525zzd;
            zznyVar3.zzu.zzw().zzW(this.f47524zzc, null);
            throw th10;
        }
    }
}
