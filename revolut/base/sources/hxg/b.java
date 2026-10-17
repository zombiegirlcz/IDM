package hxg;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.wealth.analytics.ui.widgetised.flow.WidgetisedAnalyticsFlow;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsInputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {
    public static WidgetisedAnalyticsFlow a(ixg.b analyticsType, AnalyticsProduct analyticsProduct, String str) {
        gwg.a aVar;
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        switch (a.f156595a[analyticsType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                aVar = gwg.a.TRADING;
                break;
            case 9:
            case 10:
                aVar = gwg.a.CRYPTO;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new WidgetisedAnalyticsFlow(new WidgetisedAnalyticsInputData(analyticsType, analyticsProduct, aVar, str));
    }
}
