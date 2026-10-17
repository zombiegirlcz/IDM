package vgm;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a extends AtomicReference implements Disposable {
    public static final FutureTask d;
    public static final FutureTask e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f289216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f289217b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f289218c;

    static {
        ch.n nVar = kgm.j.f184026b;
        d = new FutureTask(nVar, null);
        e = new FutureTask(nVar, null);
    }

    public a(Runnable runnable) {
        this.f289216a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == d) {
                return;
            }
            if (future2 == e) {
                if (this.f289218c == Thread.currentThread()) {
                    future.cancel(false);
                    return;
                } else {
                    future.cancel(this.f289217b);
                    return;
                }
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == d || future == (futureTask = e) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        if (this.f289218c == Thread.currentThread()) {
            future.cancel(false);
        } else {
            future.cancel(this.f289217b);
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == d || future == e;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Future future = (Future) get();
        if (future == d) {
            str = "Finished";
        } else if (future == e) {
            str = "Disposed";
        } else if (this.f289218c != null) {
            str = "Running on " + this.f289218c;
        } else {
            str = "Waiting";
        }
        return getClass().getSimpleName() + "[" + str + "]";
    }
}
