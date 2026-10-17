package tfm;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes13.dex */
public final class k2 extends AtomicInteger implements ifm.c, efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f270585a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f270587c;
    public final boolean d;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270588g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfm.c f270586b = new zfm.c();
    public final ifm.b e = new ifm.b();

    public k2(efm.d dVar, kfm.o oVar, boolean z) {
        this.f270585a = dVar;
        this.f270587c = oVar;
        this.d = z;
        lazySet(1);
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270588g = true;
        this.f.dispose();
        this.e.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // efm.y
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            zfm.c cVar = this.f270586b;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            efm.d dVar = this.f270585a;
            if (thB != null) {
                dVar.onError(thB);
            } else {
                dVar.onComplete();
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f270586b;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        boolean z = this.d;
        efm.d dVar = this.f270585a;
        if (z) {
            if (decrementAndGet() == 0) {
                dVar.onError(zfm.h.b(cVar));
            }
        } else {
            dispose();
            if (getAndSet(0) > 0) {
                dVar.onError(zfm.h.b(cVar));
            }
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f270587c.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null CompletableSource");
            efm.f fVar = (efm.f) objApply;
            getAndIncrement();
            rfm.c cVar = new rfm.c(this);
            if (this.f270588g || !this.e.a(cVar)) {
                return;
            }
            fVar.d(cVar);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f.dispose();
            onError(th10);
        }
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f, cVar)) {
            this.f = cVar;
            this.f270585a.onSubscribe(this);
        }
    }
}
