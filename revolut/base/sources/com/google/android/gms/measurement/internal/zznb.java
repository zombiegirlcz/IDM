package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zznb implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47507zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47508zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzny f47509zzc;

    public zznb(zzny zznyVar, zzr zzrVar, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.f47507zza = zzrVar;
        this.f47508zzb = zzcyVar;
        this.f47509zzc = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcy zzcyVar;
        zzqf zzqfVarZzw;
        zzny zznyVar;
        zzio zzioVar;
        String strZzf = null;
        try {
            try {
                zznyVar = this.f47509zzc;
                zzioVar = zznyVar.zzu;
            } catch (RemoteException e) {
                this.f47509zzc.zzu.zzaW().zze().zzb("Failed to get app instance id", e);
            }
            if (zzioVar.zzm().zzh().zzr(zzjw.ANALYTICS_STORAGE)) {
                zzgl zzglVar = zznyVar.f47570zzb;
                if (zzglVar != null) {
                    zzr zzrVar = this.f47507zza;
                    Preconditions.checkNotNull(zzrVar);
                    strZzf = zzglVar.zzf(zzrVar);
                    if (strZzf != null) {
                        zznyVar.zzu.zzq().zzac(strZzf);
                        zzioVar.zzm().f47094zze.zzb(strZzf);
                    }
                    zznyVar.zzag();
                    zzny zznyVar2 = this.f47509zzc;
                    zzcyVar = this.f47508zzb;
                    zzqfVarZzw = zznyVar2.zzu.zzw();
                    zzqfVarZzw.zzZ(zzcyVar, strZzf);
                }
                zzioVar.zzaW().zze().zza("Failed to get app instance id");
            } else {
                zzioVar.zzaW().zzl().zza("Analytics storage consent denied; will not get app instance id");
                zznyVar.zzu.zzq().zzac(null);
                zzioVar.zzm().f47094zze.zzb(null);
            }
            zzqfVarZzw = zzioVar.zzw();
            zzcyVar = this.f47508zzb;
            zzqfVarZzw.zzZ(zzcyVar, strZzf);
        } catch (Throwable th10) {
            zzny zznyVar3 = this.f47509zzc;
            zznyVar3.zzu.zzw().zzZ(this.f47508zzb, null);
            throw th10;
        }
    }
}
