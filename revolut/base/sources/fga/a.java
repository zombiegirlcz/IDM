package fga;

import aii.e;
import aii.g;
import aii.p;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pricing_plans.unlock_benefits.api.PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock;
import com.revolut.feature.pricing_plans.unlock_benefits.api.navigation.PricingPlansUnlockBenefitsDestination;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.UnlockBenefitsFlow;
import com.revolut.feature.pricing_plans.unlock_benefits.impl.ui.flow.unlock_benefits.UnlockBenefitsFlowContract$InputData;
import java.util.List;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f135021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f135022b;

    public a(ImmutableSet deeplinkGateways, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f135021a = featureToggleInteractor;
        this.f135022b = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock.f80963c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof PricingPlansUnlockBenefitsDestination)) {
            return null;
        }
        if (((d) this.f135021a).c(PricingPlansUnlockBenefitsApi$Toggles$PlanBenefitsUnlock.f80963c)) {
            return new UnlockBenefitsFlow(new UnlockBenefitsFlowContract$InputData(((PricingPlansUnlockBenefitsDestination) destination).f80964b));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f135022b;
    }
}
