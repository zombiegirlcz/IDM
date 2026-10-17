package ni9;

import android.content.Context;
import com.revolut.feature.pay_later.api.navigation.PayLaterFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import qi9.d;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements uri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f215662a;

    public b(d payLaterNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        this.f215662a = payLaterNavigationCommandFactory;
    }

    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PayLaterFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        PayLaterFeatureConfig config = (PayLaterFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (!(config instanceof PayLaterFeatureConfig.Faq)) {
            throw new IllegalArgumentException(String.valueOf(config));
        }
        navigator.c(this.f215662a.f(((PayLaterFeatureConfig.Faq) config).f78821a));
    }
}
