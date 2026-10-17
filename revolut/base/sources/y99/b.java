package y99;

import android.content.Context;
import com.revolut.feature.onboarding.api.missinginfo.MissingInfoFeatureConfig;
import com.revolut.feature.onboarding.impl.missinginfo.MissingInfoInternalContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof MissingInfoFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        MissingInfoFeatureConfig config = (MissingInfoFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        k.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(f.f311774b, new MissingInfoInternalContract$Configuration(config.f78176a, config.f78178c), null, config.f78177b, 0, null, null, null, null, false, 1012));
    }
}
