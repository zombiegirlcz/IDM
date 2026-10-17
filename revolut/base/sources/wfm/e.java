package wfm;

import efm.c0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends c0 {
    public static final c d;
    public static final r e;
    public static final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f297168g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f297169c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f = iAvailableProcessors;
        d dVar = new d(new r("RxComputationShutdown"));
        f297168g = dVar;
        dVar.dispose();
        r rVar = new r("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        e = rVar;
        c cVar = new c(rVar, 0);
        d = cVar;
        for (d dVar2 : cVar.f297166b) {
            dVar2.dispose();
        }
    }

    public e() {
        c cVar = d;
        AtomicReference atomicReference = new AtomicReference(cVar);
        this.f297169c = atomicReference;
        c cVar2 = new c(e, f);
        while (!atomicReference.compareAndSet(cVar, cVar2)) {
            if (atomicReference.get() != cVar) {
                d[] dVarArr = cVar2.f297166b;
                for (d dVar : dVarArr) {
                    dVar.dispose();
                }
                return;
            }
        }
    }

    @Override // efm.c0
    public final c0.a b() {
        return new b(((c) this.f297169c.get()).a());
    }

    @Override // efm.c0
    public final ifm.c d(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = ((c) this.f297169c.get()).a().f297193a;
        mfm.f.b(runnable, "run is null");
        t tVar = new t(runnable);
        try {
            tVar.a(j2 <= 0 ? scheduledExecutorService.submit(tVar) : scheduledExecutorService.schedule(tVar, j2, timeUnit));
            return tVar;
        } catch (RejectedExecutionException e2) {
            mo3.a.m(e2);
            return lfm.e.INSTANCE;
        }
    }

    @Override // efm.c0
    public final ifm.c e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        d dVarA = ((c) this.f297169c.get()).a();
        ScheduledExecutorService scheduledExecutorService = dVarA.f297193a;
        if (j3 <= 0) {
            k kVar = new k(runnable, scheduledExecutorService);
            try {
                kVar.a(j2 <= 0 ? scheduledExecutorService.submit(kVar) : scheduledExecutorService.schedule(kVar, j2, timeUnit));
                return kVar;
            } catch (RejectedExecutionException e2) {
                mo3.a.m(e2);
                return lfm.e.INSTANCE;
            }
        }
        s sVar = new s(runnable);
        try {
            sVar.a(dVarA.f297193a.scheduleAtFixedRate(sVar, j2, j3, timeUnit));
            return sVar;
        } catch (RejectedExecutionException e4) {
            mo3.a.m(e4);
            return lfm.e.INSTANCE;
        }
    }
}
