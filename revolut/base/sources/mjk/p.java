package mjk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class p {
    public static final String a(PlansDashboardLayout$ClickAction plansDashboardLayout$ClickAction) {
        Intrinsics.checkNotNullParameter(plansDashboardLayout$ClickAction, "<this>");
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Skip) {
            return "SKIP";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Expand) {
            return "EXPAND";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Select) {
            return "SELECT";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.Upgrade) {
            return "UPGRADE";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.CancelDowngrade) {
            return "CANCEL_DOWNGRADE";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenUrl) {
            return "OPEN_URL";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.ShowPriceBreakdown) {
            return "SHOW_PRICE_BREAKDOWN";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.CreditCardOrderCheckout) {
            return "CREDIT_CARD_ORDER_CHECKOUT";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.OpenOnboardingPlanDashboard) {
            return "OPEN_ONBOARDING_PLAN_DASHBOARD";
        }
        if (plansDashboardLayout$ClickAction instanceof PlansDashboardLayout$ClickAction.ShowBottomSheet) {
            return "SHOW_BOTTOM_SHEET";
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r4.equals("UPGRADE") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        if (r4.equals("OPEN_CONFIRMATION") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0074, code lost:
    
        return com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction.Upgrade.f102744a;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction b(java.lang.String r4, java.lang.String r5) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mjk.p.b(java.lang.String, java.lang.String):com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction");
    }
}
