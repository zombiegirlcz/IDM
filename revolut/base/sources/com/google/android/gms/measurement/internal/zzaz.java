package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzaz {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static volatile Handler f46916zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzjs f46917zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Runnable f46918zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private volatile long f46919zzd;

    public zzaz(zzjs zzjsVar) {
        Preconditions.checkNotNull(zzjsVar);
        this.f46917zzb = zzjsVar;
        this.f46918zzc = new zzay(this, zzjsVar);
    }

    private final Handler zzf() {
        Handler handler;
        if (f46916zza != null) {
            return f46916zza;
        }
        synchronized (zzaz.class) {
            try {
                if (f46916zza == null) {
                    f46916zza = new com.google.android.gms.internal.measurement.zzcr(this.f46917zzb.zzaT().getMainLooper());
                }
                handler = f46916zza;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return handler;
    }

    public final void zzb() {
        this.f46919zzd = 0L;
        zzf().removeCallbacks(this.f46918zzc);
    }

    public abstract void zzc();

    public final void zzd(long j2) {
        zzb();
        if (j2 >= 0) {
            zzjs zzjsVar = this.f46917zzb;
            this.f46919zzd = zzjsVar.zzaU().currentTimeMillis();
            if (zzf().postDelayed(this.f46918zzc, j2)) {
                return;
            }
            zzjsVar.zzaW().zze().zzb("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    public final boolean zze() {
        return this.f46919zzd != 0;
    }
}
