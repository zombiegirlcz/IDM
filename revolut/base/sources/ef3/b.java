package ef3;

import com.revolut.retail.feature.pricing_plans.waitlist.api.PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist;
import com.revolut.retail.feature.pricing_plans.waitlist.api.navigation.PricingPlanWaitlistDestination;
import jf0.c;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f125269a;

    public b(gte.a featureToggleInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f125269a = featureToggleInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
                this.f125269a = featureToggleInteractor;
                break;
        }
    }

    public PricingPlanWaitlistDestination a(c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        PricingPlanWaitlistDestination pricingPlanWaitlistDestination = new PricingPlanWaitlistDestination((String) deeplink.d.get("planTier"), (String) deeplink.d.get("referral-code"), null);
        if (((d) this.f125269a).c(PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist.f103651c)) {
            return pricingPlanWaitlistDestination;
        }
        return null;
    }
}
