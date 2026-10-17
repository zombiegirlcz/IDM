package com.google.android.gms.internal.play_billing;

import a0.d;
import j6.a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes16.dex */
final class zzda implements zzdc {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final zzdb f45914zza = new zzdb(zzda.class);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f45915zzb;

    public zzda(Object obj2) {
        this.f45915zzb = obj2;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f45915zzb;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return a.r(super.toString(), "[status=SUCCESS, result=[", this.f45915zzb.toString(), "]]");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdc
    public final void zzb(Runnable runnable, Executor executor) {
        zzbj.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f45914zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", d.s("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f45915zzb;
    }
}
