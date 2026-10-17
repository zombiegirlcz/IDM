package q97;

import com.revolut.feature.pricingplans.api.PricingPlansApi$Toggles;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.limits.api.navigation.LimitsFeatureConfig;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes21.dex */
public final class f1 extends r97.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f243687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t97.d f243688c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(t97.c productCellProvider, gte.a featureToggleInteractor) {
        super(productCellProvider);
        Intrinsics.checkNotNullParameter(productCellProvider, "productCellProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f243687b = featureToggleInteractor;
        this.f243688c = t97.d.LIMITS;
    }

    @Override // r97.b
    public final Flow d() {
        return new go.g(Boolean.valueOf(this.f243687b.a(PricingPlansApi$Toggles.HideLegacyPlanLimits.f81001c)), 2);
    }

    @Override // r97.b
    public final p97.b f() {
        return this.f243688c;
    }

    @Override // r97.b
    public final Object g(Continuation continuation) {
        return new o97.l(new FeatureCommand(new LimitsFeatureConfig.Limits(null, null, 3)));
    }
}
