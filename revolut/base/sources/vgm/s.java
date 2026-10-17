package vgm;

import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class s extends fgm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f289251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeDisposable f289252b = new CompositeDisposable();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f289253c;

    public s(ScheduledExecutorService scheduledExecutorService) {
        this.f289251a = scheduledExecutorService;
    }

    @Override // fgm.o
    public final Disposable a(Runnable runnable, long j2, TimeUnit timeUnit) {
        if (this.f289253c) {
            return jgm.c.INSTANCE;
        }
        q qVar = new q(runnable, this.f289252b);
        this.f289252b.a(qVar);
        try {
            qVar.a(j2 <= 0 ? this.f289251a.submit((Callable) qVar) : this.f289251a.schedule((Callable) qVar, j2, timeUnit));
            return qVar;
        } catch (RejectedExecutionException e) {
            dispose();
            jb3.l.v(e);
            return jgm.c.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f289253c) {
            return;
        }
        this.f289253c = true;
        this.f289252b.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f289253c;
    }
}
