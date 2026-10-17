package skm;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes13.dex */
public final class a1 extends kotlinx.coroutines.c implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f263954b;

    public a1(Executor executor) {
        Method method;
        this.f263954b = executor;
        Method method2 = zkm.a.f323093a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = zkm.a.f323093a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f263954b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.f263954b.execute(runnable);
        } catch (RejectedExecutionException e) {
            e0.j(coroutineContext, d9.e1.a("The task was rejected", e));
            p0 p0Var = p0.f264001a;
            elm.f.f127540b.dispatch(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof a1) && ((a1) obj2).f263954b == this.f263954b;
    }

    @Override // skm.i0
    public final void g(long j2, l lVar) {
        Executor executor = this.f263954b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            r8.d dVar = new r8.d(7, this, false, lVar);
            CoroutineContext coroutineContext = lVar.e;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(dVar, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                e0.j(coroutineContext, d9.e1.a("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            lVar.w(new j(scheduledFutureSchedule, 0));
        } else {
            kotlinx.coroutines.a.i.g(j2, lVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f263954b);
    }

    @Override // skm.i0
    public final r0 j(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        Executor executor = this.f263954b;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                e0.j(coroutineContext, d9.e1.a("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new q0(scheduledFutureSchedule) : kotlinx.coroutines.a.i.j(j2, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.c
    public final Executor m() {
        return this.f263954b;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return this.f263954b.toString();
    }
}
