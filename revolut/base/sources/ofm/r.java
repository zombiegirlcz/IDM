package ofm;

/* JADX INFO: loaded from: classes13.dex */
public final class r implements efm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f224948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f224949b;

    public r(dom.a aVar) {
        this.f224948a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // dom.b
    public final void cancel() {
        this.f224949b.dispose();
    }

    @Override // efm.d
    public final void onComplete() {
        this.f224948a.onComplete();
    }

    @Override // efm.d
    public final void onError(Throwable th10) {
        this.f224948a.onError(th10);
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        if (lfm.d.f(this.f224949b, cVar)) {
            this.f224949b = cVar;
            this.f224948a.e(this);
        }
    }
}
