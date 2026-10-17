package tr2;

import com.revolut.feature.blocked_merchants.impl.data.network.BlockedMerchantsService;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f273652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f273653b;

    public l(m mVar, int i) {
        this.f273652a = mVar;
        this.f273653b = i;
    }

    @Override // phm.a
    public final Object get() {
        m mVar = this.f273652a;
        int i = this.f273653b;
        switch (i) {
            case 0:
                ang.f fVarE = mVar.f273654a.e();
                or2.b bVar = (or2.b) mVar.C.get();
                xua.a aVarA = mVar.f273657g.a();
                vc.s.j(aVarA);
                return new ur2.c(fVarE, bVar, aVarA, mVar.f273658h.a());
            case 1:
                ne0.j jVar = (ne0.j) mVar.f273669x.get();
                ue0.c cVar = (ue0.c) mVar.A.get();
                BlockedMerchantsService blockedMerchantsService = (BlockedMerchantsService) mVar.B.get();
                or2.a aVar = new or2.a();
                l80.e eVarH = mVar.f.h();
                vc.s.j(eVarH);
                return new or2.g(jVar, cVar, blockedMerchantsService, aVar, eVarH);
            case 2:
                return new ne0.d();
            case 3:
                je0.d dVar = (je0.d) mVar.z.get();
                yk0.a aVarB = mVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = mVar.f273655b.f();
                vc.s.j(fVarF);
                return b.a(dVar, fVarF, aVarB);
            case 4:
                le0.b bVarC = mVar.f273655b.c();
                vc.s.j(bVarC);
                return d.a((kg.o) mVar.f273670y.get(), bVarC);
            case 5:
                kg.o oVarH = ((c21.b) mVar.f273656c).h();
                vc.s.j(oVarH);
                return c.a(oVarH);
            case 6:
                ik0.b bVarM = ((nj0.d) mVar.e).m();
                vc.s.j(bVarM);
                return e.a(((nj0.d) mVar.e).d(), bVarM);
            case 7:
                return new wr2.a();
            case 8:
                ur2.c cVar2 = (ur2.c) mVar.D.get();
                thf.m mVarG = mVar.i.g();
                vc.s.j(mVarG);
                gte.a aVarB2 = mVar.f273659j.b();
                vc.s.j(aVarB2);
                return new vr2.d(cVar2, mVarG, aVarB2);
            case 9:
                return new vr2.e();
            case 10:
                return new vr2.f((sri.m) mVar.H.get());
            case 11:
                return g.a(mVar.k);
            case 12:
                return new xr2.a();
            default:
                throw new AssertionError(i);
        }
    }
}
