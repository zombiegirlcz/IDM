package wfm;

import efm.c0;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends c0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PriorityBlockingQueue f297211a = new PriorityBlockingQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f297212b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f297213c = new AtomicInteger();
    public volatile boolean d;

    @Override // efm.c0.a
    public final ifm.c a(Runnable runnable) {
        return d(c0.a(TimeUnit.MILLISECONDS), runnable);
    }

    @Override // efm.c0.a
    public final ifm.c b(Runnable runnable, long j2, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j2) + c0.a(TimeUnit.MILLISECONDS);
        return d(millis, new vgm.u(runnable, this, millis, 1));
    }

    public final ifm.c d(long j2, Runnable runnable) {
        if (this.d) {
            return lfm.e.INSTANCE;
        }
        y yVar = new y(runnable, Long.valueOf(j2), this.f297213c.incrementAndGet());
        this.f297211a.add(yVar);
        if (this.f297212b.getAndIncrement() != 0) {
            return new ifm.a(new r8.d(this, yVar, 20), 1);
        }
        int iAddAndGet = 1;
        while (!this.d) {
            y yVar2 = (y) this.f297211a.poll();
            if (yVar2 == null) {
                iAddAndGet = this.f297212b.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return lfm.e.INSTANCE;
                }
            } else if (!yVar2.d) {
                yVar2.f297208a.run();
            }
        }
        this.f297211a.clear();
        return lfm.e.INSTANCE;
    }

    @Override // ifm.c
    public final void dispose() {
        this.d = true;
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.d;
    }
}
