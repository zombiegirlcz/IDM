package xf6;

/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f304924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f304925b;

    public /* synthetic */ l2(w2 w2Var, int i) {
        this.f304924a = i;
        this.f304925b = w2Var;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f304924a) {
            case 0:
                l61.a aVarB = this.f304925b.f305151x.b();
                vc.s.j(aVarB);
                return new ol6.c(aVarB);
            default:
                w2 w2Var = this.f304925b;
                ad2.a aVar = (ad2.a) w2Var.f305140h.f133865j.get();
                vc.s.j(aVar);
                xmg.a aVar2 = w2Var.f305151x;
                ang.f fVarE = aVar2.e();
                l61.a aVarB2 = aVar2.b();
                vc.s.j(aVarB2);
                oe6.m mVarF = ((t) w2Var.f305139g).f();
                vc.s.j(mVarF);
                return new com.revolut.feature.external_accounts.impl.ui.consents_kompot.c(aVar, fVarE, aVarB2, mVarF);
        }
    }
}
