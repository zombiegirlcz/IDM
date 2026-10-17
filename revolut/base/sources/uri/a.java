package uri;

import android.content.Context;
import com.revolut.retail.core.navigation.feature.ByIdFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes13.dex */
public interface a {
    default void a(m navigator, Context context, ByIdFeatureConfig config) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
    }

    boolean b(FeatureConfig featureConfig);

    void c(m mVar, Context context, FeatureConfig featureConfig);
}
