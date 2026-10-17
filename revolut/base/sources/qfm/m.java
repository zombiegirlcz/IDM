package qfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AtomicReference implements efm.j, efm.d, dom.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dom.a f245471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public efm.f f245473c;
    public boolean d;

    public m(dom.a aVar, pfm.h hVar) {
        this.f245471a = aVar;
        this.f245473c = hVar;
    }

    @Override // dom.b
    public final void a(long j2) {
        this.f245472b.a(j2);
    }

    @Override // dom.b
    public final void cancel() {
        this.f245472b.cancel();
        lfm.d.a(this);
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        if (yfm.g.h(this.f245472b, bVar)) {
            this.f245472b = bVar;
            this.f245471a.e(this);
        }
    }

    @Override // dom.a
    public final void onComplete() {
        if (this.d) {
            this.f245471a.onComplete();
            return;
        }
        this.d = true;
        this.f245472b = yfm.g.CANCELLED;
        efm.f fVar = this.f245473c;
        this.f245473c = null;
        fVar.d(this);
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        this.f245471a.onError(th10);
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        this.f245471a.onNext(obj2);
    }

    @Override // efm.d
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.e(this, cVar);
    }
}
