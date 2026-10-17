package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes16.dex */
final class zzij extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final boolean f47135zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzil f47136zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final long f47137zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final String f47138zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzij(zzil zzilVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.f47136zzb = zzilVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzil.f47143zza.getAndIncrement();
        this.f47137zzc = andIncrement;
        this.f47138zzd = str;
        this.f47135zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            a.w(zzilVar.zzu, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj2) {
        zzij zzijVar = (zzij) obj2;
        boolean z = zzijVar.f47135zza;
        boolean z3 = this.f47135zza;
        if (z3 != z) {
            return !z3 ? 1 : -1;
        }
        long j2 = this.f47137zzc;
        long j3 = zzijVar.f47137zzc;
        if (j2 < j3) {
            return -1;
        }
        if (j2 > j3) {
            return 1;
        }
        this.f47136zzb.zzu.zzaW().zzh().zzb("Two tasks share the same index. index", Long.valueOf(j2));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th10) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.f47136zzb.zzu.zzaW().zze().zzb(this.f47138zzd, th10);
        if ((th10 instanceof zzih) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th10);
        }
        super.setException(th10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzij(zzil zzilVar, Callable callable, boolean z, String str) {
        super(callable);
        this.f47136zzb = zzilVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzil.f47143zza.getAndIncrement();
        this.f47137zzc = andIncrement;
        this.f47138zzd = "Task exception on worker thread";
        this.f47135zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            a.w(zzilVar.zzu, "Tasks index overflow");
        }
    }
}
