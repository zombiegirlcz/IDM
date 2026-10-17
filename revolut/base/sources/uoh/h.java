package uoh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.retail.wealth.resources.R$string;
import hph.j;
import java.math.BigDecimal;
import java.util.Map;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import soh.i;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public final soh.d a() {
        zel.g gVar = zel.g.AVERAGE_VOLUME;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_average_volume_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_average_volume_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.NUMBER;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("3.0"), gVar2, soh.h.OPEN), new BigDecimal("0.1")), uj3.b.c(new BigDecimal("0.5"), new BigDecimal("0.8"), new BigDecimal("1.0"), new BigDecimal("1.5"), new BigDecimal("2.0"), new BigDecimal("2.5")));
    }

    public final soh.d b() {
        zel.g gVar = zel.g.DIVIDEND_YIELD;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_div_yield_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_div_yield_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("0.1"), gVar2, soh.h.OPEN), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("0.01"), new BigDecimal("0.02"), new BigDecimal("0.03"), new BigDecimal("0.05"), new BigDecimal("0.07"), new BigDecimal("0.09")));
    }

    public final soh.d c() {
        zel.g gVar = zel.g.EVS_RATIO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_evs_ratio_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_evs_ratio_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.NUMBER;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("10.0"), gVar2, soh.h.OPEN), new BigDecimal("0.1")), uj3.b.f(new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3"), new BigDecimal("5"), new BigDecimal("7"), new BigDecimal("9")));
    }

    public final soh.d d() {
        zel.g gVar = zel.g.EPS_GROWTH_1Y;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_earnings_growth_1y_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_earnings_growth_1y_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.d(new BigDecimal("0.0"), new BigDecimal("0.05"), new BigDecimal("0.1"), new BigDecimal("0.15"), new BigDecimal("0.2"), new BigDecimal("0.4")));
    }

    public final soh.d e() {
        zel.g gVar = zel.g.EPS_GROWTH_3Y;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_earnings_growth_3y_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_earnings_growth_3y_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.d(new BigDecimal("0.0"), new BigDecimal("0.05"), new BigDecimal("0.1"), new BigDecimal("0.15"), new BigDecimal("0.25"), new BigDecimal("0.5")));
    }

    public final soh.d f() {
        zel.g gVar = zel.g.ENTERPRISE_VALUE;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_enterprise_value_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_enterprise_value_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.NUMBER;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("12.0"), gVar2, hVar), new BigDecimal("0.1")), uj3.b.f(new BigDecimal("4"), new BigDecimal("6"), new BigDecimal("8"), new BigDecimal("9"), new BigDecimal("10"), new BigDecimal("11")));
    }

    public final ScreenerFilter$Options g() {
        soh.b bVar = soh.e.Companion;
        zel.g gVar = zel.g.ANALYST_RATING;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_analyst_rating_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_analyst_rating_info_dialog_subtitle, null, null, 14), null);
        soh.c cVar = soh.c.CHIPS;
        EnumEntries enumEntriesA = a3f.j.a();
        Map mapK = r0.k(new Pair(a3f.j.STRONG_BUY, Integer.valueOf(R$string.wealth_trading_analyst_ratings_recommendation_strong_buy)), new Pair(a3f.j.BUY, Integer.valueOf(R$string.wealth_trading_analyst_ratings_recommendation_buy)), new Pair(a3f.j.HOLD, Integer.valueOf(R$string.wealth_trading_analyst_ratings_recommendation_hold)), new Pair(a3f.j.SELL, Integer.valueOf(R$string.wealth_trading_analyst_ratings_recommendation_sell)), new Pair(a3f.j.STRONG_SELL, Integer.valueOf(R$string.wealth_trading_analyst_ratings_recommendation_strong_sell)));
        bVar.getClass();
        return soh.b.a(gVar, textLocalisedClauseA, dialog, cVar, enumEntriesA, mapK, null);
    }

    public final soh.d h() {
        zel.g gVar = zel.g.NET_PROFIT_MARGIN;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_net_profit_margin_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_net_profit_margin_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.e(new BigDecimal("0.0"), new BigDecimal("0.04"), new BigDecimal("0.09"), new BigDecimal("0.15"), new BigDecimal("0.22"), new BigDecimal("1")));
    }

    public final soh.d i() {
        zel.g gVar = zel.g.OPERATING_PROFIT_MARGIN;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_operating_profit_margin_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_operating_profit_margin_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.e(new BigDecimal("0.0"), new BigDecimal("0.05"), new BigDecimal("0.1"), new BigDecimal("0.18"), new BigDecimal("0.25"), new BigDecimal("1")));
    }

    public final soh.d j() {
        zel.g gVar = zel.g.PRICE_CHANGE_52W_HIGH;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_price_52_weeks_high_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_price_52_weeks_high_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("1.0"), gVar2, soh.h.OPEN), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("-0.5"), new BigDecimal("-0.3"), new BigDecimal("-0.15"), new BigDecimal("-0.05"), new BigDecimal("0.0"), new BigDecimal("0.5")));
    }

    public final soh.d k() {
        zel.g gVar = zel.g.PRICE_CHANGE_52W_LOW;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_price_52_weeks_low_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_price_52_weeks_low_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("1.0"), gVar2, soh.h.OPEN), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("0.05"), new BigDecimal("0.1"), new BigDecimal("0.2"), new BigDecimal("0.4"), new BigDecimal("0.6"), new BigDecimal("0.8")));
    }

    public final soh.d l() {
        zel.g gVar = zel.g.PRICE_EARNINGS_GROWTH_RATIO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_peg_ratio_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_peg_ratio_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.NUMBER;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("3.0"), gVar2, hVar), new BigDecimal("0.1")), uj3.b.f(new BigDecimal("0.5"), new BigDecimal("1"), new BigDecimal("1.5"), new BigDecimal("2"), new BigDecimal("2.5"), new BigDecimal("2.8")));
    }

    public final soh.d m() {
        zel.g gVar = zel.g.PRICE_BOOK_RATIO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_price_to_book_ratio_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_price_to_book_ratio_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.NUMBER;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("5.0"), gVar2, hVar), new BigDecimal("0.1")), uj3.b.f(new BigDecimal("0.8"), new BigDecimal("1.2"), new BigDecimal("2"), new BigDecimal("3"), new BigDecimal("4"), new BigDecimal("4.5")));
    }

    public final soh.d n() {
        zel.g gVar = zel.g.PRICE_CASH_FLOW_RATIO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_price_to_cash_flow_ratio_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_price_to_cash_flow_ratio_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-10.0");
        soh.g gVar2 = soh.g.NUMBER;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("30.0"), gVar2, hVar), new BigDecimal("0.1")), uj3.b.f(new BigDecimal("5"), new BigDecimal("10"), new BigDecimal("15"), new BigDecimal("20"), new BigDecimal("25"), new BigDecimal("28")));
    }

    public final soh.d o() {
        zel.g gVar = zel.g.PRICE_EARNINGS_RATIO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_pe_ratio_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_pe_ratio_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.NUMBER;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("50.0"), gVar2, hVar), new BigDecimal("0.1")), uj3.b.f(new BigDecimal("10"), new BigDecimal("15"), new BigDecimal("20"), new BigDecimal("25"), new BigDecimal("35"), new BigDecimal("45")));
    }

    public final soh.d p() {
        zel.g gVar = zel.g.PRICE_SALES_RATIO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_price_sales_ratio_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_price_sales_ratio_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.NUMBER;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("10.0"), gVar2, soh.h.OPEN), new BigDecimal("0.1")), uj3.b.f(new BigDecimal("1"), new BigDecimal("2"), new BigDecimal("3"), new BigDecimal("5"), new BigDecimal("7"), new BigDecimal("9")));
    }

    public final soh.d q() {
        zel.g gVar = zel.g.ROE;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_roe_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_roe_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.e(new BigDecimal("0.0"), new BigDecimal("0.07"), new BigDecimal("0.12"), new BigDecimal("0.18"), new BigDecimal("0.25"), new BigDecimal("1")));
    }

    public final soh.d r() {
        zel.g gVar = zel.g.REVENUE_GROWTH_1Y;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_revenue_growth_1y_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_revenue_growth_1y_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.d(new BigDecimal("0.0"), new BigDecimal("0.05"), new BigDecimal("0.1"), new BigDecimal("0.15"), new BigDecimal("0.2"), new BigDecimal("0.4")));
    }

    public final soh.d s() {
        zel.g gVar = zel.g.REVENUE_GROWTH_3Y;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_revenue_growth_3y_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_revenue_growth_3y_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        soh.h hVar = soh.h.OPEN;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, hVar), new i(new BigDecimal("1.0"), gVar2, hVar), new BigDecimal("0.001")), uj3.b.d(new BigDecimal("0.0"), new BigDecimal("0.05"), new BigDecimal("0.1"), new BigDecimal("0.15"), new BigDecimal("0.25"), new BigDecimal("0.5")));
    }

    public final soh.d t() {
        zel.g gVar = zel.g.SHARPE_RATIO;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_sharpe_ratio_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_sharpe_ratio_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("0.0");
        soh.g gVar2 = soh.g.NUMBER;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("3.0"), gVar2, soh.h.OPEN), new BigDecimal("0.1")), uj3.b.c(new BigDecimal("0.2"), new BigDecimal("0.5"), new BigDecimal("0.8"), new BigDecimal("1.2"), new BigDecimal("1.5"), new BigDecimal("2.0")));
    }

    public final soh.d u() {
        zel.g gVar = zel.g.TARGET_PRICE_DISTANCE;
        TextLocalisedClause textLocalisedClauseA = j.a(gVar);
        ScreenerFilterInfo.Dialog dialog = new ScreenerFilterInfo.Dialog(new TextLocalisedClause(R$string.instrument_metric_target_price_distance_info_dialog_title, null, null, 14), new TextLocalisedClause(R$string.instrument_metric_target_price_distance_info_dialog_subtitle, null, null, 14), null);
        BigDecimal bigDecimal = new BigDecimal("-1.0");
        soh.g gVar2 = soh.g.PERCENTAGE;
        return new soh.d(gVar, textLocalisedClauseA, dialog, new soh.f(new i(bigDecimal, gVar2, soh.h.CLOSED), new i(new BigDecimal("1.0"), gVar2, soh.h.OPEN), new BigDecimal("0.001")), uj3.b.c(new BigDecimal("-0.1"), new BigDecimal("0.0"), new BigDecimal("0.1"), new BigDecimal("0.2"), new BigDecimal("0.4"), new BigDecimal("0.6")));
    }
}
