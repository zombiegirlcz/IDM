package tfm;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes13.dex */
public final class b4 implements efm.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f270365a;

    public b4(AtomicReference atomicReference) {
        this.f270365a = atomicReference;
    }

    @Override // efm.w
    public final void subscribe(efm.y yVar) {
        z3 z3Var = new z3(yVar);
        yVar.onSubscribe(z3Var);
        while (true) {
            AtomicReference atomicReference = this.f270365a;
            a4 a4Var = (a4) atomicReference.get();
            if (a4Var == null || a4Var.isDisposed()) {
                a4 a4Var2 = new a4(atomicReference);
                if (t61.a.C(atomicReference, a4Var, a4Var2)) {
                    a4Var = a4Var2;
                } else {
                    continue;
                }
            }
            if (a4Var.a(z3Var)) {
                z3Var.a(a4Var);
                return;
            }
        }
    }
}
