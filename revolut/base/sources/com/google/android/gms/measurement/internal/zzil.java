package com.google.android.gms.measurement.internal;

import ch.qos.logback.core.util.a;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
public final class zzil extends zzjr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final AtomicLong f47143zza = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private zzik f47144zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private zzik f47145zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final PriorityBlockingQueue f47146zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private final BlockingQueue f47147zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f47148zzf;

    /* JADX INFO: renamed from: zzg, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f47149zzg;

    /* JADX INFO: renamed from: zzh, reason: collision with root package name */
    private final Object f47150zzh;

    /* JADX INFO: renamed from: zzi, reason: collision with root package name */
    private final Semaphore f47151zzi;

    /* JADX INFO: renamed from: zzj, reason: collision with root package name */
    private volatile boolean f47152zzj;

    public zzil(zzio zzioVar) {
        super(zzioVar);
        this.f47150zzh = new Object();
        this.f47151zzi = new Semaphore(2);
        this.f47146zzd = new PriorityBlockingQueue();
        this.f47147zze = new LinkedBlockingQueue();
        this.f47148zzf = new zzii(this, "Thread death: Uncaught exception on worker thread");
        this.f47149zzg = new zzii(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean zzs(zzil zzilVar) {
        boolean z = zzilVar.f47152zzj;
        return false;
    }

    private final void zzz(zzij zzijVar) {
        synchronized (this.f47150zzh) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f47146zzd;
                priorityBlockingQueue.add(zzijVar);
                zzik zzikVar = this.f47144zzb;
                if (zzikVar == null) {
                    zzik zzikVar2 = new zzik(this, "Measurement Worker", priorityBlockingQueue);
                    this.f47144zzb = zzikVar2;
                    zzikVar2.setUncaughtExceptionHandler(this.f47148zzf);
                    this.f47144zzb.start();
                } else {
                    zzikVar.zza();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zzaY() {
        if (Thread.currentThread() != this.f47145zzc) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjr
    public final boolean zzc() {
        return false;
    }

    public final Object zze(AtomicReference atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.zzu.zzaX().zzq(runnable);
            try {
                atomicReference.wait(j2);
            } catch (InterruptedException unused) {
                this.zzu.zzaW().zzk().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            this.zzu.zzaW().zzk().zza("Timed out waiting for ".concat(str));
        }
        return obj2;
    }

    public final Future zzf(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzij zzijVar = new zzij(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f47144zzb) {
            zzz(zzijVar);
            return zzijVar;
        }
        if (!this.f47146zzd.isEmpty()) {
            a.C(this.zzu, "Callable skipped the worker queue.");
        }
        zzijVar.run();
        return zzijVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzjq
    public final void zzg() {
        if (Thread.currentThread() != this.f47144zzb) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(callable);
        zzij zzijVar = new zzij(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f47144zzb) {
            zzijVar.run();
            return zzijVar;
        }
        zzz(zzijVar);
        return zzijVar;
    }

    public final void zzn() {
        if (Thread.currentThread() == this.f47144zzb) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void zzp(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzij zzijVar = new zzij(this, runnable, false, "Task exception on network thread");
        synchronized (this.f47150zzh) {
            try {
                BlockingQueue blockingQueue = this.f47147zze;
                blockingQueue.add(zzijVar);
                zzik zzikVar = this.f47145zzc;
                if (zzikVar == null) {
                    zzik zzikVar2 = new zzik(this, "Measurement Network", blockingQueue);
                    this.f47145zzc = zzikVar2;
                    zzikVar2.setUncaughtExceptionHandler(this.f47149zzg);
                    this.f47145zzc.start();
                } else {
                    zzikVar.zza();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void zzq(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzz(new zzij(this, runnable, false, "Task exception on worker thread"));
    }

    public final void zzr(Runnable runnable) throws IllegalStateException {
        zzv();
        Preconditions.checkNotNull(runnable);
        zzz(new zzij(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean zzt() {
        return Thread.currentThread() == this.f47145zzc;
    }

    public final boolean zzu() {
        return Thread.currentThread() == this.f47144zzb;
    }
}
