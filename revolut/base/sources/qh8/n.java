package qh8;

import com.revolut.feature.junior_onboarding.api.navigation.JuniorOnboardingDestination;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f246546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f246547b;

    public n(k kVar, o oVar) {
        this.f246546a = kVar;
        this.f246547b = oVar;
    }

    @Override // phm.a
    public final Object get() {
        JuniorOnboardingDestination.PostOnboarding.InputData inputData = this.f246547b.f246548a;
        k kVar = this.f246546a;
        til.m mVarA = kVar.f246534g.a();
        vc.s.j(mVarA);
        b bVar = kVar.f;
        lh8.d dVar = (lh8.d) bVar.f246504r.get();
        vc.s.j(dVar);
        return new com.revolut.feature.junior_onboarding.impl.ui.post_onboarding.a(inputData, mVarA, dVar, bVar.b(), kVar.f246535h.a());
    }
}
