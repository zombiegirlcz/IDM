package pgm;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class z extends wgm.a {
    public final /* synthetic */ int e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(bhm.a aVar, Object obj2, int i) {
        super(aVar);
        this.e = i;
        this.f = obj2;
    }

    @Override // bhm.c
    public final int b(int i) {
        switch (this.e) {
        }
        return f(7);
    }

    @Override // bhm.a
    public final boolean d(Object obj2) {
        switch (this.e) {
            case 0:
                if (!this.d) {
                    try {
                        if (!((igm.p) this.f).test(obj2) || !this.f297345a.d(obj2)) {
                        }
                    } catch (Throwable th10) {
                        c(th10);
                        return true;
                    }
                }
                break;
            default:
                if (!this.d) {
                    try {
                        Object objApply = ((igm.o) this.f).apply(obj2);
                        Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                    } catch (Throwable th11) {
                        c(th11);
                        return true;
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // dom.a
    public final void onNext(Object obj2) {
        switch (this.e) {
            case 0:
                if (!d(obj2)) {
                    this.f297346b.a(1L);
                }
                break;
            default:
                if (!this.d) {
                    try {
                        Object objApply = ((igm.o) this.f).apply(obj2);
                        Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                        this.f297345a.onNext(objApply);
                    } catch (Throwable th10) {
                        c(th10);
                    }
                    break;
                }
                break;
        }
    }

    @Override // bhm.g
    public final Object poll() {
        Object objPoll;
        switch (this.e) {
            case 0:
                bhm.d dVar = this.f297347c;
                igm.p pVar = (igm.p) this.f;
                do {
                    objPoll = dVar.poll();
                    if (objPoll == null) {
                        return null;
                    }
                } while (!pVar.test(objPoll));
                return objPoll;
            default:
                Object objPoll2 = this.f297347c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((igm.o) this.f).apply(objPoll2);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return objApply;
        }
    }
}
