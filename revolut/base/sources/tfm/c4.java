package tfm;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class c4 extends agm.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.r f270387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f270388h;
    public final b4 i;

    public c4(b4 b4Var, efm.r rVar, AtomicReference atomicReference) {
        this.i = b4Var;
        this.f270387g = rVar;
        this.f270388h = atomicReference;
    }

    @Override // agm.a
    public final void d(kfm.g gVar) {
        a4 a4Var;
        while (true) {
            AtomicReference atomicReference = this.f270388h;
            a4Var = (a4) atomicReference.get();
            if (a4Var != null && !a4Var.isDisposed()) {
                break;
            }
            a4 a4Var2 = new a4(atomicReference);
            if (t61.a.C(atomicReference, a4Var, a4Var2)) {
                a4Var = a4Var2;
                break;
            }
        }
        AtomicBoolean atomicBoolean = a4Var.f270341c;
        boolean z = false;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            z = true;
        }
        try {
            gVar.accept(a4Var);
            if (z) {
                this.f270387g.subscribe(a4Var);
            }
        } catch (Throwable th10) {
            m70.a.u(th10);
            throw zfm.h.d(th10);
        }
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        this.i.subscribe(yVar);
    }
}
