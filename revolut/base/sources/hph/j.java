package hph;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final toh.g f154541a;

    public j(f metricValueMapper, toh.g editableMetricsProvider, toh.k hiddenMetricsProvider) {
        Intrinsics.checkNotNullParameter(metricValueMapper, "metricValueMapper");
        Intrinsics.checkNotNullParameter(editableMetricsProvider, "editableMetricsProvider");
        Intrinsics.checkNotNullParameter(hiddenMetricsProvider, "hiddenMetricsProvider");
        this.f154541a = editableMetricsProvider;
    }

    public static TextLocalisedClause a(zel.g metric) {
        int i;
        Intrinsics.checkNotNullParameter(metric, "metric");
        switch (i.f154540a[metric.ordinal()]) {
            case 1:
                i = R$string.instrument_metric_investment_suggestion_detailed;
                break;
            case 2:
                i = R$string.instrument_metric_total_expected_return_stocks_detailed;
                break;
            case 3:
                i = R$string.instrument_metric_countries_detailed;
                break;
            case 4:
                i = R$string.instrument_metric_market_cap_detailed;
                break;
            case 5:
                i = R$string.instrument_metric_sectors_detailed;
                break;
            case 6:
                i = R$string.instrument_metric_pe_ratio_detailed;
                break;
            case 7:
                i = R$string.instrument_metric_peg_ratio_detailed;
                break;
            case 8:
                i = R$string.instrument_metric_enterprise_value_detailed;
                break;
            case 9:
                i = R$string.instrument_metric_price_sales_ratio_detailed;
                break;
            case 10:
                i = R$string.instrument_metric_evs_ratio_detailed;
                break;
            case 11:
                i = R$string.instrument_metric_price_to_book_ratio_detailed;
                break;
            case 12:
                i = R$string.instrument_metric_price_to_cash_flow_ratio_detailed;
                break;
            case 13:
                i = R$string.instrument_metric_revenue_growth_1y_detailed;
                break;
            case 14:
                i = R$string.instrument_metric_earnings_growth_1y_detailed;
                break;
            case 15:
                i = R$string.instrument_metric_revenue_growth_3y_detailed;
                break;
            case 16:
                i = R$string.instrument_metric_earnings_growth_3y_detailed;
                break;
            case 17:
                i = R$string.instrument_metric_operating_profit_margin_detailed;
                break;
            case 18:
                i = R$string.instrument_metric_net_profit_margin_detailed;
                break;
            case 19:
                i = R$string.instrument_metric_roe_detailed;
                break;
            case 20:
                i = R$string.instrument_metric_div_yield_detailed;
                break;
            case 21:
                i = R$string.instrument_metric_average_volume_detailed;
                break;
            case 22:
                i = R$string.instrument_metric_analyst_rating_detailed;
                break;
            case 23:
                i = R$string.instrument_metric_target_price_distance_detailed;
                break;
            case 24:
                i = R$string.instrument_metric_price_52_weeks_high_detailed;
                break;
            case 25:
                i = R$string.instrument_metric_price_52_weeks_low_detailed;
                break;
            case 26:
                i = R$string.instrument_metric_price_change_1m_detailed;
                break;
            case 27:
                i = R$string.instrument_metric_price_change_1y_detailed;
                break;
            case 28:
                i = R$string.instrument_metric_price_change_5y_detailed;
                break;
            case 29:
                i = R$string.instrument_metric_sharpe_ratio_detailed;
                break;
            case 30:
                i = R$string.instrument_metric_dividend_frequency_detailed;
                break;
            case 31:
                i = R$string.instrument_metric_annualized_return_1y_detailed;
                break;
            case 32:
                i = R$string.instrument_metric_annualized_return_3y_detailed;
                break;
            case 33:
                i = R$string.instrument_metric_standard_deviation_detailed;
                break;
            case 34:
                i = R$string.instrument_metric_tracking_error_detailed;
                break;
            case 35:
                i = R$string.instrument_metric_beta_1y_detailed;
                break;
            case 36:
                i = R$string.instrument_metric_beta_3y_detailed;
                break;
            case 37:
                i = R$string.instrument_metric_beta_5y_detailed;
                break;
            case 38:
                i = R$string.instrument_metric_1h_change_detailed;
                break;
            case 39:
                i = R$string.instrument_metric_4h_change_detailed;
                break;
            case 40:
                i = R$string.instrument_metric_1d_change_detailed;
                break;
            case 41:
                i = R$string.instrument_metric_1w_change_detailed;
                break;
            case 42:
                i = R$string.instrument_metric_underlying_asset_type_detailed;
                break;
            case 43:
                i = R$string.instrument_metric_annualized_return_5y_detailed;
                break;
            case 44:
                i = R$string.instrument_metric_trading_currency_detailed;
                break;
            case 45:
                i = R$string.instrument_metric_expense_ratio_detailed;
                break;
            case 46:
                i = R$string.instrument_metric_distribution_detailed;
                break;
            case 47:
                i = R$string.instrument_metric_etp_theme_detailed;
                break;
            case 48:
                i = R$string.instrument_metric_management_style_detailed;
                break;
            case 49:
                i = R$string.instrument_metric_leverage_type_detailed;
                break;
            case 50:
                i = R$string.instrument_metric_partner_etp_detailed;
                break;
            case 51:
                i = R$string.instrument_metric_aum_detailed;
                break;
            case 52:
                i = R$string.instrument_metric_issuer_type_detailed;
                break;
            case 53:
                i = R$string.instrument_metric_credit_quality_detailed;
                break;
            case 54:
                i = R$string.instrument_metric_ytm_detailed;
                break;
            case 55:
                i = R$string.instrument_metric_remaining_years_detailed;
                break;
            case 56:
                i = R$string.instrument_metric_coupon_rate_detailed;
                break;
            case 57:
                i = R$string.instrument_metric_daily_volatility_detailed;
                break;
            case 58:
                i = R$string.instrument_metric_regulatory_risk_detailed;
                break;
            case 59:
                i = R$string.instrument_metric_exposure_geo_detailed;
                break;
            case 60:
                i = R$string.instrument_metric_issuer_detailed;
                break;
            case 61:
                i = R$string.instrument_metric_issuer_countries_detailed;
                break;
            case 62:
                i = R$string.instrument_metric_maturity_type_detailed;
                break;
            case 63:
                i = R$string.instrument_metric_coupon_type_detailed;
                break;
            case 64:
                i = R$string.instrument_metric_investment_suggestion_detailed;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Paper trading is not supported");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                break;
            case 65:
                i = R$string.instrument_metric_investment_suggestion_detailed;
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("TRADEABLE_DAYS metric should not appear in filter UI");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                break;
            case 66:
                i = R$string.wealth_trading_assets_sorting_mostOwned;
                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("OWNERSHIP_COUNT metric should not appear in filter UI");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static TextLocalisedClause b(zel.g metric) {
        int i;
        Intrinsics.checkNotNullParameter(metric, "metric");
        switch (i.f154540a[metric.ordinal()]) {
            case 1:
                i = R$string.instrument_metric_investment_suggestion;
                break;
            case 2:
                i = R$string.instrument_metric_total_expected_return_stocks;
                break;
            case 3:
                i = R$string.instrument_metric_countries;
                break;
            case 4:
                i = R$string.instrument_metric_market_cap;
                break;
            case 5:
                i = R$string.instrument_metric_sectors;
                break;
            case 6:
                i = R$string.instrument_metric_pe_ratio;
                break;
            case 7:
                i = R$string.instrument_metric_peg_ratio;
                break;
            case 8:
                i = R$string.instrument_metric_enterprise_value;
                break;
            case 9:
                i = R$string.instrument_metric_price_sales_ratio;
                break;
            case 10:
                i = R$string.instrument_metric_evs_ratio;
                break;
            case 11:
                i = R$string.instrument_metric_price_to_book_ratio;
                break;
            case 12:
                i = R$string.instrument_metric_price_to_cash_flow_ratio;
                break;
            case 13:
                i = R$string.instrument_metric_revenue_growth_1y;
                break;
            case 14:
                i = R$string.instrument_metric_earnings_growth_1y;
                break;
            case 15:
                i = R$string.instrument_metric_revenue_growth_3y;
                break;
            case 16:
                i = R$string.instrument_metric_earnings_growth_3y;
                break;
            case 17:
                i = R$string.instrument_metric_operating_profit_margin;
                break;
            case 18:
                i = R$string.instrument_metric_net_profit_margin;
                break;
            case 19:
                i = R$string.instrument_metric_roe;
                break;
            case 20:
                i = R$string.instrument_metric_div_yield;
                break;
            case 21:
                i = R$string.instrument_metric_average_volume;
                break;
            case 22:
                i = R$string.instrument_metric_analyst_rating;
                break;
            case 23:
                i = R$string.instrument_metric_target_price_distance;
                break;
            case 24:
                i = R$string.instrument_metric_price_52_weeks_high;
                break;
            case 25:
                i = R$string.instrument_metric_price_52_weeks_low;
                break;
            case 26:
                i = R$string.instrument_metric_price_change_1m;
                break;
            case 27:
                i = R$string.instrument_metric_price_change_1y;
                break;
            case 28:
                i = R$string.instrument_metric_price_change_5y;
                break;
            case 29:
                i = R$string.instrument_metric_sharpe_ratio;
                break;
            case 30:
                i = R$string.instrument_metric_dividend_frequency;
                break;
            case 31:
                i = R$string.instrument_metric_annualized_return_1y;
                break;
            case 32:
                i = R$string.instrument_metric_annualized_return_3y;
                break;
            case 33:
                i = R$string.instrument_metric_standard_deviation;
                break;
            case 34:
                i = R$string.instrument_metric_tracking_error;
                break;
            case 35:
                i = R$string.instrument_metric_beta_1y;
                break;
            case 36:
                i = R$string.instrument_metric_beta_3y;
                break;
            case 37:
                i = R$string.instrument_metric_beta_5y;
                break;
            case 38:
                i = R$string.instrument_metric_price_change_1h;
                break;
            case 39:
                i = R$string.instrument_metric_price_change_4h;
                break;
            case 40:
                i = R$string.instrument_metric_price_change_1d;
                break;
            case 41:
                i = R$string.instrument_metric_price_change_1w;
                break;
            case 42:
                i = R$string.instrument_metric_underlying_asset_type;
                break;
            case 43:
                i = R$string.instrument_metric_annualized_return_5y;
                break;
            case 44:
                i = R$string.instrument_metric_trading_currency;
                break;
            case 45:
                i = R$string.instrument_metric_expense_ratio;
                break;
            case 46:
                i = R$string.instrument_metric_distribution;
                break;
            case 47:
                i = R$string.instrument_metric_etp_theme;
                break;
            case 48:
                i = R$string.instrument_metric_etp_type;
                break;
            case 49:
                i = R$string.instrument_metric_leverage_type;
                break;
            case 50:
                i = R$string.instrument_metric_partner_etp;
                break;
            case 51:
                i = R$string.instrument_metric_aum;
                break;
            case 52:
                i = R$string.instrument_metric_bond_issuer_type;
                break;
            case 53:
                i = R$string.instrument_metric_credit_quality;
                break;
            case 54:
                i = R$string.instrument_metric_yield_to_maturity;
                break;
            case 55:
                i = R$string.instrument_metric_remaining_years;
                break;
            case 56:
                i = R$string.instrument_metric_coupon_rate;
                break;
            case 57:
                i = R$string.instrument_metric_daily_volatility;
                break;
            case 58:
                i = R$string.instrument_metric_regulatory_risk;
                break;
            case 59:
                i = R$string.instrument_metric_exposure_geo;
                break;
            case 60:
                i = R$string.instrument_metric_issuer;
                break;
            case 61:
                i = R$string.instrument_metric_issuer_country;
                break;
            case 62:
                i = R$string.instrument_metric_maturity_type;
                break;
            case 63:
                i = R$string.instrument_metric_coupon_type;
                break;
            case 64:
                i = R$string.instrument_metric_investment_suggestion;
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Paper trading is not supported");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                break;
            case 65:
                i = R$string.instrument_metric_investment_suggestion;
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("TRADEABLE_DAYS metric should not appear in filter UI");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
                break;
            case 66:
                i = R$string.instrument_metric_ownership_count_sorting;
                IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException(metric + " metric should not appear in filter UI");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException3, h0Var3);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }
}
