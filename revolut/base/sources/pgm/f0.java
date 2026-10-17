package pgm;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class f0 extends xgm.a implements fgm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f236053a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final igm.o f236055c;
    public final int e;
    public dom.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f236056g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ygm.c f236054b = new ygm.c();
    public final CompositeDisposable d = new CompositeDisposable();

    public f0(dom.a aVar, igm.o oVar, int i) {
        this.f236053a = aVar;
        this.f236055c = oVar;
        this.e = i;
        lazySet(1);
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // bhm.c
    public final int b(int i) {
        return 2;
    }

    @Override // dom.b
    public final void cancel() {
        this.f236056g = true;
        this.f.cancel();
        this.d.dispose();
        this.f236054b.b();
    }

    @Override // bhm.g
    public final void clear() {
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (xgm.f.h(this.f, bVar)) {
            this.f = bVar;
            this.f236053a.e(this);
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                bVar.a(Long.MAX_VALUE);
            } else {
                bVar.a(i);
            }
        }
    }

    @Override // bhm.g
    public final boolean isEmpty() {
        return true;
    }

    @Override // dom.a
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            this.f236054b.c(this.f236053a);
        } else if (this.e != Integer.MAX_VALUE) {
            this.f.a(1L);
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.f236054b.a(th10)) {
            this.f236056g = true;
            this.f.cancel();
            this.d.dispose();
            this.f236054b.c(this.f236053a);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f236055c.apply(obj2);
            Objects.requireNonNull(objApply, "The mapper returned a null CompletableSource");
            CompletableSource completableSource = (CompletableSource) objApply;
            getAndIncrement();
            ogm.d dVar = new ogm.d(this, 1);
            if (this.f236056g || !this.d.a(dVar)) {
                return;
            }
            completableSource.c(dVar);
        } catch (Throwable th10) {
            ce9.m.F(th10);
            this.f.cancel();
            onError(th10);
        }
    }

    @Override // bhm.g
    public final Object poll() {
        return null;
    }
}
