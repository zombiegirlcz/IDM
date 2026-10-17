package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes16.dex */
abstract class zzeu extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final Runnable f41385zza = new zzet(null);

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final Runnable f41386zzb = new zzet(null);

    private final void zzg(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzer zzerVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzer)) {
                if (runnable != f41386zzb) {
                    break;
                }
            } else {
                zzerVar = (zzer) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f41386zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzerVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzf = zzf();
            if (!zZzf) {
                try {
                    objZza = zza();
                } catch (Throwable th10) {
                    try {
                        if (th10 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, f41385zza)) {
                            zzg(threadCurrentThread);
                        }
                        zzc(th10);
                        return;
                    } catch (Throwable th11) {
                        if (!compareAndSet(threadCurrentThread, f41385zza)) {
                            zzg(threadCurrentThread);
                        }
                        zzd(null);
                        throw th11;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, f41385zza)) {
                zzg(threadCurrentThread);
            }
            if (zZzf) {
                return;
            }
            zzd(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return com.google.android.gms.internal.mlkit_vision_face.a.o(runnable == f41385zza ? "running=[DONE]" : runnable instanceof zzer ? "running=[INTERRUPTED]" : runnable instanceof Thread ? p.a.p("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", zzb());
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzc(Throwable th10);

    public abstract void zzd(Object obj2);

    public final void zze() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzer zzerVar = new zzer(this, null);
            zzerVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzerVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f41385zza)) == f41386zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th10) {
                    if (((Runnable) getAndSet(f41385zza)) == f41386zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th10;
                }
            }
        }
    }

    public abstract boolean zzf();
}
