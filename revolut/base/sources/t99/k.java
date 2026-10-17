package t99;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow;
import com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {
    public static ExchangeGlobalAccessFlow a(bla.c cVar, AnalyticsProduct.Retail analyticsProduct) {
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        return new ExchangeGlobalAccessFlow(new ExchangeGlobalAccessFlowContract$InputData(cVar, analyticsProduct, null, false));
    }

    public static /* synthetic */ ExchangeGlobalAccessFlow b(k kVar, bla.c cVar, AnalyticsProduct.Retail retail, int i) {
        if ((i & 2) != 0) {
            cVar = null;
        }
        kVar.getClass();
        return a(cVar, retail);
    }
}
