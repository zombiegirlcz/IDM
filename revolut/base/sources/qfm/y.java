package qfm;

/* JADX INFO: loaded from: classes4.dex */
public final class y implements efm.j, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kfm.g f245581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qf.b f245582c;
    public final kfm.a d;
    public dom.b e;

    public y(dom.a aVar, ge6.j jVar, qf.b bVar, en.a aVar2) {
        this.f245580a = aVar;
        this.f245581b = jVar;
        this.d = aVar2;
        this.f245582c = bVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        try {
            this.f245582c.getClass();
        } catch (Throwable th10) {
            m70.a.u(th10);
            mo3.a.m(th10);
        }
        this.e.a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        dom.b bVar = this.e;
        yfm.g gVar = yfm.g.CANCELLED;
        if (bVar != gVar) {
            this.e = gVar;
            try {
                this.d.run();
            } catch (Throwable th10) {
                m70.a.u(th10);
                mo3.a.m(th10);
            }
            bVar.cancel();
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        dom.a aVar = this.f245580a;
        try {
            this.f245581b.accept(bVar);
            if (yfm.g.h(this.e, bVar)) {
                this.e = bVar;
                aVar.e(this);
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            bVar.cancel();
            this.e = yfm.g.CANCELLED;
            yfm.d.d(th10, aVar);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.e != yfm.g.CANCELLED) {
            this.f245580a.onComplete();
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        if (this.e != yfm.g.CANCELLED) {
            this.f245580a.onError(th10);
        } else {
            mo3.a.m(th10);
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f245580a.onNext(obj2);
    }
}
