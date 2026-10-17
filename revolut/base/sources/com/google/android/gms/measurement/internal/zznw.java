package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
final class zznw implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ ConnectionResult f47564zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zznx f47565zzb;

    public zznw(zznx zznxVar, ConnectionResult connectionResult) {
        this.f47564zza = connectionResult;
        this.f47565zzb = zznxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzny zznyVar = this.f47565zzb.f47566zza;
        zznyVar.f47570zzb = null;
        if (!zznyVar.zzu.zzf().zzx(null, zzgi.zzbo) || this.f47564zza.getErrorCode() != 7777) {
            zznyVar.zzaf();
            return;
        }
        if (zznyVar.f47573zze == null) {
            zznyVar.f47573zze = Executors.newScheduledThreadPool(1);
        }
        zznyVar.f47573zze.schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznv
            @Override // java.lang.Runnable
            public final void run() {
                final zzny zznyVar2 = this.f47563zza.f47565zzb.f47566zza;
                zznyVar2.zzu.zzaX().zzq(new Runnable() { // from class: com.google.android.gms.measurement.internal.zznu
                    @Override // java.lang.Runnable
                    public final void run() {
                        zznyVar2.zzB();
                    }
                });
            }
        }, ((Long) zzgi.zzY.zza(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
