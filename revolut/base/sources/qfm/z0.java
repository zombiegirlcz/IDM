package qfm;

/* JADX INFO: loaded from: classes13.dex */
public final class z0 implements efm.y, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ifm.c f245592b;

    public z0(dom.a aVar) {
        this.f245591a = aVar;
    }

    @Override // dom.b
    public final void a(long j2) {
    }

    @Override // dom.b
    public final void cancel() {
        this.f245592b.dispose();
    }

    @Override // efm.y
    public final void onComplete() {
        this.f245591a.onComplete();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        this.f245591a.onError(th10);
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f245591a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        this.f245592b = cVar;
        this.f245591a.e(this);
    }
}
