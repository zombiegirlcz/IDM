package oda;

import com.revolut.feature.pockets.impl.network.PocketDetailsService;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f224394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f224395b;

    public n(o oVar, int i) {
        this.f224394a = oVar;
        this.f224395b = i;
    }

    @Override // phm.a
    public final Object get() {
        o oVar = this.f224394a;
        nj0.a aVar = oVar.f224408s;
        ee0.a aVar2 = oVar.f224409t;
        int i = this.f224395b;
        if (i == 0) {
            return new uea.f((PocketDetailsService) oVar.Q.get(), (ne0.j) oVar.R.get(), new uda.a(), (ue0.c) oVar.S.get(), new nd.l(new uda.a()));
        }
        if (i == 1) {
            s sVar = oVar.f224407r;
            ik0.b bVarM = ((nj0.d) aVar).m();
            vc.s.j(bVarM);
            return t.a(sVar, bVarM, ((nj0.d) aVar).d());
        }
        if (i == 2) {
            return new ne0.d();
        }
        if (i != 3) {
            throw new AssertionError(i);
        }
        je0.d dVarD = aVar2.d();
        vc.s.j(dVarD);
        yk0.a aVarB = oVar.u.b();
        vc.s.j(aVarB);
        xe0.f fVarF = aVar2.f();
        vc.s.j(fVarF);
        return obk.d.u(dVarD, aVarB, fVarF);
    }
}
