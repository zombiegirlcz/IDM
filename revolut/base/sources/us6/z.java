package us6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f282818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f282819b;

    public /* synthetic */ z(q qVar, int i) {
        this.f282818a = i;
        this.f282819b = qVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f282818a) {
            case 0:
                return new com.revolut.feature.freelancer.impl.ui.profile.merchant_terms.a((et6.h1) this.f282819b.c0.get(), new m07.i());
            case 1:
                ppg.b bVarB = ((wpg.l) this.f282819b.v).b();
                vc.s.j(bVarB);
                ft6.n freelancerPocketMapper = new ft6.n();
                Intrinsics.checkNotNullParameter(freelancerPocketMapper, "freelancerPocketMapper");
                return new lw6.e(bVarB, new lw6.f());
            case 2:
                q qVar = this.f282819b;
                vs6.a aVar = qVar.f282681h;
                gr6.a aVarA = aVar.a();
                vc.s.j(aVarA);
                gr6.e eVarA = qVar.f282692n.a();
                vc.s.j(eVarA);
                gr6.m mVarB = aVar.b();
                vc.s.j(mVarB);
                return new com.revolut.feature.freelancer.impl.ui.prompt.promotion_ineligibility.flow.b(aVarA, eVarA, mVarB);
            case 3:
                q qVar2 = this.f282819b;
                bt6.b bVar = qVar2.f282712w;
                a61.a aVarA2 = bVar.a();
                r10.f fVarD = bVar.d();
                r10.d dVarC = bVar.c();
                ang.f fVarE = qVar2.f282699q.e();
                t07.b taxTypeClauseFactory = new t07.b();
                Intrinsics.checkNotNullParameter(taxTypeClauseFactory, "taxTypeClauseFactory");
                return new r07.h(aVarA2, fVarD, dVarC, fVarE, new r07.j());
            case 4:
                q qVar3 = this.f282819b;
                et6.h1 h1Var = (et6.h1) qVar3.c0.get();
                jr6.r rVar = (jr6.r) qVar3.X0.get();
                jvh.a aVarA3 = qVar3.M.a();
                vc.s.j(aVarA3);
                return new com.revolut.feature.freelancer.impl.ui.profile.trading_name.flow.b(h1Var, rVar, aVarA3);
            case 5:
                q qVar4 = this.f282819b;
                jf1.a aVarA4 = qVar4.f282717y.a();
                vc.s.j(aVarA4);
                gr6.a aVarA5 = qVar4.f282681h.a();
                vc.s.j(aVarA5);
                gr6.p pVar = (gr6.p) qVar4.L0.get();
                q06.l lVarA = qVar4.L.a();
                vc.s.j(lVarA);
                return new com.revolut.feature.freelancer.impl.ui.ecommerce.manage.flow.b(aVarA4, aVarA5, pVar, lVarA);
            default:
                q qVar5 = this.f282819b;
                jf1.a aVarA6 = qVar5.f282717y.a();
                vc.s.j(aVarA6);
                gr6.o oVar = (gr6.o) qVar5.V0.get();
                l61.a aVarB = qVar5.f282699q.b();
                vc.s.j(aVarB);
                return new bx6.i(aVarA6, oVar, aVarB, new bx6.k(new o07.k()));
        }
    }

    public /* synthetic */ z(q qVar, xki.e eVar, int i) {
        this.f282818a = i;
        this.f282819b = qVar;
    }
}
