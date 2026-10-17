package q9f;

import android.content.Context;
import com.revolut.feature.trading.transfer.investments.api.navigation.TransferOutFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof TransferOutFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        TransferOutFeatureConfig config = (TransferOutFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        vaf.c.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(vaf.b.f287284b, config, null, null, 0, null, null, null, null, false, 1020));
    }
}
