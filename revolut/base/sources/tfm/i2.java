package tfm;

/* JADX INFO: loaded from: classes4.dex */
public final class i2 extends ofm.b implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270529a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f270531c;
    public final boolean d;
    public ifm.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f270532g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfm.c f270530b = new zfm.c();
    public final ifm.b e = new ifm.b();

    public i2(efm.y yVar, kfm.o oVar, boolean z) {
        this.f270529a = yVar;
        this.f270531c = oVar;
        this.d = z;
        lazySet(1);
    }

    @Override // nfm.f
    public final int b(int i) {
        return 2;
    }

    @Override // nfm.j
    public final void clear() {
    }

    @Override // ifm.c
    public final void dispose() {
        this.f270532g = true;
        this.f.dispose();
        this.e.dispose();
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f.isDisposed();
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return true;
    }

    @Override // efm.y
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            zfm.c cVar = this.f270530b;
            cVar.getClass();
            Throwable thB = zfm.h.b(cVar);
            efm.y yVar = this.f270529a;
            if (thB != null) {
                yVar.onError(thB);
            } else {
                yVar.onComplete();
            }
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f270530b;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        boolean z = this.d;
        efm.y yVar = this.f270529a;
        if (z) {
            if (decrementAndGet() == 0) {
                cVar.getClass();
                yVar.onError(zfm.h.b(cVar));
                return;
            }
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            cVar.getClass();
            yVar.onError(zfm.h.b(cVar));
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f270531c.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null CompletableSource");
            efm.f fVar = (efm.f) objApply;
            getAndIncrement();
            qfm.n0 n0Var = new qfm.n0(this, 3);
            if (this.f270532g || !this.e.a(n0Var)) {
                return;
            }
            fVar.d(n0Var);
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
            this.f270529a.onSubscribe(this);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        return null;
    }
}
