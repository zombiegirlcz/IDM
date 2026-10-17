package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes16.dex */
final class zzik extends Thread {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzil f47139zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final Object f47140zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final BlockingQueue f47141zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private boolean f47142zzd = false;

    public zzik(zzil zzilVar, String str, BlockingQueue blockingQueue) {
        this.f47139zza = zzilVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.f47140zzb = new Object();
        this.f47141zzc = blockingQueue;
        setName(str);
    }

    private final void zzb() {
        zzil zzilVar = this.f47139zza;
        synchronized (zzilVar.f47150zzh) {
            try {
                if (!this.f47142zzd) {
                    zzilVar.f47151zzi.release();
                    zzilVar.f47150zzh.notifyAll();
                    if (this == zzilVar.f47144zzb) {
                        zzilVar.f47144zzb = null;
                    } else if (this == zzilVar.f47145zzc) {
                        zzilVar.f47145zzc = null;
                    } else {
                        zzilVar.zzu.zzaW().zze().zza("Current scheduler thread is neither worker nor network");
                    }
                    this.f47142zzd = true;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private final void zzc(InterruptedException interruptedException) {
        this.f47139zza.zzu.zzaW().zzk().zzb(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f47139zza.f47151zzi.acquire();
                z = true;
            } catch (InterruptedException e) {
                zzc(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f47141zzc;
                zzij zzijVar = (zzij) blockingQueue.poll();
                if (zzijVar != null) {
                    Process.setThreadPriority(true != zzijVar.f47135zza ? 10 : threadPriority);
                    zzijVar.run();
                } else {
                    Object obj2 = this.f47140zzb;
                    synchronized (obj2) {
                        if (blockingQueue.peek() == null) {
                            zzil.zzs(this.f47139zza);
                            try {
                                obj2.wait(30000L);
                            } catch (InterruptedException e2) {
                                zzc(e2);
                            }
                        }
                    }
                    synchronized (this.f47139zza.f47150zzh) {
                        if (this.f47141zzc.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th10) {
            zzb();
            throw th10;
        }
    }

    public final void zza() {
        Object obj2 = this.f47140zzb;
        synchronized (obj2) {
            obj2.notifyAll();
        }
    }
}
