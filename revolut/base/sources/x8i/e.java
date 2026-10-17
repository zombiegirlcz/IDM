package x8i;

import android.content.Context;
import com.revolut.feature_news_api.NewsInfoFeatureConfig;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof NewsInfoFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        NewsInfoFeatureConfig config = (NewsInfoFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        b9i.d.Companion.getClass();
        navigator.c(new ActivityNavigateCommand(b9i.a.f13784b, config, null, null, 0, null, null, null, null, false, 1020));
    }
}
