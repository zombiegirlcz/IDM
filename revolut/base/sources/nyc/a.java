package nyc;

import android.content.Context;
import com.revolut.feature.selfserve.sot.api.navigation.SotFeatureConfig;
import com.revolut.feature.selfserve.sot.impl.ui.SotActivity;
import com.revolut.feature.selfserve.sot.impl.ui.SotContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof SotFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        SotFeatureConfig config = (SotFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof SotFeatureConfig.Sot)) {
            throw new NoWhenBranchMatchedException();
        }
        navigator.c(new ActivityNavigateCommand(new ExplicitActivityDestination(SotActivity.class), new SotContract$Configuration(((SotFeatureConfig.Sot) config).f85900a), null, null, 0, null, null, null, null, false, 1020));
    }
}
