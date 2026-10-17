package zae;

import android.content.Context;
import com.revolut.feature.subscriptions.api.SubscriptionsApi$Toggles;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.subscriptions.api.subscriptiondetails.SubscriptionsDetailsFeatureConfig;
import com.revolut.feature.subscriptions.impl.subscriptiondetails.SubscriptionDetailsScreenContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f320660a;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f320660a = featureToggleInteractor;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof SubscriptionsDetailsFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        SubscriptionsDetailsFeatureConfig config = (SubscriptionsDetailsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (((jte.d) this.f320660a).c(SubscriptionsApi$Toggles.SubscriptionDetailsKompotMigration.f89132c)) {
            navigator.c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.SubscriptionDetails(config.f89157c, config.f89155a, config.f89156b)), false, (Integer) null, 0, 61)));
        } else {
            s.Companion.getClass();
            navigator.c(new ActivityNavigateCommand(p.f320678b, new SubscriptionDetailsScreenContract$Configuration(config.f89157c, config.f89155a, config.f89156b), null, null, 0, null, null, null, null, false, 1020));
        }
    }
}
