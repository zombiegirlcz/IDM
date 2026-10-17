package wfm;

import efm.c0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class o extends c0 {
    public static final r d;
    public static final r e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n f297189h;
    public static final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f297190j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f297191c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final TimeUnit f297188g = TimeUnit.SECONDS;
    public static final long f = Long.getLong("rx2.io-keep-alive-time", 60).longValue();

    static {
        n nVar = new n(new r("RxCachedThreadSchedulerShutdown"));
        f297189h = nVar;
        nVar.dispose();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        r rVar = new r("RxCachedThreadScheduler", iMax, false);
        d = rVar;
        e = new r("RxCachedWorkerPoolEvictor", iMax, false);
        i = Boolean.getBoolean("rx2.io-scheduled-release");
        l lVar = new l(0L, null, rVar);
        f297190j = lVar;
        lVar.f297183c.dispose();
        ScheduledFuture scheduledFuture = lVar.e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = lVar.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public o() {
        l lVar = f297190j;
        AtomicReference atomicReference = new AtomicReference(lVar);
        this.f297191c = atomicReference;
        l lVar2 = new l(f, f297188g, d);
        while (!atomicReference.compareAndSet(lVar, lVar2)) {
            if (atomicReference.get() != lVar) {
                lVar2.f297183c.dispose();
                ScheduledFuture scheduledFuture = lVar2.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                ScheduledExecutorService scheduledExecutorService = lVar2.d;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    return;
                }
                return;
            }
        }
    }

    @Override // efm.c0
    public final c0.a b() {
        return new m((l) this.f297191c.get());
    }
}
