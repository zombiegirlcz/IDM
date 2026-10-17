package pgk;

import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.feature.plan_referrals.api.PlanReferralsApi$Toggles;
import com.revolut.retail.feature.plan_referrals.api.navigation.PlanReferralsDestination$Sender;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$PlanReference;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits.PlanBenefitsScreenContract$UIConfig;
import hha.w0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements xii.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f235980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f235981b;

    public c(d4m.a planReferralsAvailabilityInteractorLazy) {
        Intrinsics.checkNotNullParameter(planReferralsAvailabilityInteractorLazy, "planReferralsAvailabilityInteractorLazy");
        this.f235980a = planReferralsAvailabilityInteractorLazy;
        String[] elements = {"plans/referrals", "plan-benefits/{pricingPlanTier}"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f235981b = kotlin.collections.d.y0(elements);
    }

    @Override // xii.b
    public final Set a() {
        return this.f235981b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        b bVar = new b(deeplink);
        if (bVar.a(0).equals("plan-benefits")) {
            String str = (String) deeplink.f195040b.get("pricingPlanTier");
            w0 w0VarI = str != null ? cp5.d.I(w0.Companion, str) : null;
            if (w0VarI != null) {
                return new InternalPricingPlanFeatureConfig$InternalPlanBenefits$Destination(new PlanBenefitsScreenContract$PlanReference.Tier(w0VarI), xfa.b.PLANS_DEEPLINK, new PlanBenefitsScreenContract$UIConfig(false));
            }
        } else if (bVar.a(0).equals("plans") && bVar.a(1).equals("referrals")) {
            Object obj2 = this.f235980a.get();
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            if (((jte.d) ((sck.a) ((ock.a) obj2)).f261757a).c(PlanReferralsApi$Toggles.PremiumPlanReferral.f102518c)) {
                String strA = lg0.g.a("skipArticle", deeplink.f195041c);
                return new PlanReferralsDestination$Sender(pd.b.j(strA != null ? d0.E0(strA) : null));
            }
        }
        return null;
    }
}
