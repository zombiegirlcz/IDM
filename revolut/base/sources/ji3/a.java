package ji3;

import android.content.Context;
import com.revolut.feature.checkout.api.navigation.ResumeCheckoutDestination;
import com.revolut.feature.checkout.api.resume.ResumeCheckoutFeatureConfig;
import com.revolut.feature.checkout.models.Checkout;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import vhi.c;
import yhi.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof ResumeCheckoutFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ResumeCheckoutFeatureConfig config = (ResumeCheckoutFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Checkout checkout = config.f65831a;
        boolean z = config.f65833c;
        navigator.c(c.c(new ResumeCheckoutDestination(config.f65832b, checkout, config.d, z), b.BOTTOM_DIALOG, null, false, 12));
    }
}
