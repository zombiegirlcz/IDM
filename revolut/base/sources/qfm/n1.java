package qfm;

import efm.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class n1 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.c0 f245485c;
    public final int d;

    public n1(efm.i iVar, efm.c0 c0Var, int i) {
        super(iVar);
        this.f245485c = c0Var;
        this.d = i;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        c0.a aVarB = this.f245485c.b();
        boolean z = aVar instanceof nfm.a;
        int i = this.d;
        efm.i iVar = this.f245362b;
        if (z) {
            iVar.n(new l1((nfm.a) aVar, aVarB, i));
        } else {
            iVar.n(new m1(aVar, aVarB, i));
        }
    }
}
