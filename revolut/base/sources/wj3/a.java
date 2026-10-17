package wj3;

import ang.f;
import com.revolut.feature.commodities.onboarding.api.navigation.CommoditiesOnboardingDestination$Risks;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import cu8.r0;
import kotlin.jvm.internal.Intrinsics;
import qka.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements sj3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f297955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f297956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f297957c;
    public final gte.a d;

    public a(hkh.a wealthUiConfiguration, f userInteractor, r0 kycRequiredActionTransformer, c productArticleNavigationProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(wealthUiConfiguration, "wealthUiConfiguration");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f297955a = userInteractor;
        this.f297956b = kycRequiredActionTransformer;
        this.f297957c = productArticleNavigationProvider;
        this.d = featureToggleInteractor;
    }

    public static FeatureCommand a(NaviCommand naviCommand) {
        return new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CommoditiesOnboardingDestination$Risks(naviCommand), false, (Integer) null, 0, 61));
    }
}
