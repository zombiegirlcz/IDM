package fgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public abstract class o implements Disposable {
    public abstract Disposable a(Runnable runnable, long j2, TimeUnit timeUnit);

    public void b(Runnable runnable) {
        a(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public final Disposable c(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        ggm.b bVar = new ggm.b();
        ggm.b bVar2 = new ggm.b();
        bVar2.lazySet(bVar);
        long nanos = timeUnit.toNanos(j3);
        long jA = Scheduler.a(TimeUnit.NANOSECONDS);
        Disposable disposableA = a(new n(this, timeUnit.toNanos(j2) + jA, runnable, jA, bVar2, nanos), j2, timeUnit);
        if (disposableA == jgm.c.INSTANCE) {
            return disposableA;
        }
        jgm.b.c(bVar, disposableA);
        return bVar2;
    }
}
