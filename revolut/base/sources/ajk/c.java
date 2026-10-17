package ajk;

import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PlanBottomSheetDeeplinkNavigation;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.be_driven.dialog.PricingPlanBottomSheetBEDrivenScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$InputData;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.PlanRevPointsCardsScreenContract$RevPointsCardType;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.bottom_sheet.savings_accounts.PlanSavingsAccountsScreenContract$InputData;
import gmk.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f5588a;

    public c(d pricingPlanBottomSheetsNavigationProvider) {
        Intrinsics.checkNotNullParameter(pricingPlanBottomSheetsNavigationProvider, "pricingPlanBottomSheetsNavigationProvider");
        this.f5588a = pricingPlanBottomSheetsNavigationProvider;
    }

    public final ViewController a(String url2, boolean z) {
        g gVar;
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(url2, "url");
        d dVar = this.f5588a;
        jf0.c cVarD = ((s06.c) dVar.f5589a).d(url2);
        PlanBottomSheetDeeplinkNavigation planBottomSheetDeeplinkNavigationA = cVarD == null ? null : dVar.a(cVarD);
        if (planBottomSheetDeeplinkNavigationA == null) {
            return null;
        }
        if (planBottomSheetDeeplinkNavigationA instanceof igk.d) {
            return new PricingPlanBottomSheetBEDrivenScreen(new PricingPlanBottomSheetBEDrivenScreenContract$InputData(((igk.d) planBottomSheetDeeplinkNavigationA).f161241a, z));
        }
        if (!(planBottomSheetDeeplinkNavigationA instanceof PlanBottomSheetDeeplinkNavigation.SavingsAccounts)) {
            if (planBottomSheetDeeplinkNavigationA.equals(PlanBottomSheetDeeplinkNavigation.RevPointsCards.Credit.f102905a)) {
                return new PlanRevPointsCardsScreen(new PlanRevPointsCardsScreenContract$InputData(PlanRevPointsCardsScreenContract$RevPointsCardType.Credit.f103532a));
            }
            if (planBottomSheetDeeplinkNavigationA.equals(PlanBottomSheetDeeplinkNavigation.RevPointsCards.Debit.f102906a)) {
                return new PlanRevPointsCardsScreen(new PlanRevPointsCardsScreenContract$InputData(PlanRevPointsCardsScreenContract$RevPointsCardType.Debit.f103533a));
            }
            throw new NoWhenBranchMatchedException();
        }
        PlanBottomSheetDeeplinkNavigation.SavingsAccounts savingsAccounts = (PlanBottomSheetDeeplinkNavigation.SavingsAccounts) planBottomSheetDeeplinkNavigationA;
        if (savingsAccounts.equals(PlanBottomSheetDeeplinkNavigation.SavingsAccounts.MMF.f102907a)) {
            gVar = g.MMF;
        } else {
            if (!savingsAccounts.equals(PlanBottomSheetDeeplinkNavigation.SavingsAccounts.Savings.f102908a)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = g.SAVINGS;
        }
        return new PlanSavingsAccountsScreen(new PlanSavingsAccountsScreenContract$InputData(gVar));
    }
}
