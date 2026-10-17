package nz9;

import android.content.Context;
import com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.payments.social.api.navigation.TransferOnlyChatDestination;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof SocialPaymentsFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        SocialPaymentsFeatureConfig config = (SocialPaymentsFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof SocialPaymentsFeatureConfig.PaymentsProfileChat) {
            SocialPaymentsFeatureConfig.PaymentsProfileChat paymentsProfileChat = (SocialPaymentsFeatureConfig.PaymentsProfileChat) config;
            navigator.c(u0.f(new PeerToPeerChatDestination(paymentsProfileChat.f79733a, paymentsProfileChat.f79734b, paymentsProfileChat.d)));
        } else {
            if (!(config instanceof SocialPaymentsFeatureConfig.TransferOnlyChat)) {
                throw new NoWhenBranchMatchedException();
            }
            navigator.c(u0.f(new TransferOnlyChatDestination(((SocialPaymentsFeatureConfig.TransferOnlyChat) config).f79736a)));
        }
    }
}
