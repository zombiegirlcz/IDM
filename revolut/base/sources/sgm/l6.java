package sgm;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class l6 extends AtomicBoolean implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Scheduler f262983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Disposable f262984c;

    public l6(fgm.l lVar, Scheduler scheduler) {
        this.f262982a = lVar;
        this.f262983b = scheduler;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (compareAndSet(false, true)) {
            this.f262983b.c(new j1(this, 1));
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return get();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (get()) {
            return;
        }
        this.f262982a.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (get()) {
            jb3.l.v(th10);
        } else {
            this.f262982a.onError(th10);
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (get()) {
            return;
        }
        this.f262982a.onNext(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f262984c, disposable)) {
            this.f262984c = disposable;
            this.f262982a.onSubscribe(this);
        }
    }
}
