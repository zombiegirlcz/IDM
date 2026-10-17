package oda;

import com.revolut.feature.pockets.impl.network.PocketDetailsService;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f224338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f224339b;

    public c(d dVar, int i) {
        this.f224338a = dVar;
        this.f224339b = i;
    }

    @Override // phm.a
    public final Object get() {
        d dVar = this.f224338a;
        nj0.a aVar = dVar.f224345j;
        ee0.a aVar2 = dVar.k;
        int i = this.f224339b;
        if (i == 0) {
            return new uea.f((PocketDetailsService) dVar.o.get(), (ne0.j) dVar.f224349p.get(), new uda.a(), (ue0.c) dVar.f224350q.get(), new nd.l(new uda.a()));
        }
        if (i == 1) {
            s sVar = dVar.i;
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
        yk0.a aVarB = dVar.f224346l.b();
        vc.s.j(aVarB);
        xe0.f fVarF = aVar2.f();
        vc.s.j(fVarF);
        return obk.d.u(dVarD, aVarB, fVarF);
    }
}
