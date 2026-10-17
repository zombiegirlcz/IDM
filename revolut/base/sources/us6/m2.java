package us6;

/* JADX INFO: loaded from: classes3.dex */
public final class m2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2 f282631b;

    public /* synthetic */ m2(g2 g2Var, int i) {
        this.f282630a = i;
        this.f282631b = g2Var;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f282630a) {
            case 0:
                g2 g2Var = this.f282631b;
                gr6.i iVarA = g2Var.f282553b.a();
                vc.s.j(iVarA);
                q qVar = g2Var.f282552a;
                jr6.m mVarM = qVar.m();
                vc.s.j(mVarM);
                et6.p1 p1VarO = qVar.o();
                vc.s.j(p1VarO);
                return new zx6.o(iVarA, mVarM, p1VarO, g2Var.f282556h.b(), new zx6.q());
            case 1:
                qy6.d dVar = new qy6.d(new qy6.b());
                et6.p1 p1VarO2 = this.f282631b.f282552a.o();
                vc.s.j(p1VarO2);
                return new com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a(dVar, p1VarO2, new i3g.k(new ry6.b(new qy6.b())));
            case 2:
                et6.p1 p1VarO3 = this.f282631b.f282552a.o();
                vc.s.j(p1VarO3);
                return new com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a(p1VarO3, new sy6.l());
            default:
                et6.p1 p1VarO4 = this.f282631b.f282552a.o();
                vc.s.j(p1VarO4);
                return new uy6.p(p1VarO4, new tyc.l(new wy6.a()));
        }
    }

    public /* synthetic */ m2(g2 g2Var, xki.e eVar, int i) {
        this.f282630a = i;
        this.f282631b = g2Var;
    }
}
