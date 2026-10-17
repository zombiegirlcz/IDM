package qh8;

import com.revolut.feature.junior_onboarding.impl.service.JuniorCreationService;
import rh8.c0;
import rh8.d0;
import rh8.k0;
import rh8.o0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f246491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f246492b;

    public a(b bVar, int i) {
        this.f246491a = bVar;
        this.f246492b = i;
    }

    @Override // phm.a
    public final Object get() {
        b bVar = this.f246491a;
        int i = this.f246492b;
        switch (i) {
            case 0:
                rh8.a aVar = (rh8.a) bVar.f246493a.f246515l.get();
                vc.s.j(aVar);
                return new rh8.w(aVar, bVar.f246494b.f(), bVar.f246495c.a());
            case 1:
                return new o0(bVar.d.e(), bVar.f246494b.f());
            case 2:
                return new rh8.l(new tb4.t(qgh.c.o(((nj0.d) bVar.e).f())));
            case 3:
                return new rh8.m();
            case 4:
                rh8.a aVar2 = (rh8.a) bVar.f246493a.f246515l.get();
                vc.s.j(aVar2);
                wsg.n nVarB = bVar.f.b();
                kbb.c cVarF = bVar.f246494b.f();
                jla.h hVarA = bVar.f246496g.a();
                gte.a aVarB = bVar.f246497h.b();
                vc.s.j(aVarB);
                return new rh8.f(aVar2, nVarB, cVarF, hVarA, aVarB);
            case 5:
                wh8.j jVar = (wh8.j) bVar.f246493a.o.get();
                vc.s.j(jVar);
                return new d0(jVar);
            case 6:
                d0 d0Var = (d0) bVar.f246503q.get();
                ih0.b bVarF = bVar.i.f();
                vc.s.j(bVarF);
                return new k0(d0Var, bVarF);
            case 7:
                ang.f fVarE = bVar.d.e();
                gte.a aVarB2 = bVar.f246497h.b();
                vc.s.j(aVarB2);
                kbb.c cVarF2 = bVar.f246494b.f();
                zja.a aVarA = ((ika.b) bVar.f246498j).a();
                vc.s.j(aVarA);
                return new c0(fVarE, aVarB2, cVarF2, aVarA);
            case 8:
                return new wh8.b((JuniorCreationService) bVar.f246506t.get());
            case 9:
                ik0.b bVarM = ((nj0.d) bVar.e).m();
                vc.s.j(bVarM);
                return s.a(((nj0.d) bVar.e).d(), bVarM);
            default:
                throw new AssertionError(i);
        }
    }
}
