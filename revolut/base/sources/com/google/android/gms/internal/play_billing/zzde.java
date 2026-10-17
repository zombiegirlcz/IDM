package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
final class zzde implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    zzdh f45919zza;

    public zzde(zzdh zzdhVar) {
        this.f45919zza = zzdhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzdc zzdcVar;
        zzdh zzdhVar = this.f45919zza;
        if (zzdhVar == null || (zzdcVar = zzdhVar.f45920zzd) == null) {
            return;
        }
        this.f45919zza = null;
        if (zzdcVar.isDone()) {
            zzdhVar.zzj(zzdcVar);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = zzdhVar.f45921zze;
            zzdhVar.f45921zze = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                } catch (Throwable th10) {
                    zzdhVar.zzi(new zzdf(str, null));
                    throw th10;
                }
            }
            zzdhVar.zzi(new zzdf(str + ": " + zzdcVar.toString(), null));
        } finally {
            zzdcVar.cancel(true);
        }
    }
}
