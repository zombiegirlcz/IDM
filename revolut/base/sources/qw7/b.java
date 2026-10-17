package qw7;

import com.revolut.feature.insurance_home.impl.data.network.InsuranceHomeService;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f249790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f249791b;

    public b(c cVar, int i) {
        this.f249790a = cVar;
        this.f249791b = i;
    }

    @Override // phm.a
    public final Object get() {
        c cVar = this.f249790a;
        nj0.a aVar = cVar.f249792a;
        ee0.a aVar2 = cVar.f249793b;
        efk.a aVar3 = cVar.d;
        int i = this.f249791b;
        switch (i) {
            case 0:
                return new kw7.c((kw7.e) cVar.f249797j.get());
            case 1:
                mw7.c cVar2 = (mw7.c) cVar.i.get();
                ffk.t tVarF = aVar3.f();
                vc.s.j(tVarF);
                return new kw7.e(cVar2, tVarF);
            case 2:
                return new mw7.c((ne0.j) cVar.f.get(), (InsuranceHomeService) cVar.f249795g.get(), (ue0.c) cVar.f249796h.get());
            case 3:
                return new ne0.d();
            case 4:
                ik0.b bVarM = ((nj0.d) aVar).m();
                vc.s.j(bVarM);
                return o.a(((nj0.d) aVar).d(), bVarM);
            case 5:
                je0.d dVarD = aVar2.d();
                vc.s.j(dVarD);
                yk0.a aVarB = cVar.f249794c.b();
                vc.s.j(aVarB);
                xe0.f fVarF = aVar2.f();
                vc.s.j(fVarF);
                return u.w(dVarD, aVarB, fVarF);
            case 6:
                fk3.a aVarA = cVar.e.a();
                vc.s.j(aVarA);
                kw7.e eVar = (kw7.e) cVar.f249797j.get();
                ffk.t tVarF2 = aVar3.f();
                vc.s.j(tVarF2);
                return new kw7.h(aVarA, eVar, tVarF2);
            case 7:
                return new kw7.a((iw7.b) cVar.f249798l.get());
            case 8:
                return p.a();
            default:
                throw new AssertionError(i);
        }
    }
}
