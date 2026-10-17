package wfm;

import efm.c0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public class q extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f297193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f297194b;

    public q(ThreadFactory threadFactory) {
        boolean z = v.f297201a;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (v.f297201a && (scheduledExecutorServiceNewScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            v.d.put((ScheduledThreadPoolExecutor) scheduledExecutorServiceNewScheduledThreadPool, scheduledExecutorServiceNewScheduledThreadPool);
        }
        this.f297193a = scheduledExecutorServiceNewScheduledThreadPool;
    }

    @Override // efm.c0.a
    public final ifm.c a(Runnable runnable) {
        return b(runnable, 0L, null);
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f297194b ? lfm.e.INSTANCE : d(runnable, j2, timeUnit, null);
    }

    public final u d(Runnable runnable, long j2, TimeUnit timeUnit, lfm.c cVar) {
        u uVar = new u(runnable, cVar);
        if (cVar != null && !cVar.a(uVar)) {
            return uVar;
        }
        ScheduledExecutorService scheduledExecutorService = this.f297193a;
        try {
            uVar.a(j2 <= 0 ? scheduledExecutorService.submit((Callable) uVar) : scheduledExecutorService.schedule((Callable) uVar, j2, timeUnit));
            return uVar;
        } catch (RejectedExecutionException e) {
            if (cVar != null) {
                cVar.c(uVar);
            }
            mo3.a.m(e);
            return uVar;
        }
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f297194b) {
            return;
        }
        this.f297194b = true;
        this.f297193a.shutdownNow();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f297194b;
    }
}
