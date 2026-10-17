package cug;

import android.content.Context;
import com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureDestination;
import com.revolut.feature.wealth.account_closure.api.navigation.AccountClosureFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof AccountClosureFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        AccountClosureFeatureConfig config = (AccountClosureFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        navigator.c(gc0.c.f(new KompotOverlayFeatureConfig(new AccountClosureDestination(config.f94887b), yhi.b.POPUP, (Integer) null, 12)));
    }
}
