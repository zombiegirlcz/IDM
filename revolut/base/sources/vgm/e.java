package vgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public final class e extends Scheduler {
    public static final c d;
    public static final n e;
    public static final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f289225g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f289226c;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        int iIntValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (iIntValue > 0 && iIntValue <= iAvailableProcessors) {
            iAvailableProcessors = iIntValue;
        }
        f = iAvailableProcessors;
        d dVar = new d(new n("RxComputationShutdown"));
        f289225g = dVar;
        dVar.dispose();
        n nVar = new n("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        e = nVar;
        c cVar = new c(nVar, 0);
        d = cVar;
        for (d dVar2 : cVar.f289223b) {
            dVar2.dispose();
        }
    }

    public e() {
        c cVar = d;
        AtomicReference atomicReference = new AtomicReference(cVar);
        this.f289226c = atomicReference;
        c cVar2 = new c(e, f);
        while (!atomicReference.compareAndSet(cVar, cVar2)) {
            if (atomicReference.get() != cVar) {
                d[] dVarArr = cVar2.f289223b;
                for (d dVar : dVarArr) {
                    dVar.dispose();
                }
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final fgm.o b() {
        return new b(((c) this.f289226c.get()).a());
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable d(Runnable runnable, long j2, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((c) this.f289226c.get()).a().f289242a;
        Objects.requireNonNull(runnable, "run is null");
        p pVar = new p(runnable);
        try {
            pVar.a(j2 <= 0 ? scheduledThreadPoolExecutor.submit(pVar) : scheduledThreadPoolExecutor.schedule(pVar, j2, timeUnit));
            return pVar;
        } catch (RejectedExecutionException e2) {
            jb3.l.v(e2);
            return jgm.c.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public final Disposable e(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ((c) this.f289226c.get()).a().f289242a;
        if (j3 <= 0) {
            f fVar = new f(runnable, scheduledThreadPoolExecutor);
            try {
                fVar.a(j2 <= 0 ? scheduledThreadPoolExecutor.submit(fVar) : scheduledThreadPoolExecutor.schedule(fVar, j2, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e2) {
                jb3.l.v(e2);
                return jgm.c.INSTANCE;
            }
        }
        o oVar = new o(runnable);
        try {
            oVar.a(scheduledThreadPoolExecutor.scheduleAtFixedRate(oVar, j2, j3, timeUnit));
            return oVar;
        } catch (RejectedExecutionException e4) {
            jb3.l.v(e4);
            return jgm.c.INSTANCE;
        }
    }
}
