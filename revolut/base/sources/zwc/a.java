package zwc;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.select.payment.api.models.IntroScreenConfiguration;
import com.revolut.feature.select.payment.api.navigation.SelectPaymentFlowProvider$ScreenConfiguration;
import com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentFlowContract$InputData;
import com.revolut.feature.select.payment.impl.ui.flow.SelectPaymentRootFlow;
import kotlin.jvm.internal.Intrinsics;
import t61.g;

/* JADX INFO: loaded from: classes7.dex */
public interface a {
    static SelectPaymentRootFlow a(a aVar, g externalCard, SelectPaymentFlowProvider$ScreenConfiguration selectPaymentFlowProvider$ScreenConfiguration, AnalyticsContext analyticsContext, int i) {
        if ((i & 1) != 0) {
            g.Companion.getClass();
            externalCard = g.B;
        }
        if ((i & 2) != 0) {
            selectPaymentFlowProvider$ScreenConfiguration = null;
        }
        boolean z = (i & 4) == 0;
        AnalyticsContext analyticsContext2 = (i & 8) != 0 ? null : analyticsContext;
        boolean z3 = (i & 16) == 0;
        ((dxc.a) aVar).getClass();
        Intrinsics.checkNotNullParameter(externalCard, "externalCard");
        return new SelectPaymentRootFlow(new SelectPaymentFlowContract$InputData(externalCard, new SelectPaymentFlowContract$InputData.Configuration(selectPaymentFlowProvider$ScreenConfiguration != null ? new IntroScreenConfiguration(selectPaymentFlowProvider$ScreenConfiguration.f85804a, selectPaymentFlowProvider$ScreenConfiguration.f85805b, selectPaymentFlowProvider$ScreenConfiguration.f85806c, selectPaymentFlowProvider$ScreenConfiguration.d) : null, true, z, analyticsContext2, z3)));
    }
}
