package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class l0 extends AtomicReference implements efm.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final efm.y f270601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f270602b;

    public l0(efm.y yVar, m0 m0Var) {
        this.f270601a = yVar;
        this.f270602b = m0Var;
    }

    @Override // efm.y
    public final void onComplete() {
        m0 m0Var = this.f270602b;
        m0Var.i = false;
        m0Var.a();
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        m0 m0Var = this.f270602b;
        zfm.c cVar = m0Var.d;
        cVar.getClass();
        if (!zfm.h.a(cVar, th10)) {
            mo3.a.m(th10);
            return;
        }
        if (!m0Var.f) {
            m0Var.f270630h.dispose();
        }
        m0Var.i = false;
        m0Var.a();
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        this.f270601a.onNext(obj2);
    }

    @Override // efm.y
    public final void onSubscribe(ifm.c cVar) {
        lfm.d.c(this, cVar);
    }
}
