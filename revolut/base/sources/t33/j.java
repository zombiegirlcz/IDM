package t33;

import android.content.Context;
import com.revolut.feature.card_order_new.api.IssueVirtualCardFeatureConfig;
import com.revolut.feature.card_order_new.impl.virtual.IssueVirtualCardContract$Configuration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof IssueVirtualCardFeatureConfig;
    }

    @Override // uri.a
    public final void c(sri.m navigator, Context context, FeatureConfig featureConfig) {
        IssueVirtualCardFeatureConfig config = (IssueVirtualCardFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        i.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(b.f267613b, new IssueVirtualCardContract$Configuration(config.f64968a, config.f64969b, config.f64970c, config.d, config.e, config.f, config.f64971g, config.f64972h), null, null, 0, null, null, null, null, false, 1020));
    }
}
