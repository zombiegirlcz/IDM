package tfm;

import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f270623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f270624h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f270625j;

    public /* synthetic */ m(Object obj2, int i, Object obj3, Object obj4) {
        this.f270623g = i;
        this.f270624h = obj2;
        this.i = obj3;
        this.f270625j = obj4;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        switch (this.f270623g) {
            case 0:
                agm.a aVar = (agm.a) this.f270624h;
                aVar.subscribe(yVar);
                if (((AtomicInteger) this.f270625j).incrementAndGet() == 1) {
                    aVar.d((l5i.b) this.i);
                }
                break;
            case 1:
                try {
                    Object objCall = ((Callable) this.f270624h).call();
                    kfm.c cVar = (kfm.c) this.i;
                    t2 t2Var = new t2(yVar, cVar, (kfm.g) this.f270625j, objCall);
                    yVar.onSubscribe(t2Var);
                    Object objApply = t2Var.f270834c;
                    if (!t2Var.d) {
                        while (!t2Var.d) {
                            try {
                                objApply = cVar.apply(objApply, t2Var);
                                if (t2Var.e) {
                                    t2Var.d = true;
                                    t2Var.f270834c = null;
                                    t2Var.a(objApply);
                                    break;
                                }
                            } catch (Throwable th10) {
                                m70.a.u(th10);
                                t2Var.f270834c = null;
                                t2Var.d = true;
                                if (t2Var.e) {
                                    mo3.a.m(th10);
                                } else {
                                    t2Var.e = true;
                                    t2Var.f270832a.onError(th10);
                                }
                                t2Var.a(objApply);
                                return;
                            }
                        }
                        t2Var.f270834c = null;
                        t2Var.a(objApply);
                    } else {
                        t2Var.f270834c = null;
                        t2Var.a(objApply);
                    }
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.d(th11, yVar);
                    return;
                }
                break;
            default:
                try {
                    Iterator it8 = ((Iterable) this.i).iterator();
                    mfm.f.b(it8, "The iterator returned by other is null");
                    try {
                        if (!it8.hasNext()) {
                            lfm.e.a(yVar);
                        } else {
                            ((efm.r) this.f270624h).subscribe(new g0(yVar, it8, (kfm.c) this.f270625j));
                        }
                    } catch (Throwable th12) {
                        m70.a.u(th12);
                        lfm.e.d(th12, yVar);
                        return;
                    }
                } catch (Throwable th13) {
                    m70.a.u(th13);
                    lfm.e.d(th13, yVar);
                    return;
                }
                break;
        }
    }

    public m(agm.a aVar, l5i.b bVar) {
        this.f270623g = 0;
        this.f270624h = aVar;
        this.i = bVar;
        this.f270625j = new AtomicInteger();
    }
}
