package cu1;

import com.revolut.feature.apm.blik.api.navigation.BlikFlowDestination;
import fmc.z;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f108766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f108767b;

    public n(k kVar, o oVar) {
        this.f108766a = kVar;
        this.f108767b = oVar;
    }

    @Override // phm.a
    public final Object get() {
        k kVar = this.f108766a;
        ju1.a aVar = (ju1.a) kVar.v.get();
        til.m mVarA = kVar.f108741a.a();
        vc.s.j(mVarA);
        o oVar = this.f108767b;
        k kVar2 = oVar.f108769b;
        fnc.s sVar = new fnc.s((c12.f) kVar2.f108755w.get());
        z zVar = new z((c12.z) kVar2.f108756x.get());
        wj0.a aVarI = ((nj0.d) kVar.e).i();
        vc.s.j(aVarI);
        BlikFlowDestination.InputData inputData = oVar.f108768a;
        eu1.a aVar2 = (eu1.a) kVar.z.get();
        tak.d dVar = (tak.d) kVar.B.get();
        gte.a aVarB = kVar.f108747l.b();
        vc.s.j(aVarB);
        d12.b bVar = (d12.b) kVar.C.get();
        v02.c cVarC = kVar.f108748m.c();
        vc.s.j(cVarC);
        return new com.revolut.feature.apm.blik.impl.ui.flow.a(aVar, mVarA, sVar, zVar, aVarI, inputData, aVar2, dVar, aVarB, bVar, cVarC);
    }
}
