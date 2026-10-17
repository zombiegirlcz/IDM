package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes16.dex */
final class zzep implements zzev {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final zzev f41381zza = new zzep(null);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Logger f41382zzb = Logger.getLogger(zzep.class.getName());

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final Object f41383zzc;

    public zzep(Object obj2) {
        this.f41383zzc = obj2;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f41383zzc;
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
        return j6.a.r(super.toString(), "[status=SUCCESS, result=[", String.valueOf(this.f41383zzc), "]]");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzev
    public final void zzj(Runnable runnable, Executor executor) {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f41383zzc;
    }
}
