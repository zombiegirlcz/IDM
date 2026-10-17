package uyg;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f284347a;

    public l(kpj.f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f284347a = wealthAccountHeaderUiMapper;
    }

    public final Clause a(WidgetisedAnalyticsType analyticsType, hel.b bVar) {
        Intrinsics.checkNotNullParameter(analyticsType, "analyticsType");
        if ((analyticsType instanceof WidgetisedAnalyticsType.Brokerage) || (analyticsType instanceof WidgetisedAnalyticsType.JointBrokerage) || (analyticsType instanceof WidgetisedAnalyticsType.Commodities) || (analyticsType instanceof WidgetisedAnalyticsType.Robo) || (analyticsType instanceof WidgetisedAnalyticsType.Isa) || (analyticsType instanceof WidgetisedAnalyticsType.Pea) || (analyticsType instanceof WidgetisedAnalyticsType.Cfd)) {
            n2l.j jVarA = ayg.a.a(analyticsType);
            if (jVarA != null) {
                return this.f284347a.h(jVarA, bVar, null);
            }
            m70.a.c(t0.f186434a);
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Jisa) {
            WidgetisedAnalyticsType.Jisa jisa = (WidgetisedAnalyticsType.Jisa) analyticsType;
            return jisa.d ? new TextLocalisedClause(R$string.wealth_invest_home_portfolio_jisa_header_generic_title, null, null, 14) : new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_invest_home_portfolio_jisa_header_short_title, u.c(jisa.f95150b), null, 12);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.Crypto) {
            return new TextLocalisedClause(R$string.wealth_trading_popular_assets_filter_crypto, null, null, 14);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.AllInvestments) {
            return new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_product_all_title, null, null, 14);
        }
        if (analyticsType instanceof WidgetisedAnalyticsType.AllInvestAccounts) {
            return new TextLocalisedClause(com.revolut.feature.wealth.analytics.R$string.wealth_analytics_product_all_invest_title, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
