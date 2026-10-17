package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class q2 implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.p f245516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public dom.b f245517c;
    public boolean d;

    public q2(dom.a aVar, kfm.p pVar) {
        this.f245515a = aVar;
        this.f245516b = pVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f245517c.a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.f245517c.cancel();
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245517c, bVar)) {
            this.f245517c = bVar;
            this.f245515a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f245515a.onComplete();
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.d) {
            mo3.a.m(th10);
        } else {
            this.d = true;
            this.f245515a.onError(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        dom.a aVar = this.f245515a;
        aVar.onNext(obj2);
        try {
            if (this.f245516b.test(obj2)) {
                this.d = true;
                this.f245517c.cancel();
                aVar.onComplete();
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            this.f245517c.cancel();
            onError(th10);
        }
    }
}
