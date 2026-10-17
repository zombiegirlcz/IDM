package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes16.dex */
final class zzel implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final Future f41379zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final zzek f41380zzb;

    public zzel(Future future, zzek zzekVar) {
        this.f41379zza = future;
        this.f41380zzb = zzekVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj2;
        Throwable thZza = zzfa.zza((zzez) this.f41379zza);
        if (thZza != null) {
            this.f41380zzb.zza(thZza);
            return;
        }
        try {
            Future future = this.f41379zza;
            if (!future.isDone()) {
                throw new IllegalStateException(zzbd.zzb("Future was expected to be done: %s", future));
            }
            boolean z = false;
            while (true) {
                try {
                    obj2 = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
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
            this.f41380zzb.zzb(obj2);
        } catch (Error e) {
            e = e;
            this.f41380zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.f41380zzb.zza(e);
        } catch (ExecutionException e4) {
            this.f41380zzb.zza(e4.getCause());
        }
    }

    public final String toString() {
        zzaw zzawVarZza = zzax.zza(this);
        zzawVarZza.zza(this.f41380zzb);
        return zzawVarZza.toString();
    }
}
