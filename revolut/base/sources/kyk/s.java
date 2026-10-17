package kyk;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f190976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f190977b;

    public /* synthetic */ s(v vVar, int i) {
        this.f190976a = i;
        this.f190977b = vVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f190976a) {
            case 0:
                return new x0l.i(new x0l.j(), this.f190977b.k.f());
            default:
                ezk.d dVar = new ezk.d();
                fzk.a aVar = new fzk.a();
                v vVar = this.f190977b;
                twg.c cVarB = ((th7.b) vVar.z).b();
                h9h.a aVar2 = vVar.k;
                usc.a aVar3 = new usc.a((e8h.j) aVar2.f150278s0.get());
                ybl.l lVarF = aVar2.f();
                gte.a aVarB = vVar.o.b();
                vc.s.j(aVarB);
                ybl.b bVarB = vVar.f190988h.b();
                vc.s.j(bVarB);
                return new com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b(dVar, aVar, cVarB, aVar3, lVarF, aVarB, bVarB);
        }
    }
}
