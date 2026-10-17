package qfm;

import efm.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final efm.c0 f245451c;
    public final boolean d;

    public k2(efm.i iVar, efm.c0 c0Var) {
        super(iVar);
        this.f245451c = c0Var;
        this.d = true;
    }

    @Override // efm.i
    public final void o(dom.a aVar) {
        c0.a aVarB = this.f245451c.b();
        j2 j2Var = new j2(aVar, aVarB, this.f245362b, this.d);
        aVar.e(j2Var);
        aVarB.a(j2Var);
    }
}
