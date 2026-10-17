package xod;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.c4;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.spending_analytics.api.R$string;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.jvm.internal.Intrinsics;
import zod.f0;
import zod.s0;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements wod.a {
    @Override // wod.a
    public final BaseDraggableWidgetDelegate.Model a(String id10, s0 s0Var, AnalyticsAccountsSelection accountsSelection) {
        f0 widgetData = (f0) s0Var;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetData, "widgetData");
        Intrinsics.checkNotNullParameter(accountsSelection, "accountsSelection");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.analytics_chart_title_interest_earned, null, null, 14);
        MoneyClause moneyClause = new MoneyClause(otd.f.a(widgetData.f323985a), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.analytics_dashboard_widget_interest_earned_all_time, null, null, 14);
        ynd.k kVar = widgetData.f323986b;
        return new SimpleTileWidgetDelegate.Model(id10, moneyClause, textLocalisedClause, null, new c4(textLocalisedClause2, new MoneyClause(otd.f.a(kVar.f315459a), new MoneyClause.Format.Defaults(null, null, false, false, 15), new Custom(Integer.valueOf(kVar.f315459a.f(dj0.d.e) ? R$attr.uikit_colorPerformancePositive : R$attr.uikit_colorForeground_50), false, null, false, null, 254), null, 8)), widgetData.f323987c, 40);
    }
}
