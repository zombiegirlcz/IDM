package r6e;

import com.revolut.feature.subaccount.impl.network.SubaccountLinkService;
import com.revolut.feature.subaccount.impl.network.SubaccountsService;
import g48.r0;
import s6e.l0;

/* JADX INFO: loaded from: classes13.dex */
public final class z implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f251825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f251826b;

    public z(a0 a0Var, int i) {
        this.f251825a = a0Var;
        this.f251826b = i;
    }

    @Override // phm.a
    public final Object get() {
        a0 a0Var = this.f251825a;
        int i = this.f251826b;
        switch (i) {
            case 0:
                ite.a aVar = a0Var.f251678a;
                e48.a aVar2 = a0Var.f251686n;
                l70.e eVar = a0Var.f251681g;
                gte.a aVarB = aVar.b();
                vc.s.j(aVarB);
                ppg.b bVarB = ((wpg.l) a0Var.f251679b).b();
                vc.s.j(bVarB);
                l93.f fVarJ = a0Var.f251680c.j();
                vc.s.j(fVarJ);
                xua.a aVarA = a0Var.d.a();
                vc.s.j(aVarA);
                o6e.b bVar = (o6e.b) a0Var.u.get();
                s6e.j0 j0Var = new s6e.j0();
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) a0Var.f).c();
                vc.s.j(aVarC);
                t6e.d dVar = (t6e.d) a0Var.v.get();
                t6e.m mVar = (t6e.m) a0Var.f251692w.get();
                l80.e eVarH = eVar.h();
                vc.s.j(eVarH);
                nd.p pVar = new nd.p(eVarH);
                xvh.c cVarA = ((a6d.e) a0Var.f251682h).a();
                vc.s.j(cVarA);
                g6e.b bVarA = a0Var.i.a();
                vc.s.j(bVarA);
                eli.j jVarA = a0Var.f251683j.a();
                qd0.b bVarN = eVar.n();
                vc.s.j(bVarN);
                l80.e eVarH2 = eVar.h();
                vc.s.j(eVarH2);
                wsg.n nVarB = a0Var.k.b();
                y91.b bVarA2 = a0Var.f251684l.a();
                gr6.e eVarA = a0Var.f251685m.a();
                vc.s.j(eVarA);
                r0 r0VarC = aVar2.c();
                p38.a aVarA2 = aVar2.a();
                vc.s.j(aVarA2);
                return new s6e.z(aVarB, bVarB, fVarJ, aVarA, bVar, j0Var, aVarC, dVar, mVar, pVar, cVarA, bVarA, jVarA, bVarN, eVarH2, nVarB, bVarA2, eVarA, r0VarC, aVarA2);
            case 1:
                return new o6e.b((SubaccountsService) a0Var.f251691t.get());
            case 2:
                ek.a aVarD = ((nj0.d) a0Var.e).d();
                ik0.b bVarM = ((nj0.d) a0Var.e).m();
                vc.s.j(bVarM);
                return h0.a(aVarD, bVarM);
            case 3:
                l80.e eVarH3 = a0Var.f251681g.h();
                vc.s.j(eVarH3);
                return new t6e.i(eVarH3);
            case 4:
                return new t6e.p();
            case 5:
                return new o6e.a((SubaccountLinkService) a0Var.f251694y.get(), (ne0.j) a0Var.z.get(), (ue0.c) a0Var.A.get());
            case 6:
                ek.a aVarD2 = ((nj0.d) a0Var.e).d();
                ik0.b bVarM2 = ((nj0.d) a0Var.e).m();
                vc.s.j(bVarM2);
                return g0.a(aVarD2, bVarM2);
            case 7:
                return f0.a();
            case 8:
                je0.d dVarD = a0Var.o.d();
                vc.s.j(dVarD);
                yk0.a aVarB2 = a0Var.f251687p.b();
                vc.s.j(aVarB2);
                xe0.f fVarF = a0Var.o.f();
                vc.s.j(fVarF);
                return qw7.u.x(dVarD, fVarF, aVarB2);
            case 9:
                return new l0(new s6e.j0(), (g6e.d) a0Var.f251693x.get(), a0Var.k.b(), a0Var.f251686n.c());
            case 10:
                g6e.d dVar2 = (g6e.d) a0Var.f251693x.get();
                lfm.c cVarB = ((g8b.a) a0Var.f251690s).b();
                vc.s.j(cVarB);
                return new s6e.i0(dVar2, cVarB);
            default:
                throw new AssertionError(i);
        }
    }
}
