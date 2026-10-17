package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes14.dex */
public final class e6 implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeUnit f262812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Scheduler f262813c;
    public long d;
    public Disposable e;

    public e6(fgm.l lVar, TimeUnit timeUnit, Scheduler scheduler) {
        this.f262811a = lVar;
        this.f262813c = scheduler;
        this.f262812b = timeUnit;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.e.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.e.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f262811a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f262811a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        this.f262813c.getClass();
        TimeUnit timeUnit = this.f262812b;
        long jA = Scheduler.a(timeUnit);
        long j2 = this.d;
        this.d = jA;
        this.f262811a.onNext(new Timed(obj2, jA - j2, timeUnit));
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.e, disposable)) {
            this.e = disposable;
            this.f262813c.getClass();
            this.d = Scheduler.a(this.f262812b);
            this.f262811a.onSubscribe(this);
        }
    }
}
