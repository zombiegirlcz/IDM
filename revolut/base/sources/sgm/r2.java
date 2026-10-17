package sgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class r2 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f263117a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final igm.c f263118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f263119c;
    public final Object d;

    public r2(igm.q qVar, igm.c cVar, igm.g gVar) {
        this.f263119c = qVar;
        this.f263118b = cVar;
        this.d = gVar;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(fgm.l lVar) {
        switch (this.f263117a) {
            case 0:
                try {
                    Object obj2 = ((igm.q) this.f263119c).get();
                    igm.c cVar = this.f263118b;
                    q2 q2Var = new q2(lVar, cVar, (igm.g) this.d, obj2);
                    lVar.onSubscribe(q2Var);
                    Object objApply = q2Var.f263098c;
                    if (!q2Var.d) {
                        while (!q2Var.d) {
                            try {
                                objApply = cVar.apply(objApply, q2Var);
                                if (q2Var.e) {
                                    q2Var.d = true;
                                    q2Var.f263098c = null;
                                    q2Var.b(objApply);
                                    break;
                                }
                            } catch (Throwable th10) {
                                ce9.m.F(th10);
                                q2Var.f263098c = null;
                                q2Var.d = true;
                                if (q2Var.e) {
                                    jb3.l.v(th10);
                                } else {
                                    q2Var.e = true;
                                    q2Var.f263096a.onError(th10);
                                }
                                q2Var.b(objApply);
                                return;
                            }
                        }
                        q2Var.f263098c = null;
                        q2Var.b(objApply);
                    } else {
                        q2Var.f263098c = null;
                        q2Var.b(objApply);
                    }
                } catch (Throwable th11) {
                    ce9.m.F(th11);
                    jgm.c.c(th11, lVar);
                    return;
                }
                break;
            default:
                try {
                    Iterator it8 = ((Iterable) this.d).iterator();
                    Objects.requireNonNull(it8, "The iterator returned by other is null");
                    try {
                        if (!it8.hasNext()) {
                            jgm.c.a(lVar);
                        } else {
                            ((Observable) this.f263119c).subscribe(new h0(lVar, it8, this.f263118b));
                        }
                    } catch (Throwable th12) {
                        ce9.m.F(th12);
                        jgm.c.c(th12, lVar);
                        return;
                    }
                } catch (Throwable th13) {
                    ce9.m.F(th13);
                    jgm.c.c(th13, lVar);
                }
                break;
        }
    }

    public r2(Observable observable, Iterable iterable, igm.c cVar) {
        this.f263119c = observable;
        this.d = iterable;
        this.f263118b = cVar;
    }
}
