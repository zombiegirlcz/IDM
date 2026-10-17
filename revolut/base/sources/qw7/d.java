package qw7;

import com.revolut.feature.insurance_home.impl.data.network.InsuranceHomeService;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f249801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f249802b;

    public d(e eVar, int i) {
        this.f249801a = eVar;
        this.f249802b = i;
    }

    @Override // phm.a
    public final Object get() {
        e eVar = this.f249801a;
        nj0.a aVar = eVar.f249804b;
        ee0.a aVar2 = eVar.f249805c;
        int i = this.f249802b;
        switch (i) {
            case 0:
                return new pw7.c((sri.m) eVar.f249810m.get(), (kw7.e) eVar.f249814r.get());
            case 1:
                return qlc.b.z(eVar.f249803a);
            case 2:
                mw7.c cVar = (mw7.c) eVar.f249813q.get();
                ffk.t tVarF = eVar.e.f();
                vc.s.j(tVarF);
                return new kw7.e(cVar, tVarF);
            case 3:
                return new mw7.c((ne0.j) eVar.f249811n.get(), (InsuranceHomeService) eVar.o.get(), (ue0.c) eVar.f249812p.get());
            case 4:
                return new ne0.d();
            case 5:
                ik0.b bVarM = ((nj0.d) aVar).m();
                vc.s.j(bVarM);
                return o.a(((nj0.d) aVar).d(), bVarM);
            case 6:
                je0.d dVarD = aVar2.d();
                vc.s.j(dVarD);
                yk0.a aVarB = eVar.d.b();
                vc.s.j(aVarB);
                xe0.f fVarF = aVar2.f();
                vc.s.j(fVarF);
                return u.w(dVarD, aVarB, fVarF);
            default:
                throw new AssertionError(i);
        }
    }
}
