package qfm;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 implements efm.j, ifm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245414a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dom.b f245415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f245416c;
    public Object d;

    public g1(efm.l lVar) {
        this.f245416c = lVar;
    }

    @Override // ifm.c
    public final void dispose() {
        switch (this.f245414a) {
            case 0:
                this.f245415b.cancel();
                this.f245415b = yfm.g.CANCELLED;
                break;
            default:
                this.f245415b.cancel();
                this.f245415b = yfm.g.CANCELLED;
                break;
        }
    }

    @Override // dom.a
    public final void e(dom.b bVar) {
        switch (this.f245414a) {
            case 0:
                if (yfm.g.h(this.f245415b, bVar)) {
                    this.f245415b = bVar;
                    ((efm.l) this.f245416c).onSubscribe(this);
                    bVar.a(Long.MAX_VALUE);
                }
                break;
            default:
                if (yfm.g.h(this.f245415b, bVar)) {
                    this.f245415b = bVar;
                    ((efm.f0) this.f245416c).onSubscribe(this);
                    bVar.a(Long.MAX_VALUE);
                }
                break;
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        switch (this.f245414a) {
            case 0:
                if (this.f245415b == yfm.g.CANCELLED) {
                }
                break;
            default:
                if (this.f245415b == yfm.g.CANCELLED) {
                }
                break;
        }
        return false;
    }

    @Override // dom.a
    public final void onComplete() {
        switch (this.f245414a) {
            case 0:
                efm.l lVar = (efm.l) this.f245416c;
                this.f245415b = yfm.g.CANCELLED;
                Object obj2 = this.d;
                if (obj2 == null) {
                    lVar.onComplete();
                } else {
                    this.d = null;
                    lVar.onSuccess(obj2);
                }
                break;
            default:
                this.f245415b = yfm.g.CANCELLED;
                ((efm.f0) this.f245416c).onSuccess((Collection) this.d);
                break;
        }
    }

    @Override // dom.a
    public final void onError(Throwable th10) {
        switch (this.f245414a) {
            case 0:
                this.f245415b = yfm.g.CANCELLED;
                this.d = null;
                ((efm.l) this.f245416c).onError(th10);
                break;
            default:
                this.d = null;
                this.f245415b = yfm.g.CANCELLED;
                ((efm.f0) this.f245416c).onError(th10);
                break;
        }
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        switch (this.f245414a) {
            case 0:
                this.d = obj2;
                break;
            default:
                ((Collection) this.d).add(obj2);
                break;
        }
    }

    public g1(efm.f0 f0Var, Collection collection) {
        this.f245416c = f0Var;
        this.d = collection;
    }
}
