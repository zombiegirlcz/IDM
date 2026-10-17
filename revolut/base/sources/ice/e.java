package ice;

import android.content.Context;
import com.revolut.feature.subscriptions.api.subscriptionlist.SubscriptionListFeatureConfig;
import com.revolut.feature.subscriptions.impl.subscriptionlist.SubscriptionListContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof SubscriptionListFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        SubscriptionListFeatureConfig config = (SubscriptionListFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        d.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(a.f160247b, new SubscriptionListContract$Configuration(config.f89158a, config.f89159b, config.f89160c, config.d), null, null, 0, null, null, null, null, false, 1020));
    }
}
