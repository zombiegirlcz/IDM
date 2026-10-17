package wfm;

import efm.c0;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class x extends c0 {
    public static final r d;
    public static final ScheduledExecutorService e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f297207c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        d = new r("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public x() {
        AtomicReference atomicReference = new AtomicReference();
        this.f297207c = atomicReference;
        boolean z = v.f297201a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, d);
        if (v.f297201a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            v.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        atomicReference.lazySet(scheduledExecutorServiceNewScheduledThreadPool);
    }

    @Override // efm.c0
    public final c0.a b() {
        return new w((ScheduledExecutorService) this.f297207c.get());
    }

    @Override // efm.c0
    public final ifm.c d(Runnable runnable, long j2, TimeUnit timeUnit) {
        mfm.f.b(runnable, "run is null");
        t tVar = new t(runnable);
        AtomicReference atomicReference = this.f297207c;
        try {
            tVar.a(j2 <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(tVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(tVar, j2, timeUnit));
            return tVar;
        } catch (RejectedExecutionException e2) {
            mo3.a.m(e2);
            return lfm.e.INSTANCE;
        }
    }

    @Override // efm.c0
    public final ifm.c e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        AtomicReference atomicReference = this.f297207c;
        if (j3 > 0) {
            s sVar = new s(runnable);
            try {
                sVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(sVar, j2, j3, timeUnit));
                return sVar;
            } catch (RejectedExecutionException e2) {
                mo3.a.m(e2);
                return lfm.e.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        k kVar = new k(runnable, scheduledExecutorService);
        try {
            kVar.a(j2 <= 0 ? scheduledExecutorService.submit(kVar) : scheduledExecutorService.schedule(kVar, j2, timeUnit));
            return kVar;
        } catch (RejectedExecutionException e4) {
            mo3.a.m(e4);
            return lfm.e.INSTANCE;
        }
    }
}
