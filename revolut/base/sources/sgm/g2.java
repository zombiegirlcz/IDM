package sgm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class g2 extends ngm.b implements fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.l f262850a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f262852c;
    public final boolean d;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262853g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ygm.c f262851b = new ygm.c();
    public final CompositeDisposable e = new CompositeDisposable();

    public g2(fgm.l lVar, igm.o oVar, boolean z) {
        this.f262850a = lVar;
        this.f262852c = oVar;
        this.d = z;
        lazySet(1);
    }

    @Override // bhm.c
    public final int b(int i) {
        return 2;
    }

    @Override // bhm.g
    public final void clear() {
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f262853g = true;
        this.f.dispose();
        this.e.dispose();
        this.f262851b.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // fgm.l
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            this.f262851b.e(this.f262850a);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f262851b.a(th10)) {
            if (this.d) {
                if (decrementAndGet() == 0) {
                    this.f262851b.e(this.f262850a);
                }
            } else {
                this.f262853g = true;
                this.f.dispose();
                this.e.dispose();
                this.f262851b.e(this.f262850a);
            }
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f262852c.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
            CompletableSource completableSource = (CompletableSource) objApply;
            getAndIncrement();
            tgm.a aVar = new tgm.a(this, 2);
            if (this.f262853g || !this.e.a(aVar)) {
                return;
            }
            completableSource.c(aVar);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f.dispose();
            onError(th10);
        }
    }

    @Override // fgm.l
    public final void onSubscribe(Disposable disposable) {
        if (jgm.b.f(this.f, disposable)) {
            this.f = disposable;
            this.f262850a.onSubscribe(this);
        }
    }

    @Override // bhm.g
    public final Object poll() {
        return null;
    }
}
