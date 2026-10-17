package vgm;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends Scheduler {
    public static final n d;
    public static final n e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f289238h;
    public static final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f289239j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f289240c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TimeUnit f289237g = TimeUnit.SECONDS;
    public static final long f = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    static {
        i iVar = new i(new n("RxCachedThreadSchedulerShutdown"));
        f289238h = iVar;
        iVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        n nVar = new n("RxCachedThreadScheduler", iMax, false);
        d = nVar;
        e = new n("RxCachedWorkerPoolEvictor", iMax, false);
        i = Boolean.getBoolean("rx3.io-scheduled-release");
        g gVar = new g(0L, null, nVar);
        f289239j = gVar;
        gVar.f289232c.dispose();
        ScheduledFuture scheduledFuture = gVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = gVar.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public j() {
        g gVar = f289239j;
        AtomicReference atomicReference = new AtomicReference(gVar);
        this.f289240c = atomicReference;
        g gVar2 = new g(f, f289237g, d);
        while (!atomicReference.compareAndSet(gVar, gVar2)) {
            if (atomicReference.get() != gVar) {
                gVar2.f289232c.dispose();
                ScheduledFuture scheduledFuture = gVar2.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = gVar2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final fgm.o b() {
        return new h((g) this.f289240c.get());
    }
}
