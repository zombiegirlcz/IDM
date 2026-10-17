package sgm;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes14.dex */
public abstract class g5 extends AtomicReference implements fgm.l, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ahm.c f262859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ObservableSource f262860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f262861c = new AtomicReference();
    public Disposable d;

    public g5(ahm.c cVar, ObservableSource observableSource) {
        this.f262859a = cVar;
        this.f262860b = observableSource;
    }

    public abstract void a();

    public abstract void b();

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        jgm.b.a(this.f262861c);
        this.d.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f262861c.get() == jgm.b.DISPOSED;
    }

    @Override // fgm.l
    public final void onComplete() {
        jgm.b.a(this.f262861c);
        a();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        jgm.b.a(this.f262861c);
        this.f262859a.onError(th10);
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        lazySet(obj2);
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.d, disposable)) {
            this.d = disposable;
            this.f262859a.onSubscribe(this);
            if (this.f262861c.get() == null) {
                this.f262860b.subscribe(new m1(this, 1));
            }
        }
    }
}
