package uac;

import a3e.u;
import obc.m;
import obc.n;
import r10.q;
import vc.s;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f278565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f278566b;

    public /* synthetic */ c(f fVar, xki.e eVar, int i) {
        this.f278565a = i;
        this.f278566b = fVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f278565a) {
            case 0:
                f fVar = this.f278566b;
                q qVarE = fVar.f278576j.e();
                usc.a aVar = new usc.a(fVar.f278571a.b());
                b6c.c cVarB = fVar.k.b();
                s.j(cVarB);
                kcc.a aVar2 = (kcc.a) fVar.f278577l.f172778q.get();
                s.j(aVar2);
                return new dbc.k(qVarE, aVar, cVarB, aVar2, new u(new fbc.b(new kbc.b(), new kbc.c())));
            default:
                return new m(new tul.b(this.f278566b.f278571a.b()), new n(), new i3g.k(new nd.n(new qbc.a()), new qbc.a()));
        }
    }
}
