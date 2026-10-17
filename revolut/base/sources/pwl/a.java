package pwl;

import android.content.Context;
import com.revolut.feature.debug_tools.DebugScreenFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import kzl.e;
import kzl.f;
import sri.m;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof DebugScreenFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        DebugScreenFeatureConfig config = (DebugScreenFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        f.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(e.f191130b, null, null, null, 0, null, null, null, null, false, 1022));
    }
}
