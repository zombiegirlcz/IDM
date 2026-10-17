package wik;

import com.revolut.feature.pricing_plans.unlock_benefits.api.PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock;
import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.feature.rev_points.api.RevPointsApi$Toggles;
import com.revolut.retail.feature.plan_referrals.api.PlanReferralsApi$Toggles;
import com.revolut.retail.feature.pricing_plans.ui.api.PricingPlansUiApi$Toggles;
import dfj.m0;
import ggk.g0;
import java.util.List;
import kjk.f0;
import kotlin.jvm.internal.Intrinsics;
import vx9.v;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements egk.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kjk.u f297935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f297936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l61.a f297937c;
    public final gte.a d;

    public t(kjk.u repository, ffk.t pricingPlanInteractor, l61.a userCompanyInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f297935a = repository;
        this.f297936b = pricingPlanInteractor;
        this.f297937c = userCompanyInteractor;
        this.d = featureToggleInteractor;
    }

    public final List c() {
        RevPointsApi$Toggles.RevPoints revPoints = RevPointsApi$Toggles.RevPoints.f83461c;
        jte.d dVar = (jte.d) this.d;
        String[] elements = {dVar.c(revPoints) ? "revPoints" : null, dVar.c(PricingPlansUiApi$Toggles.FamilyPlansRedesignBillingCycleExtras.f102630c) ? "duoBillingCycleExtras" : null, dVar.c(PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock.f80963c) ? "planBenefitsUnlock" : null, dVar.c(PricingPlansApi$Toggles.StudentPlans.f81004c) ? "studentBenefits" : null, dVar.c(PlanReferralsApi$Toggles.PremiumPlanReferral.f102518c) ? "premiumPlanReferral" : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public final efm.r d() {
        efm.r map = ue0.e.p(nim.a.w(hng.g.b(((ang.b) this.f297937c).f7765a), new wgk.f(17)), h0.f322473a).map(new wf6.o(17, new wgk.f(18)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final vkm.d e(String receiverUserName, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(receiverUserName, "receiverUserName");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        f0 f0Var = (f0) this.f297935a;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(receiverUserName, "receiverUserName");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(((w4l.f) f0Var.k.getValue()).e(receiverUserName, loadingStrategy));
    }

    public final m0 f(String planId, g0 entryPoint, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new m0(nim.a.v(g(entryPoint, loadingStrategy), new wb3.k(planId, 9)), planId, 4);
    }

    public final vkm.d g(g0 entryPoint, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(pd.b.r(this.f297936b.v(w4l.h.f294642c), new v(this, 16, entryPoint, loadingStrategy)));
    }
}
