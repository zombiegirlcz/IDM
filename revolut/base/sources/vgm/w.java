package vgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class w extends fgm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f289261a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f289262b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f289263c = new AtomicInteger();
    public volatile boolean d;

    @Override // fgm.o
    public final Disposable a(Runnable runnable, long j2, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j2) + Scheduler.a(TimeUnit.MILLISECONDS);
        return d(millis, new u(runnable, this, millis, 0));
    }

    @Override // fgm.o
    public final void b(Runnable runnable) {
        d(Scheduler.a(TimeUnit.MILLISECONDS), runnable);
    }

    public final Disposable d(long j2, Runnable runnable) {
        if (this.d) {
            return jgm.c.INSTANCE;
        }
        v vVar = new v(runnable, Long.valueOf(j2), this.f289263c.incrementAndGet());
        this.f289261a.add(vVar);
        if (this.f289262b.getAndIncrement() != 0) {
            return new ggm.b(new r8.d(this, vVar, 17), 0);
        }
        int iAddAndGet = 1;
        while (!this.d) {
            v vVar2 = (v) this.f289261a.poll();
            if (vVar2 == null) {
                iAddAndGet = this.f289262b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return jgm.c.INSTANCE;
                }
            } else if (!vVar2.d) {
                vVar2.f289258a.run();
            }
        }
        this.f289261a.clear();
        return jgm.c.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.d = true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d;
    }
}
