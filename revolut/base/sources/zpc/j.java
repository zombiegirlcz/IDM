package zpc;

import com.revolut.feature.salary_switch.impl.network.CardTokenService;
import com.revolut.feature.salary_switch.impl.network.PayrollService;
import com.revolut.feature.salary_switch.impl.network.PayrollServiceV2;
import z0g.f1;

/* JADX INFO: loaded from: classes13.dex */
public final class j implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f324250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f324251b;

    public j(k kVar, int i) {
        this.f324250a = kVar;
        this.f324251b = i;
    }

    @Override // phm.a
    public final Object get() {
        k kVar = this.f324250a;
        int i = this.f324251b;
        switch (i) {
            case 0:
                return new lqc.c();
            case 1:
                ang.f fVarE = kVar.f324252a.e();
                z71.a aVarF = ((c21.b) kVar.f324253b).f();
                vc.s.j(aVarF);
                gte.a aVarB = kVar.f324254c.b();
                vc.s.j(aVarB);
                return new aqc.h(fVarE, aVarF, aVarB, (mqc.f) kVar.A.get(), kVar.f324255g.a());
            case 2:
                return new mqc.k((CardTokenService) kVar.f324266w.get(), (PayrollService) kVar.f324267x.get(), (ne0.j) kVar.f324268y.get(), (ue0.c) kVar.z.get());
            case 3:
                ik0.b bVarM = ((nj0.d) kVar.d).m();
                vc.s.j(bVarM);
                return w.a(((nj0.d) kVar.d).d(), bVarM);
            case 4:
                ik0.b bVarM2 = ((nj0.d) kVar.d).m();
                vc.s.j(bVarM2);
                return x.a(((nj0.d) kVar.d).d(), bVarM2);
            case 5:
                return new ne0.d();
            case 6:
                je0.d dVarD = kVar.e.d();
                vc.s.j(dVarD);
                yk0.a aVarB2 = kVar.f.b();
                vc.s.j(aVarB2);
                xe0.f fVarF = kVar.e.f();
                vc.s.j(fVarF);
                return f1.A(dVarD, fVarF, aVarB2);
            case 7:
                xmg.a aVar = kVar.f324252a;
                vxd.b bVar = kVar.k;
                pqi.a aVar2 = kVar.i;
                l70.e eVar = kVar.f324256h;
                ang.f fVarE2 = aVar.e();
                s70.a aVarM = eVar.m();
                vc.s.j(aVarM);
                vpc.a aVar3 = (vpc.a) kVar.C.get();
                f01.c cVarG = aVar2.g();
                wsg.n nVarB = kVar.f324257j.b();
                zxd.c cVarA = ((eyd.b) bVar).a();
                vc.s.j(cVarA);
                vyd.a aVar4 = new vyd.a();
                n0e.b bVarC = ((eyd.b) bVar).c();
                zk0.b bVarL = eVar.l();
                vc.s.j(bVarL);
                return new rrc.q(fVarE2, aVarM, aVar3, cVarG, nVarB, cVarA, aVar4, bVarC, bVarL, aVar2.e(), ((nj0.d) kVar.d).j(), kVar.f324258l.b(), kVar.f324259m.b());
            case 8:
                return new lqc.b((sri.m) kVar.E.get());
            case 9:
                return f1.q(kVar.f324260n);
            case 10:
                return new aqc.j((mqc.r) kVar.I.get());
            case 11:
                return new mqc.r((PayrollServiceV2) kVar.H.get(), (ne0.j) kVar.f324268y.get());
            case 12:
                ik0.b bVarM3 = ((nj0.d) kVar.d).m();
                vc.s.j(bVarM3);
                return y.a(((nj0.d) kVar.d).d(), bVarM3);
            case 13:
                return new aqc.a((mqc.e) kVar.K.get());
            case 14:
                return new mqc.e((PayrollServiceV2) kVar.H.get(), (ne0.j) kVar.f324268y.get());
            default:
                throw new AssertionError(i);
        }
    }
}
