package r7d;

import b8d.l0;
import b8d.n0;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f252170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f252171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f252172c;

    public s(l lVar, t tVar, int i) {
        this.f252170a = lVar;
        this.f252171b = tVar;
        this.f252172c = i;
    }

    @Override // phm.a
    public final Object get() {
        l lVar = this.f252170a;
        ee7.a aVar = lVar.i;
        l70.e eVar = lVar.f252133h;
        h30.a aVar2 = lVar.e;
        kde.a aVar3 = lVar.f252129a;
        int i = this.f252172c;
        switch (i) {
            case 0:
                n30.n nVarK = ((h30.n) aVar2).k();
                mde.e eVarC = aVar3.c();
                SharedFaqDestination.InputData inputData = this.f252171b.f252173a;
                f80.a aVarX = eVar.x();
                vc.s.j(aVarX);
                lde.n nVarE = aVar3.e();
                m30.j jVar = (m30.j) ((h30.n) aVar2).Z.get();
                vc.s.j(jVar);
                be7.k kVarC = aVar.c();
                vc.s.j(kVarC);
                y80.a aVarR = eVar.r();
                vc.s.j(aVarR);
                be7.h hVarB = aVar.b();
                vc.s.j(hVarB);
                p10.h hVar = (p10.h) ((h30.n) aVar2).f148924r0.get();
                vc.s.j(hVar);
                return new com.revolut.feature.shared.help_centre.impl.faq.c(nVarK, eVarC, inputData, aVarX, nVarE, jVar, kVarC, aVarR, hVarB, hVar);
            case 1:
                return new p9d.d();
            case 2:
                return new n0();
            case 3:
                return new b9d.a();
            case 4:
                return new p9d.m(aVar3.e());
            case 5:
                return new p9d.n(aVar3.a(), new l0());
            case 6:
                return new p9d.e(aVar3.a(), new l0());
            default:
                throw new AssertionError(i);
        }
    }
}
