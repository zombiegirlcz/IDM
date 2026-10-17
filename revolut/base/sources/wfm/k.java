package wfm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements Callable, ifm.c {
    public static final FutureTask f = new FutureTask(mfm.f.f205042b, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f297178a;
    public final ExecutorService d;
    public Thread e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f297180c = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f297179b = new AtomicReference();

    public k(Runnable runnable, ScheduledExecutorService scheduledExecutorService) {
        this.f297178a = runnable;
        this.d = scheduledExecutorService;
    }

    public final void a(Future future) {
        while (true) {
            AtomicReference atomicReference = this.f297180c;
            Future future2 = (Future) atomicReference.get();
            if (future2 == f) {
                future.cancel(this.e != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.e = Thread.currentThread();
        try {
            this.f297178a.run();
            Future futureSubmit = this.d.submit(this);
            AtomicReference atomicReference = this.f297179b;
            loop0: while (true) {
                Future future = (Future) atomicReference.get();
                if (future != f) {
                    while (!atomicReference.compareAndSet(future, futureSubmit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                futureSubmit.cancel(this.e != Thread.currentThread());
            }
            this.e = null;
        } catch (Throwable th10) {
            this.e = null;
            mo3.a.m(th10);
        }
        return null;
    }

    @Override // ifm.c
    public final void dispose() {
        AtomicReference atomicReference = this.f297180c;
        FutureTask futureTask = f;
        Future future = (Future) atomicReference.getAndSet(futureTask);
        if (future != null && future != futureTask) {
            future.cancel(this.e != Thread.currentThread());
        }
        Future future2 = (Future) this.f297179b.getAndSet(futureTask);
        if (future2 == null || future2 == futureTask) {
            return;
        }
        future2.cancel(this.e != Thread.currentThread());
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f297180c.get() == f;
    }
}
