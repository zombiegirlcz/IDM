package wfm;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a extends AtomicReference implements ifm.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FutureTask f297158c;
    public static final FutureTask d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f297159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Thread f297160b;

    static {
        mfm.b bVar = mfm.f.f205042b;
        f297158c = new FutureTask(bVar, null);
        d = new FutureTask(bVar, null);
    }

    public a(Runnable runnable) {
        this.f297159a = runnable;
    }

    public final void a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f297158c) {
                return;
            }
            if (future2 == d) {
                future.cancel(this.f297160b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // ifm.c
    public final void dispose() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f297158c || future == (futureTask = d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f297160b != Thread.currentThread());
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        Future future = (Future) get();
        return future == f297158c || future == d;
    }
}
