package z58;

import com.revolut.feature.junior.account_activation.impl.data.network.JuniorAccountActivationService;
import com.revolut.feature.junior.account_activation.impl.data.network.JuniorActivationClaimService;
import com.revolut.feature.junior.account_activation.impl.data.network.JuniorAsyncAccountActivationService;
import rh8.n0;
import te8.y;
import te8.z;
import vc.s;
import z0g.f1;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f319527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f319528b;

    public a(b bVar, int i) {
        this.f319527a = bVar;
        this.f319528b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f319527a;
        se8.a aVar = bVar.f319530b;
        nf0.a aVar2 = bVar.e;
        mj8.b bVar2 = bVar.f319529a;
        nj0.a aVar3 = bVar.d;
        int i = this.f319528b;
        switch (i) {
            case 0:
                hj8.a aVarA = bVar2.a();
                s.j(aVarA);
                te8.e eVarA = aVar.a();
                s.j(eVarA);
                wsg.n nVarB = bVar.f319531c.b();
                z zVarE = aVar.e();
                s.j(zVarE);
                v58.d dVar = (v58.d) bVar.f319537n.get();
                ic8.b bVarA = bVar.f.a();
                s.j(bVarA);
                n0 n0VarA = bVar.f319532g.f246493a.a();
                a68.l lVar = new a68.l((v58.i) bVar.f319538p.get(), new y());
                gte.a aVarB = bVar.f319533h.b();
                s.j(aVarB);
                return new a68.e(aVarA, eVarA, nVarB, zVarE, dVar, bVarA, n0VarA, lVar, aVarB);
            case 1:
                JuniorAccountActivationService juniorAccountActivationService = (JuniorAccountActivationService) bVar.f319535l.get();
                JuniorAsyncAccountActivationService juniorAsyncAccountActivationService = (JuniorAsyncAccountActivationService) bVar.f319536m.get();
                sf0.h hVarB = aVar2.b();
                s.j(hVarB);
                return new v58.h(juniorAccountActivationService, juniorAsyncAccountActivationService, hVarB);
            case 2:
                return f1.k(((nj0.d) aVar3).f());
            case 3:
                ik0.b bVarM = ((nj0.d) aVar3).m();
                s.j(bVarM);
                return o.a(((nj0.d) aVar3).d(), bVarM);
            case 4:
                JuniorActivationClaimService juniorActivationClaimService = (JuniorActivationClaimService) bVar.o.get();
                sf0.h hVarB2 = aVar2.b();
                s.j(hVarB2);
                return new v58.k(juniorActivationClaimService, hVarB2);
            case 5:
                return f1.l(((nj0.d) aVar3).f());
            case 6:
                q58.a aVar4 = (q58.a) bVar.f319539q.get();
                hj8.a aVarA2 = bVar2.a();
                s.j(aVarA2);
                return new a68.i(aVar4, aVarA2, bVar.i.a());
            case 7:
                hj8.a aVarA3 = bVar2.a();
                s.j(aVarA3);
                return new y58.f(aVarA3, (q58.b) bVar.f319540r.get(), bVar.f319534j.e(), bVar.k.a());
            default:
                throw new AssertionError(i);
        }
    }
}
