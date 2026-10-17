package com.google.android.gms.internal.play_billing;

import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes16.dex */
final class zzt implements zzdc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final WeakReference f46290zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzo f46291zzb = new zzs(this);

    public zzt(zzp zzpVar) {
        this.f46290zza = new WeakReference(zzpVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzp zzpVar = (zzp) this.f46290zza.get();
        boolean zCancel = this.f46291zzb.cancel(z);
        if (!zCancel || zzpVar == null) {
            return zCancel;
        }
        zzpVar.zza();
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f46291zzb.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f46291zzb.f46282zzc instanceof zze;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f46291zzb.isDone();
    }

    public final String toString() {
        return this.f46291zzb.toString();
    }

    public final boolean zza(Object obj2) {
        return this.f46291zzb.zzd(obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void zzb(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f46291zzb.zzb(runnable, executor);
    }

    public final boolean zzc(Throwable th10) {
        zzg zzgVar = new zzg(th10);
        zzd zzdVar = zzo.f46278zzb;
        zzo zzoVar = this.f46291zzb;
        if (!zzdVar.zzd(zzoVar, null, zzgVar)) {
            return false;
        }
        zzo.zzc(zzoVar);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f46291zzb.get(j2, timeUnit);
    }
}
