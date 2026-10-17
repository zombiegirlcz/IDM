package mzc;

import android.content.Context;
import com.revolut.feature.selfserve.sow.api.navigation.SowFeatureConfig;
import com.revolut.feature.selfserve.sow.impl.ui.SowActivity;
import com.revolut.feature.selfserve.sow.impl.ui.SowContract$Configuration;
import com.revolut.feature.selfserve.sow.impl.ui.home.SowHomeActivity;
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
        return config instanceof SowFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        SowFeatureConfig config = (SowFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof SowFeatureConfig.Sow)) {
            throw new NoWhenBranchMatchedException();
        }
        SowFeatureConfig.Sow sow = (SowFeatureConfig.Sow) config;
        boolean z = sow.f85952a;
        navigator.c(sow.f85953b ? new ActivityNavigateCommand(new ExplicitActivityDestination(SowActivity.class), new SowContract$Configuration(z), null, null, 0, null, null, null, null, false, 1020) : new ActivityNavigateCommand(new ExplicitActivityDestination(SowHomeActivity.class), new SowContract$Configuration(z), null, null, 0, null, null, null, null, false, 1020));
    }
}
