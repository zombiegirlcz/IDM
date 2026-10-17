package myg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Boolean.valueOf(!(((WidgetisedAnalyticsType) obj2) instanceof WidgetisedAnalyticsType.AllInvestAccounts)), Boolean.valueOf(!(((WidgetisedAnalyticsType) obj3) instanceof WidgetisedAnalyticsType.AllInvestAccounts)));
    }
}
