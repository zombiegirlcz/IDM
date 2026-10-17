package vgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public class l extends fgm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f289242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f289243b;

    public l(ThreadFactory threadFactory) {
        boolean z = r.f289250a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, threadFactory);
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(r.f289250a);
        this.f289242a = scheduledThreadPoolExecutor;
    }

    @Override // fgm.o
    public final Disposable a(Runnable runnable, long j2, TimeUnit timeUnit) {
        return this.f289243b ? jgm.c.INSTANCE : d(runnable, j2, timeUnit, null);
    }

    @Override // fgm.o
    public final void b(Runnable runnable) {
        a(runnable, 0L, null);
    }

    public final q d(Runnable runnable, long j2, TimeUnit timeUnit, ggm.a aVar) {
        q qVar = new q(runnable, aVar);
        if (aVar != null && !aVar.a(qVar)) {
            return qVar;
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f289242a;
        try {
            qVar.a(j2 <= 0 ? scheduledThreadPoolExecutor.submit((Callable) qVar) : scheduledThreadPoolExecutor.schedule((Callable) qVar, j2, timeUnit));
            return qVar;
        } catch (RejectedExecutionException e) {
            if (aVar != null) {
                aVar.c(qVar);
            }
            jb3.l.v(e);
            return qVar;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f289243b) {
            return;
        }
        this.f289243b = true;
        this.f289242a.shutdownNow();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f289243b;
    }
}
