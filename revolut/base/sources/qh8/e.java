package qh8;

import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;
import te8.z;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f246518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f246519b;

    public e(k kVar, f fVar) {
        this.f246518a = kVar;
        this.f246519b = fVar;
    }

    @Override // phm.a
    public final Object get() {
        JuniorOnboardingDestination.AppInvite.InputData inputData = this.f246519b.f246520a;
        k kVar = this.f246518a;
        l70.e eVar = kVar.i;
        c70.a aVarZ = eVar.z();
        vc.s.j(aVarZ);
        r70.c cVarA = eVar.A();
        vc.s.j(cVarA);
        se8.a aVar = kVar.d;
        kbb.c cVarF = aVar.f();
        z zVarE = aVar.e();
        vc.s.j(zVarE);
        return new com.revolut.feature.junior_onboarding.impl.ui.app_invite.b(inputData, aVarZ, cVarA, cVarF, zVarE, new ai8.a());
    }
}
