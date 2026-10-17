package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import ch.qos.logback.core.util.a;

/* JADX INFO: loaded from: classes16.dex */
final class zznf implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzmh f47515zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzny f47516zzb;

    public zznf(zzny zznyVar, zzmh zzmhVar) {
        this.f47515zza = zzmhVar;
        this.f47516zzb = zznyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47516zzb;
        zzgl zzglVar = zznyVar.f47570zzb;
        if (zzglVar == null) {
            a.w(zznyVar.zzu, "Failed to send current screen to service");
            return;
        }
        try {
            zzmh zzmhVar = this.f47515zza;
            if (zzmhVar == null) {
                zzglVar.zzw(0L, null, null, zznyVar.zzu.zzaT().getPackageName());
            } else {
                zzglVar.zzw(zzmhVar.f47437zzc, zzmhVar.f47435zza, zzmhVar.f47436zzb, zznyVar.zzu.zzaT().getPackageName());
            }
            zznyVar.zzag();
        } catch (RemoteException e) {
            this.f47516zzb.zzu.zzaW().zze().zzb("Failed to send current screen to the service", e);
        }
    }
}
