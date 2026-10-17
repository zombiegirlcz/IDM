package fma;

import com.revolut.feature.profile.api.navigation.ProfileAddressControllerDescriptor;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f136093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f136094b;

    public f(h hVar, g gVar) {
        this.f136093a = hVar;
        this.f136094b = gVar;
    }

    @Override // phm.a
    public final Object get() {
        ProfileAddressControllerDescriptor.InputData inputData = this.f136094b.f136097a;
        h hVar = this.f136093a;
        ang.f fVarE = hVar.f136134h.e();
        xoj.a aVarA = hVar.f136141r.a();
        vc.s.j(aVarA);
        fk3.a aVarA2 = hVar.f136142s.a();
        vc.s.j(aVarA2);
        kma.b bVar = (kma.b) hVar.J.get();
        sf0.h hVarB = hVar.f136139p.b();
        vc.s.j(hVarB);
        v60.e eVarA = hVar.f136140q.a();
        vc.s.j(eVarA);
        return new com.revolut.feature.profile.impl.ui.details.address.flow.c(inputData, fVarE, aVarA, aVarA2, bVar, hVarB, eVarA);
    }
}
