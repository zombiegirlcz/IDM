package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.l f245382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f245384c;
    public boolean d;

    public c0(efm.l lVar) {
        this.f245382a = lVar;
    }

    @Override // ifm.c
    public final void dispose() {
        this.f245383b.cancel();
        this.f245383b = yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245383b, bVar)) {
            this.f245383b = bVar;
            this.f245382a.onSubscribe(this);
            bVar.a(Long.MAX_VALUE);
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f245383b == yfm.g.CANCELLED;
    }

    @Override // dom.a
    public final void onComplete() {
        this.f245383b = yfm.g.CANCELLED;
        if (this.d) {
            return;
        }
        this.d = true;
        this.f245382a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
            return;
        }
        this.d = true;
        this.f245383b = yfm.g.CANCELLED;
        this.f245382a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        long j2 = this.f245384c;
        if (j2 != 0) {
            this.f245384c = j2 + 1;
            return;
        }
        this.d = true;
        this.f245383b.cancel();
        this.f245383b = yfm.g.CANCELLED;
        this.f245382a.onSuccess(obj2);
    }
}
