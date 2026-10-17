package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class j1 extends xgm.e implements fgm.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ghm.a f236085h;
    public final dhm.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g1 f236086j;
    public long k;

    public j1(ghm.a aVar, dhm.b bVar, g1 g1Var) {
        this.f236085h = aVar;
        this.i = bVar;
        this.f236086j = g1Var;
    }

    @Override // xgm.e, dom.b
    public final void cancel() {
        super.cancel();
        this.f236086j.cancel();
    }

    @Override // dom.a
    public final void onComplete() {
        this.f236086j.cancel();
        this.f236085h.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        f(xgm.c.INSTANCE);
        long j2 = this.k;
        if (j2 != 0) {
            this.k = 0L;
            c(j2);
        }
        this.f236086j.a(1L);
        this.i.onNext(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.k++;
        this.f236085h.onNext(obj2);
    }
}
