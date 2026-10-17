package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 implements efm.j, nfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245366b;

    public a1(dom.a aVar) {
        this.f245365a = aVar;
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
        this.f245366b.cancel();
    }

    @Override // nfm.j
    public final void clear() {
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245366b, bVar)) {
            this.f245366b = bVar;
            this.f245365a.e(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // nfm.j
    public final boolean isEmpty() {
        return true;
    }

    @Override // nfm.j
    public final boolean offer(Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245365a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f245365a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
    }

    @Override // nfm.j
    public final Object poll() {
        return null;
    }
}
