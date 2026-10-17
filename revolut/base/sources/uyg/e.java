package uyg;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.TabsDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.q;
import com.revolut.core.ui_kit.views.t;
import com.revolut.feature.wealth.analytics.R$string;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f284339a;

    public e(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f284339a = featureToggleInteractor;
    }

    public static TextLocalisedClause a(vyg.c timeframe) {
        Intrinsics.checkNotNullParameter(timeframe, "timeframe");
        switch (d.f284338a[timeframe.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.wealth_analytics_widgetised_timeframe_picker_daily, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealth_analytics_widgetised_timeframe_picker_weekly, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.wealth_analytics_widgetised_timeframe_picker_monthly, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.wealth_analytics_widgetised_timeframe_picker_bi_yearly, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.wealth_analytics_widgetised_timeframe_picker_yearly, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.wealth_analytics_widgetised_timeframe_picker_all, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static TextLocalisedClause b(vyg.c cVar) {
        switch (d.f284338a[cVar.ordinal()]) {
            case 1:
                return new TextLocalisedClause(R$string.wealth_analytics_one_day, null, null, 14);
            case 2:
                return new TextLocalisedClause(R$string.wealth_analytics_one_week, null, null, 14);
            case 3:
                return new TextLocalisedClause(R$string.wealth_analytics_one_month, null, null, 14);
            case 4:
                return new TextLocalisedClause(R$string.wealth_analytics_six_months, null, null, 14);
            case 5:
                return new TextLocalisedClause(R$string.wealth_analytics_one_year, null, null, 14);
            case 6:
                return new TextLocalisedClause(R$string.wealth_analytics_all, null, null, 14);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final qv0.i c(vyg.c selectedTimeframe) {
        Intrinsics.checkNotNullParameter("CHART_TIMEFRAMES_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(selectedTimeframe, "selectedTimeframe");
        if (((jte.d) this.f284339a).c(WealthAnalyticsApi$Toggles.AnalyticsUiImprovements.f94964c)) {
            String strName = selectedTimeframe.name();
            EnumEntries<vyg.c> enumEntriesA = vyg.c.a();
            ArrayList arrayList = new ArrayList(w.t(enumEntriesA, 10));
            for (vyg.c cVar : enumEntriesA) {
                arrayList.add(new q(cVar.name(), new t(b(cVar)), 50));
            }
            return new TabsDelegate.Model("CHART_TIMEFRAMES_LIST_ID", arrayList, strName, null, null, null, 0, 0, null, 8120);
        }
        String strName2 = selectedTimeframe.name();
        EnumEntries<vyg.c> enumEntriesA2 = vyg.c.a();
        ArrayList arrayList2 = new ArrayList(w.t(enumEntriesA2, 10));
        for (vyg.c cVar2 : enumEntriesA2) {
            arrayList2.add(new FixedTabs.Item(cVar2.name(), b(cVar2), (AnalyticsContext) null, 12));
        }
        return new FixedTabsDelegate.Model("CHART_TIMEFRAMES_LIST_ID", arrayList2, strName2, false, null, SyslogConstants.LOG_CLOCK);
    }
}
