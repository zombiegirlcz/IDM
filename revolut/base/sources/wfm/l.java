package wfm;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f297181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f297182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifm.b f297183c;
    public final ScheduledExecutorService d;
    public final ScheduledFuture e;
    public final ThreadFactory f;

    public l(long j2, TimeUnit timeUnit, ThreadFactory threadFactory) {
        l lVar;
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool;
        ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
        long nanos = timeUnit != null ? timeUnit.toNanos(j2) : 0L;
        this.f297181a = nanos;
        this.f297182b = new ConcurrentLinkedQueue();
        this.f297183c = new ifm.b();
        this.f = threadFactory;
        if (timeUnit != null) {
            scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, o.e);
            lVar = this;
            scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(lVar, nanos, nanos, TimeUnit.NANOSECONDS);
        } else {
            lVar = this;
            scheduledExecutorServiceNewScheduledThreadPool = null;
            scheduledFutureScheduleWithFixedDelay = null;
        }
        lVar.d = scheduledExecutorServiceNewScheduledThreadPool;
        lVar.e = scheduledFutureScheduleWithFixedDelay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue<n> concurrentLinkedQueue = this.f297182b;
        if (concurrentLinkedQueue.isEmpty()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        for (n nVar : concurrentLinkedQueue) {
            if (nVar.f297187c > jNanoTime) {
                return;
            }
            if (concurrentLinkedQueue.remove(nVar)) {
                this.f297183c.c(nVar);
            }
        }
    }
}
