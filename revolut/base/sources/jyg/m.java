package jyg;

import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        WidgetisedAnalyticsType widgetisedAnalyticsType = ((jwg.c) obj2).f178997a;
        WidgetisedAnalyticsType.Jisa jisa = widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Jisa ? (WidgetisedAnalyticsType.Jisa) widgetisedAnalyticsType : null;
        String str = jisa != null ? jisa.f95150b : null;
        WidgetisedAnalyticsType widgetisedAnalyticsType2 = ((jwg.c) obj3).f178997a;
        WidgetisedAnalyticsType.Jisa jisa2 = widgetisedAnalyticsType2 instanceof WidgetisedAnalyticsType.Jisa ? (WidgetisedAnalyticsType.Jisa) widgetisedAnalyticsType2 : null;
        return cim.b.b(str, jisa2 != null ? jisa2.f95150b : null);
    }
}
