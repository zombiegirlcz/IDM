package com.google.android.gms.internal.play_billing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes16.dex */
final class zzcw implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Future f45912zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzcv f45913zzb;

    public zzcw(Future future, zzcv zzcvVar) {
        this.f45912zza = future;
        this.f45913zzb = zzcvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj2;
        Throwable thZza;
        Future future = this.f45912zza;
        if ((future instanceof zzdi) && (thZza = zzdj.zza((zzdi) future)) != null) {
            this.f45913zzb.zza(thZza);
            return;
        }
        try {
            if (!future.isDone()) {
                throw new IllegalStateException(zzbm.zzb("Future was expected to be done: %s", future));
            }
            boolean z = false;
            Future future2 = future;
            while (true) {
                try {
                    obj2 = future2.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    future2 = future2;
                } catch (Throwable th10) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th10;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.f45913zzb.zzb(obj2);
        } catch (ExecutionException e) {
            this.f45913zzb.zza(e.getCause());
        } catch (Throwable th11) {
            this.f45913zzb.zza(th11);
        }
    }

    public final String toString() {
        zzbf zzbfVarZza = zzbh.zza(this);
        zzbfVarZza.zza(this.f45913zzb);
        return zzbfVarZza.toString();
    }
}
