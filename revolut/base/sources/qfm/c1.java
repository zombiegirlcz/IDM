package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.d f245385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245386b;

    public c1(efm.d dVar) {
        this.f245385a = dVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f245386b.cancel();
        this.f245386b = yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245386b, bVar)) {
            this.f245386b = bVar;
            this.f245385a.onSubscribe(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f245386b == yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245386b = yfm.g.CANCELLED;
        this.f245385a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f245386b = yfm.g.CANCELLED;
        this.f245385a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
    }
}
