package jdi;

import com.revolut.feature_rev_points_pocket_impl.network.RevPointsPocketService;
import nyb.m0;
import zxb.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f173112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f173113b;

    public l(m mVar, int i) {
        this.f173112a = mVar;
        this.f173113b = i;
    }

    @Override // phm.a
    public final Object get() {
        m mVar = this.f173112a;
        int i = this.f173113b;
        switch (i) {
            case 0:
                e4m.e eVar = mVar.k;
                k0 k0Var = mVar.f;
                pdi.a aVar = (pdi.a) eVar.get();
                mdi.a aVar2 = (mdi.a) mVar.f173120l.get();
                eub.a aVarA = k0Var.a();
                vc.s.j(aVarA);
                m0 m0VarG = k0Var.g();
                vc.s.j(m0VarG);
                return new ldi.f(aVar, aVar2, aVarA, m0VarG);
            case 1:
                return new pdi.k((RevPointsPocketService) mVar.f173118h.get(), (ne0.j) mVar.i.get(), (ue0.c) mVar.f173119j.get());
            case 2:
                t tVar = mVar.f173114a;
                nj0.a aVar3 = mVar.f173115b;
                ik0.b bVarM = ((nj0.d) aVar3).m();
                vc.s.j(bVarM);
                return u.a(tVar, bVarM, ((nj0.d) aVar3).d());
            case 3:
                return s.a();
            case 4:
                je0.d dVarD = mVar.f173116c.d();
                vc.s.j(dVarD);
                yk0.a aVarB = mVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = mVar.f173116c.f();
                vc.s.j(fVarF);
                return iz8.c.y(dVarD, fVarF, aVarB);
            case 5:
                com.revolut.domain.interactors.transactions.a aVarC = ((bjf.a) mVar.e).c();
                vc.s.j(aVarC);
                return new mdi.e(aVarC);
            case 6:
                ldi.f fVar = (ldi.f) mVar.f173121m.get();
                eub.a aVarA2 = mVar.f.a();
                vc.s.j(aVarA2);
                return new ldi.a(fVar, aVarA2);
            case 7:
                ue0.c cVar = (ue0.c) mVar.f173119j.get();
                l80.e eVarH = mVar.f173117g.h();
                vc.s.j(eVarH);
                return new ldi.d(cVar, eVarH);
            case 8:
                return new ldi.h();
            case 9:
                return new kdi.a();
            case 10:
                return new ldi.k((ldi.f) mVar.f173121m.get(), new yk0.d());
            default:
                throw new AssertionError(i);
        }
    }
}
