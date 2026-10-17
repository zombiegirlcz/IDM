package cv2;

import android.content.Context;
import com.revolut.feature.card.verification.api.navigation.CardVerificationDestination;
import com.revolut.feature.card.verification.api.navigation.CardVerificationFeatureConfig;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof CardVerificationFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        CardVerificationDestination cardVerificationDestination;
        CardVerificationFeatureConfig config = (CardVerificationFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof CardVerificationFeatureConfig.CardVerification) {
            cardVerificationDestination = new CardVerificationDestination(((CardVerificationFeatureConfig.CardVerification) config).f64395a, false);
        } else {
            if (!(config instanceof CardVerificationFeatureConfig.CardVerificationForResult)) {
                throw new NoWhenBranchMatchedException();
            }
            cardVerificationDestination = new CardVerificationDestination(((CardVerificationFeatureConfig.CardVerificationForResult) config).f64396a, true);
        }
        navigator.c(u0.f(cardVerificationDestination));
    }
}
