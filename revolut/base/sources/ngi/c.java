package ngi;

import android.content.Context;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import pgi.h;
import pgi.k;
import sri.m;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof WebViewFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        WebViewFeatureConfig config = (WebViewFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        k.Companion.getClass();
        ExplicitActivityDestination explicitActivityDestination = h.f235963b;
        String str = config.f98151a;
        Clause clause = config.f98152b;
        int i = config.f98153c;
        boolean z = config.e;
        boolean z3 = config.f;
        boolean z4 = config.f98154g;
        String str2 = config.f98155h;
        Parcelable parcelable = config.i;
        String str3 = config.f98156j;
        if (str3 == null) {
            str3 = "WEB_VIEW_FLOW_NAME";
        }
        navigator.c(new ActivityNavigateCommand(explicitActivityDestination, new WebViewContract$WebViewConfiguration(str, clause, i, z, z3, z4, str2, parcelable, str3, config.k, config.o, config.f98157l, config.f98158m, config.f98159n, config.f98160p, config.f98161q, 8), null, null, 0, null, null, null, null, false, 1020));
    }
}
