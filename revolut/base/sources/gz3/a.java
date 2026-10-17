package gz3;

import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import com.revolut.feature.credit.application.api.navigation.CreditApplicationFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import ft3.a1;
import ft3.q0;
import kotlin.jvm.internal.Intrinsics;
import yp3.b;
import yp3.c;
import yp3.d;
import yp3.e;
import yp3.f;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ov3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f147934a;

    public a(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f147934a = featureToggleInteractor;
    }

    public final ParcelableDestination c(q0 product, a1 entryPointPayload, wp3.a activeApplicationStrategy, d productArticleStrategy, String str, f productIntroStrategy, c planSelectionStrategy, e eligibilityStrategy, b kycStrategy, IntendedPricingPlan intendedPricingPlan, String str2) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        Intrinsics.checkNotNullParameter(activeApplicationStrategy, "activeApplicationStrategy");
        Intrinsics.checkNotNullParameter(productArticleStrategy, "productArticleStrategy");
        Intrinsics.checkNotNullParameter(productIntroStrategy, "productIntroStrategy");
        Intrinsics.checkNotNullParameter(planSelectionStrategy, "planSelectionStrategy");
        Intrinsics.checkNotNullParameter(eligibilityStrategy, "eligibilityStrategy");
        Intrinsics.checkNotNullParameter(kycStrategy, "kycStrategy");
        return ((jte.d) this.f147934a).c(CreditApplicationPluginsApi$Toggles$StartCreditApplicationKompotNavigation.f66284c) ? new CreditApplicationKompotFeatureConfig.StartApplication.NavigationDestination(product.getF137852c(), product.getD(), entryPointPayload, activeApplicationStrategy, productArticleStrategy, str, productIntroStrategy, planSelectionStrategy, eligibilityStrategy, kycStrategy, product.getF137850a(), intendedPricingPlan, str2) : new BridgeDestination(new FeatureCommand(new CreditApplicationFeatureConfig.StartApplication(entryPointPayload, product, activeApplicationStrategy, productArticleStrategy, str, productIntroStrategy, planSelectionStrategy, eligibilityStrategy, kycStrategy, intendedPricingPlan, 1024)));
    }
}
