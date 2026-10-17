package p7k;

import android.content.Context;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksBridgeFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig$Details$ByCode;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureInputData;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksRequestSelectionBridgeFeatureConfig;
import hrf.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PaymentLinksFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        FeatureConfig paymentLinksBridgeFeatureConfig;
        String str;
        PaymentLinksFeatureConfig config = (PaymentLinksFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof PaymentLinksFeatureConfig.AcceptPaymentLink) {
            PaymentLinksFeatureConfig.AcceptPaymentLink acceptPaymentLink = (PaymentLinksFeatureConfig.AcceptPaymentLink) config;
            if (acceptPaymentLink instanceof PaymentLinksFeatureConfig.AcceptPaymentLink.ByCode) {
                str = ((PaymentLinksFeatureConfig.AcceptPaymentLink.ByCode) acceptPaymentLink).f102169a;
            } else {
                if (!(acceptPaymentLink instanceof PaymentLinksFeatureConfig.AcceptPaymentLink.ById)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((PaymentLinksFeatureConfig.AcceptPaymentLink.ById) acceptPaymentLink).f102170a;
            }
            navigator.c(gc0.c.f(new PaymentLinksFeatureConfig$Details$ByCode(str)));
            return;
        }
        if (!(config instanceof PaymentLinksFeatureConfig.CreatePaymentLink)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = d.f233789a[((PaymentLinksFeatureConfig.CreatePaymentLink) config).f102171a.ordinal()];
        if (i == 1) {
            paymentLinksBridgeFeatureConfig = PaymentLinksRequestSelectionBridgeFeatureConfig.f102177g;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            paymentLinksBridgeFeatureConfig = new PaymentLinksBridgeFeatureConfig(new PaymentLinksFeatureInputData(f.OUTGOING));
        }
        navigator.c(new FeatureCommand(paymentLinksBridgeFeatureConfig));
    }
}
