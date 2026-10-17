package vgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class t extends Scheduler {
    public static final n d;
    public static final ScheduledExecutorService e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f289254c;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        e = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        d = new n("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public t() {
        AtomicReference atomicReference = new AtomicReference();
        this.f289254c = atomicReference;
        boolean z = r.f289250a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, d);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(r.f289250a);
        atomicReference.lazySet(scheduledThreadPoolExecutor);
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final fgm.o b() {
        return new s((ScheduledExecutorService) this.f289254c.get());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run is null");
        p pVar = new p(runnable);
        AtomicReference atomicReference = this.f289254c;
        try {
            pVar.a(j2 <= 0 ? ((ScheduledExecutorService) atomicReference.get()).submit(pVar) : ((ScheduledExecutorService) atomicReference.get()).schedule(pVar, j2, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e2) {
            jb3.l.v(e2);
            return jgm.c.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        AtomicReference atomicReference = this.f289254c;
        if (j3 > 0) {
            o oVar = new o(runnable);
            try {
                oVar.a(((ScheduledExecutorService) atomicReference.get()).scheduleAtFixedRate(oVar, j2, j3, timeUnit));
                return oVar;
            } catch (RejectedExecutionException e2) {
                jb3.l.v(e2);
                return jgm.c.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) atomicReference.get();
        f fVar = new f(runnable, scheduledExecutorService);
        try {
            fVar.a(j2 <= 0 ? scheduledExecutorService.submit(fVar) : scheduledExecutorService.schedule(fVar, j2, timeUnit));
            return fVar;
        } catch (RejectedExecutionException e4) {
            jb3.l.v(e4);
            return jgm.c.INSTANCE;
        }
    }
}
