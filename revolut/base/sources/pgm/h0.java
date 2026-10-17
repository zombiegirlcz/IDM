package pgm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes14.dex */
public final class h0 extends AtomicInteger implements fgm.d, Disposable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fgm.b f236065a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f236067c;
    public dom.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f236068g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ygm.c f236066b = new ygm.c();
    public final CompositeDisposable d = new CompositeDisposable();
    public final int e = Integer.MAX_VALUE;

    public h0(fgm.b bVar, igm.o oVar) {
        this.f236065a = bVar;
        this.f236067c = oVar;
        lazySet(1);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.f236068g = true;
        this.f.cancel();
        this.d.dispose();
        this.f236066b.b();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f, bVar)) {
            this.f = bVar;
            this.f236065a.onSubscribe(this);
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                bVar.a(Long.MAX_VALUE);
            } else {
                bVar.a(i);
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.d.f163117b;
    }

    @Override // dom.a
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            this.f236066b.d(this.f236065a);
        } else if (this.e != Integer.MAX_VALUE) {
            this.f.a(1L);
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236066b.a(th10)) {
            this.f236068g = true;
            this.f.cancel();
            this.d.dispose();
            this.f236066b.d(this.f236065a);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f236067c.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
            CompletableSource completableSource = (CompletableSource) objApply;
            getAndIncrement();
            tgm.a aVar = new tgm.a(this, 1);
            if (this.f236068g || !this.d.a(aVar)) {
                return;
            }
            completableSource.c(aVar);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f.cancel();
            onError(th10);
        }
    }
}
