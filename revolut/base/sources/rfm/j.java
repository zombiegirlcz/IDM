package rfm;

/* JADX INFO: loaded from: classes13.dex */
public final class j extends efm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f253954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f253955c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f253953a = i;
        this.f253954b = obj2;
        this.f253955c = obj3;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        switch (this.f253953a) {
            case 0:
                ((efm.d0) this.f253954b).q(new i(lVar, (kfm.p) this.f253955c, 1));
                break;
            case 1:
                efm.n[] nVarArr = (efm.n[]) this.f253954b;
                int length = nVarArr.length;
                if (length == 1) {
                    ((efm.k) nVarArr[0]).i(new pfm.s(lVar, new ogm.i(this, 17), 1));
                } else {
                    i0 i0Var = new i0(lVar, length, (kfm.o) this.f253955c);
                    lVar.onSubscribe(i0Var);
                    for (int i = 0; i < length && !i0Var.isDisposed(); i++) {
                        efm.n nVar = nVarArr[i];
                        if (nVar == null) {
                            NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                            if (i0Var.getAndSet(0) > 0) {
                                i0Var.a(i);
                                ((efm.l) i0Var.d).onError(nullPointerException);
                            } else {
                                mo3.a.m(nullPointerException);
                            }
                        } else {
                            ((efm.k) nVar).i(((j0[]) i0Var.e)[i]);
                        }
                    }
                }
                break;
            default:
                ((efm.d0) this.f253954b).q(new ofm.h(lVar, (kfm.o) this.f253955c, 6));
                break;
        }
    }
}
