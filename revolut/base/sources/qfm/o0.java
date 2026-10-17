package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends yfm.a implements efm.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245488a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kfm.o f245490c;
    public final int e;
    public dom.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f245491g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zfm.c f245489b = new zfm.c();
    public final ifm.b d = new ifm.b();

    public o0(dom.a aVar, kfm.o oVar, int i) {
        this.f245488a = aVar;
        this.f245490c = oVar;
        this.e = i;
        lazySet(1);
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // nfm.f
    public final int b(int i) {
        return 2;
    }

    @Override // dom.b
    public final void cancel() {
        this.f245491g = true;
        this.f.cancel();
        this.d.dispose();
    }

    @Override // nfm.j
    public final void clear() {
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f, bVar)) {
            this.f = bVar;
            this.f245488a.e(this);
            int i = this.e;
            if (i == Integer.MAX_VALUE) {
                bVar.a(Long.MAX_VALUE);
            } else {
                bVar.a(i);
            }
        }
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return true;
    }

    @Override // dom.a
    public final void onComplete() {
        if (decrementAndGet() != 0) {
            if (this.e != Integer.MAX_VALUE) {
                this.f.a(1L);
                return;
            }
            return;
        }
        zfm.c cVar = this.f245489b;
        cVar.getClass();
        Throwable thB = zfm.h.b(cVar);
        dom.a aVar = this.f245488a;
        if (thB != null) {
            aVar.onError(thB);
        } else {
            aVar.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        zfm.c cVar = this.f245489b;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        cancel();
        if (getAndSet(0) > 0) {
            this.f245488a.onError(zfm.h.b(cVar));
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        try {
            Object objApply = this.f245490c.apply(obj2);
            mfm.f.b(objApply, "The mapper returned a null CompletableSource");
            efm.f fVar = (efm.f) objApply;
            getAndIncrement();
            n0 n0Var = new n0(this, 0);
            if (this.f245491g || !this.d.a(n0Var)) {
                return;
            }
            fVar.d(n0Var);
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f.cancel();
            onError(th10);
        }
    }

    @Override // nfm.j
    public final Object poll() {
        return null;
    }
}
