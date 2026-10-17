package nw9;

import android.content.Context;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileBridgeFeatureConfig;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileInputData;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PaymentProfileFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ew9.b bVar;
        PaymentProfileFeatureConfig config = (PaymentProfileFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        ew9.a aVar = config.f79619a;
        int i = aVar == null ? -1 : g.f219810a[aVar.ordinal()];
        if (i == -1 || i == 1) {
            bVar = ew9.b.DETAILS;
        } else if (i == 2) {
            bVar = ew9.b.USERNAME;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = ew9.b.QR_SCANNER;
        }
        navigator.c(new FeatureCommand(new PaymentProfileBridgeFeatureConfig(new PaymentProfileInputData(bVar))));
    }
}
