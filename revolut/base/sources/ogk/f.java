package ogk;

import com.revolut.feature.onboarding.api.onboarding.OnboardingPlanSelectionConfig;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanChangeSuccessActionStrategy;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanUpgradePurpose$GetPlanOrHigher$Tier;
import hha.u;
import hha.w0;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f {
    public final KompotBridgeFeatureConfig a(PricingPlanFeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof PricingPlanFeatureConfig.PlanSelection) {
            return new OnboardingPlanSelectionConfig(((PricingPlanFeatureConfig.PlanSelection) config).f102948a ? 335577088 : 0);
        }
        if (config instanceof PricingPlanFeatureConfig.DashboardByFeature) {
            PricingPlanFeatureConfig.DashboardByFeature dashboardByFeature = (PricingPlanFeatureConfig.DashboardByFeature) config;
            return new InternalPricingPlanFeatureConfig.PlanUpgrade(new PlanUpgradePurpose.GetFeature(dashboardByFeature.f102926a), (PlanSelection) null, dashboardByFeature.f102927b, dashboardByFeature.f102928c, 18);
        }
        boolean z = config instanceof PricingPlanFeatureConfig.DashboardByAnyFeature;
        PlanChangeSuccessActionStrategy.Quit quit = PlanChangeSuccessActionStrategy.Quit.f102917a;
        if (z) {
            PricingPlanFeatureConfig.DashboardByAnyFeature dashboardByAnyFeature = (PricingPlanFeatureConfig.DashboardByAnyFeature) config;
            return new InternalPricingPlanFeatureConfig.PlanUpgrade(new PlanUpgradePurpose.GetAnyFeature(dashboardByAnyFeature.f102923b), (PlanSelection) null, dashboardByAnyFeature.f102924c, quit, 18);
        }
        if (config instanceof PricingPlanFeatureConfig.DashboardByPlans) {
            PricingPlanFeatureConfig.DashboardByPlans dashboardByPlans = (PricingPlanFeatureConfig.DashboardByPlans) config;
            return new InternalPricingPlanFeatureConfig.PlanUpgrade(new PlanUpgradePurpose.GetAnyPlanOf(dashboardByPlans.f102936b), (PlanSelection) null, dashboardByPlans.f102938g, dashboardByPlans.d, 18);
        }
        boolean z3 = config instanceof PricingPlanFeatureConfig.DashboardForCheckout;
        PlanUpgradePurpose getFeature = PlanUpgradePurpose.GetHigherPlan.f103361a;
        if (z3) {
            PricingPlanFeatureConfig.DashboardForCheckout dashboardForCheckout = (PricingPlanFeatureConfig.DashboardForCheckout) config;
            List list = dashboardForCheckout.f102942c;
            u uVar = dashboardForCheckout.f102941b;
            if (list.isEmpty()) {
                u.Companion.getClass();
                if (!Intrinsics.f(uVar, u.F)) {
                    getFeature = new PlanUpgradePurpose.GetFeature(uVar);
                }
            } else {
                getFeature = new PlanUpgradePurpose.GetAnyPlanOf(list);
            }
            return new InternalPricingPlanFeatureConfig.InternalCheckoutPlanSelection(getFeature, dashboardForCheckout.e, dashboardForCheckout.f102940a, dashboardForCheckout.f102943g, dashboardForCheckout.f102944h, dashboardForCheckout.d, dashboardForCheckout.f, dashboardForCheckout.i);
        }
        boolean z4 = config instanceof PricingPlanFeatureConfig.PlanChange;
        PlanSelection.Default r4 = PlanSelection.Default.f103355a;
        if (z4) {
            return new InternalPricingPlanFeatureConfig.InternalPlanChange(((PricingPlanFeatureConfig.PlanChange) config).f102947a, r4, quit);
        }
        if (config instanceof PricingPlanFeatureConfig.UpgradeToAnyPlan) {
            PricingPlanFeatureConfig.UpgradeToAnyPlan upgradeToAnyPlan = (PricingPlanFeatureConfig.UpgradeToAnyPlan) config;
            return new InternalPricingPlanFeatureConfig.PlanUpgrade(getFeature, (PlanSelection) null, upgradeToAnyPlan.f102952a, upgradeToAnyPlan.d, 18);
        }
        if (config instanceof PricingPlanFeatureConfig.UltraDashboard) {
            u.Companion.getClass();
            return new InternalPricingPlanFeatureConfig.PlanUpgrade(new PlanUpgradePurpose.GetFeature(u.f152360r), (PlanSelection) null, xfa.b.ULTRA_DEEPLINK, new PlanChangeSuccessActionStrategy.CardOrderIfNeeded(null), 18);
        }
        if (config instanceof PricingPlanFeatureConfig.DashboardByPlanTier) {
            PricingPlanFeatureConfig.DashboardByPlanTier dashboardByPlanTier = (PricingPlanFeatureConfig.DashboardByPlanTier) config;
            w0 w0Var = dashboardByPlanTier.f102932a;
            return new InternalPricingPlanFeatureConfig.PlanUpgrade(new PlanUpgradePurpose$GetPlanOrHigher$Tier(w0Var), new PlanSelection.PlanTier(w0Var), dashboardByPlanTier.f102933b, dashboardByPlanTier.f102934c, 16);
        }
        if (!(config instanceof PricingPlanFeatureConfig.DashboardFromPlanTier)) {
            throw new NoWhenBranchMatchedException();
        }
        PricingPlanFeatureConfig.DashboardFromPlanTier dashboardFromPlanTier = (PricingPlanFeatureConfig.DashboardFromPlanTier) config;
        return new InternalPricingPlanFeatureConfig.PlanUpgrade(new PlanUpgradePurpose.GetPlanFromTier(dashboardFromPlanTier.f102945a), r4, dashboardFromPlanTier.f102946b, quit, 16);
    }
}
