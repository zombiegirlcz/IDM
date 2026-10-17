package cwi;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f109755b;

    public /* synthetic */ o0(h0 h0Var, int i) {
        this.f109754a = i;
        this.f109755b = h0Var;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f109754a) {
            case 0:
                ffk.t tVarF = this.f109755b.f109700j.f();
                vc.s.j(tVarF);
                return new com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b(tVarF);
            default:
                dwi.t0 t0Var = (dwi.t0) this.f109755b.f109695a.c0.get();
                vc.s.j(t0Var);
                return new swi.c(t0Var, new xyi.a());
        }
    }
}
