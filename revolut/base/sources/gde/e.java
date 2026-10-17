package gde;

import android.content.Context;
import com.revolut.feature.support.api.navigation.SupportFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.pricing_plans.ui.api.navigation.PricingPlanFeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import ogk.f;
import sri.m;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143173a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f143174b;

    public e(d helpCentreNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandProvider, "helpCentreNaviCommandProvider");
        this.f143174b = helpCentreNaviCommandProvider;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        switch (this.f143173a) {
            case 0:
                Intrinsics.checkNotNullParameter(config, "config");
                return config instanceof SupportFeatureConfig;
            default:
                Intrinsics.checkNotNullParameter(config, "config");
                return config instanceof PricingPlanFeatureConfig;
        }
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        switch (this.f143173a) {
            case 0:
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter((SupportFeatureConfig) featureConfig, "config");
                navigator.c(((d) this.f143174b).a());
                break;
            default:
                PricingPlanFeatureConfig config = (PricingPlanFeatureConfig) featureConfig;
                Intrinsics.checkNotNullParameter(navigator, "navigator");
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(config, "config");
                navigator.c(new FeatureCommand(((f) this.f143174b).a(config)));
                break;
        }
    }

    public e(f kompotDestinationResolver) {
        Intrinsics.checkNotNullParameter(kompotDestinationResolver, "kompotDestinationResolver");
        this.f143174b = kompotDestinationResolver;
    }
}
