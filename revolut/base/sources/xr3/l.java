package xr3;

import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.impl.network.CreditOnboardingService;
import ft3.a1;
import ft3.d1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;

/* JADX INFO: loaded from: classes21.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditOnboardingService f308228a;

    public l(CreditOnboardingService creditOnboardingService, cr3.n workflowApplicationDtoMapper) {
        Intrinsics.checkNotNullParameter(creditOnboardingService, "creditOnboardingService");
        Intrinsics.checkNotNullParameter(workflowApplicationDtoMapper, "workflowApplicationDtoMapper");
        this.f308228a = creditOnboardingService;
    }

    public final Object a(d1 d1Var, String str, IntendedPricingPlan intendedPricingPlan, a1 a1Var, xq3.h hVar) {
        xkl.e eVar = new xkl.e(1, d1Var, this, a1Var, intendedPricingPlan, str, (Continuation) null);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, eVar, hVar);
    }

    public final Object b(d1 d1Var, String str, xq3.i iVar) {
        xge.f fVar = new xge.f(this, d1Var, str, null, 15);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, fVar, iVar);
    }

    public final Object c(d1 d1Var, a1 a1Var, xq3.g gVar) {
        wh3.h hVar = new wh3.h(this, d1Var, a1Var, (Continuation) null, 19);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, hVar, gVar);
    }
}
