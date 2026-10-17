package hte;

import android.content.Context;
import com.revolut.feature.toggles.api.navigation.FeatureToggleNaviConfig;
import com.revolut.feature.toggles.impl.experiment.ValidateRegisteredToggles;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements uri.a, nte.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof FeatureToggleNaviConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        FeatureToggleNaviConfig config = (FeatureToggleNaviConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    @Override // nte.a
    public final List e() {
        return u.c(ValidateRegisteredToggles.f90451a);
    }
}
