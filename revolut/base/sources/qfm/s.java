package qfm;

import java.io.Serializable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends AtomicReference implements efm.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245529a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f245530b;

    public s(t tVar) {
        this.f245530b = tVar;
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        switch (this.f245529a) {
            case 0:
                if (yfm.g.e(this, bVar)) {
                    bVar.a(Long.MAX_VALUE);
                }
                break;
            default:
                if (yfm.g.e(this, bVar)) {
                    bVar.a(Long.MAX_VALUE);
                }
                break;
        }
    }

    @Override // dom.a
    public final void onComplete() {
        switch (this.f245529a) {
            case 0:
                if (((dom.b) get()) != yfm.g.CANCELLED) {
                    t tVar = (t) this.f245530b;
                    tVar.f245542b.a(tVar);
                }
                break;
            default:
                Object obj2 = get();
                yfm.g gVar = yfm.g.CANCELLED;
                if (obj2 != gVar) {
                    lazySet(gVar);
                    ((ofm.i) this.f245530b).a(new CancellationException());
                }
                break;
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        switch (this.f245529a) {
            case 0:
                if (((dom.b) get()) == yfm.g.CANCELLED) {
                    mo3.a.m(th10);
                } else {
                    ((t) this.f245530b).f245541a.onError(th10);
                }
                break;
            default:
                ((ofm.i) this.f245530b).a(th10);
                break;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        switch (this.f245529a) {
            case 0:
                dom.b bVar = (dom.b) get();
                yfm.g gVar = yfm.g.CANCELLED;
                if (bVar != gVar) {
                    lazySet(gVar);
                    bVar.cancel();
                    t tVar = (t) this.f245530b;
                    tVar.f245542b.a(tVar);
                }
                break;
            default:
                if (yfm.g.b(this)) {
                    ((ofm.i) this.f245530b).a(new CancellationException());
                }
                break;
        }
    }

    public s(ofm.i iVar) {
        this.f245530b = iVar;
    }
}
