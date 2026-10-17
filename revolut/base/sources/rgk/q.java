package rgk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q {
    public static final void a(PricingPlanAction.FlowSpecific flowSpecific, String tag2) {
        Intrinsics.checkNotNullParameter(flowSpecific, "<this>");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        c(flowSpecific, tag2);
    }

    public static final void b(PricingPlanAction.Unsupported unsupported, String tag2) {
        Intrinsics.checkNotNullParameter(unsupported, "<this>");
        Intrinsics.checkNotNullParameter(tag2, "tag");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, tag2, j6.a.q("Unknown pricing plan action type: ", unsupported.f102808a), null, h0Var);
    }

    public static final void c(PricingPlanAction pricingPlanAction, String str) {
        String str2;
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.c cVar = rd0.c.ERROR;
        if (pricingPlanAction instanceof PricingPlanAction.Confirm) {
            str2 = "CONFIRM";
        } else if (pricingPlanAction instanceof PricingPlanAction.ClaimPlanReferral) {
            str2 = "CLAIM_PLAN_REFERRAL";
        } else if (Intrinsics.f(pricingPlanAction, PricingPlanAction.Dismiss.f102801a)) {
            str2 = "DISMISS";
        } else if (Intrinsics.f(pricingPlanAction, PricingPlanAction.Decline.f102800a)) {
            str2 = "DECLINE";
        } else if (pricingPlanAction instanceof PricingPlanAction.OpenBillingPicker) {
            str2 = "OPEN_BILLING_PICKER";
        } else if (pricingPlanAction instanceof PricingPlanAction.OpenUrl) {
            str2 = "OPEN_URL";
        } else if (pricingPlanAction instanceof PricingPlanAction.SeeAllBenefits) {
            str2 = "SEE_ALL_BENEFITS";
        } else if (pricingPlanAction instanceof PricingPlanAction.Upgrade) {
            str2 = "UPGRADE";
        } else if (pricingPlanAction instanceof PricingPlanAction.ApplyDiscount) {
            str2 = "APPLY_DISCOUNT";
        } else if (pricingPlanAction instanceof PricingPlanAction.SeeAllDocuments) {
            str2 = "SEE_ALL_DOCUMENTS";
        } else {
            if (!(pricingPlanAction instanceof PricingPlanAction.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = ((PricingPlanAction.Unsupported) pricingPlanAction).f102808a;
        }
        rd0.d.a(cVar, str, j6.a.q("Pricing plan action is not supported by this surface: ", str2), null, h0Var);
    }
}
