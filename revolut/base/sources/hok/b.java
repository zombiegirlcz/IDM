package hok;

import aii.e;
import aii.g;
import aii.p;
import com.revolut.retail.feature.pricing_plans.waitlist.api.PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist;
import com.revolut.retail.feature.pricing_plans.waitlist.api.navigation.PricingPlanWaitlistDestination;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.WaitlistControllerFlow;
import com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.flow.WaitlistControllerFlowContract$InputData;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f154351a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f154351a = featureToggleInteractor;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist.f103651c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof PricingPlanWaitlistDestination)) {
            return null;
        }
        if (!((d) this.f154351a).c(PricingPlanWaitlistFeatureApi$Toggles$PricingPlanWaitlist.f103651c)) {
            return null;
        }
        PricingPlanWaitlistDestination.InputData inputData = ((PricingPlanWaitlistDestination) destination).f103677b;
        return new WaitlistControllerFlow(new WaitlistControllerFlowContract$InputData(inputData.f103678a, inputData.f103679b, inputData.f103680c));
    }
}
