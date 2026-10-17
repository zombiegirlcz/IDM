package pgm;

/* JADX INFO: loaded from: classes14.dex */
public final class g extends xgm.e implements fgm.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f236060h;
    public long i;

    public g(d dVar) {
        this.f236060h = dVar;
    }

    @Override // dom.a
    public final void onComplete() {
        long j2 = this.i;
        if (j2 != 0) {
            this.i = 0L;
            c(j2);
        }
        d dVar = this.f236060h;
        dVar.k = false;
        dVar.f();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        long j2 = this.i;
        if (j2 != 0) {
            this.i = 0L;
            c(j2);
        }
        this.f236060h.b(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.i++;
        this.f236060h.c(obj2);
    }
}
