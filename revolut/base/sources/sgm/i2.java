package sgm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class i2 extends AtomicInteger implements Disposable, fgm.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.b f262898a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f262900c;
    public final boolean d;
    public Disposable f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f262901g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ygm.c f262899b = new ygm.c();
    public final CompositeDisposable e = new CompositeDisposable();

    public i2(fgm.b bVar, igm.o oVar, boolean z) {
        this.f262898a = bVar;
        this.f262900c = oVar;
        this.d = z;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f262901g = true;
        this.f.dispose();
        this.e.dispose();
        this.f262899b.b();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // fgm.l
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            this.f262899b.d(this.f262898a);
        }
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        if (this.f262899b.a(th10)) {
            if (this.d) {
                if (decrementAndGet() == 0) {
                    this.f262899b.d(this.f262898a);
                }
            } else {
                this.f262901g = true;
                this.f.dispose();
                this.e.dispose();
                this.f262899b.d(this.f262898a);
            }
        }
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f262900c.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
            CompletableSource completableSource = (CompletableSource) objApply;
            getAndIncrement();
            ogm.d dVar = new ogm.d(this, 3);
            if (this.f262901g || !this.e.a(dVar)) {
                return;
            }
            completableSource.c(dVar);
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
            this.f262898a.onSubscribe(this);
        }
    }
}
