package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
final class zzno implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47544zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47545zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzr f47546zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47547zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzny f47548zze;

    public zzno(zzny zznyVar, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.f47544zza = str;
        this.f47545zzb = str2;
        this.f47546zzc = zzrVar;
        this.f47547zzd = zzcyVar;
        this.f47548zze = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.internal.measurement.zzcy zzcyVar;
        zzqf zzqfVarZzw;
        zzny zznyVar;
        zzgl zzglVar;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                zznyVar = this.f47548zze;
                zzglVar = zznyVar.f47570zzb;
            } catch (RemoteException e) {
                this.f47548zze.zzu.zzaW().zze().zzd("Failed to get conditional properties; remote exception", this.f47544zza, this.f47545zzb, e);
            }
            if (zzglVar == null) {
                zzio zzioVar = zznyVar.zzu;
                zzioVar.zzaW().zze().zzc("Failed to get conditional properties; not connected to service", this.f47544zza, this.f47545zzb);
                zzqfVarZzw = zzioVar.zzw();
                zzcyVar = this.f47547zzd;
                zzqfVarZzw.zzU(zzcyVar, arrayList);
            }
            zzr zzrVar = this.f47546zzc;
            Preconditions.checkNotNull(zzrVar);
            arrayList = zzqf.zzK(zzglVar.zzi(this.f47544zza, this.f47545zzb, zzrVar));
            zznyVar.zzag();
            zzny zznyVar2 = this.f47548zze;
            zzcyVar = this.f47547zzd;
            zzqfVarZzw = zznyVar2.zzu.zzw();
            zzqfVarZzw.zzU(zzcyVar, arrayList);
        } catch (Throwable th10) {
            zzny zznyVar3 = this.f47548zze;
            zznyVar3.zzu.zzw().zzU(this.f47547zzd, arrayList);
            throw th10;
        }
    }
}
