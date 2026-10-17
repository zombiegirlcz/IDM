package iwk;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.StatsSection;
import com.revolut.retail.wealth.resources.R$string;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a {
    public final List a(k parcel) {
        int i;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String str = "SUBHEADER_" + parcel.D();
        StatsSection statsSectionD = parcel.D();
        if (Intrinsics.f(statsSectionD, StatsSection.DividendInformation.f103762b)) {
            i = R$string.wealth_stock_details_stats_per_share_dividend_information_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.Dividends.f103763b)) {
            i = R$string.wealth_stock_details_stats_dividends_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.ExpenseRatios.f103768b)) {
            i = R$string.wealth_stock_details_stats_expense_ratios_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.ManagementEfectiveness.f103769b)) {
            i = R$string.wealth_stock_details_stats_ratios_management_effectiveness_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.ManagementFees.f103770b)) {
            i = R$string.wealth_stock_details_stats_management_fees_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.MarketCapitalisation.f103771b) || Intrinsics.f(statsSectionD, StatsSection.EeaMarketCapitalisation.f103765b)) {
            i = R$string.wealth_stock_details_stats_price_volume_market_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.PerShareData.f103772b)) {
            i = R$string.wealth_stock_details_stats_per_share_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.Price.f103773b) || Intrinsics.f(statsSectionD, StatsSection.EeaPrice.f103766b)) {
            i = R$string.wealth_stock_details_stats_price_volume_price;
        } else if (Intrinsics.f(statsSectionD, StatsSection.ProfitabilityRatios.f103775b)) {
            i = R$string.wealth_stock_details_stats_ratios_profitability_ratios_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.Valuation.f103778b)) {
            i = R$string.wealth_stock_details_stats_ratios_valuation_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.Volume.f103779b)) {
            i = R$string.wealth_details_section_stats_volume;
        } else if (Intrinsics.f(statsSectionD, StatsSection.DividendsAndCharges.f103764b)) {
            i = R$string.wealth_stock_details_stats_charges_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.YieldRange.f103781b)) {
            i = R$string.trading_bonds_stats_dictionary_yield_range_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.PriceRange.f103774b)) {
            i = R$string.trading_bonds_stats_dictionary_price_range_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.Yield.f103780b)) {
            i = R$string.trading_bonds_stats_dictionary_yield_title;
        } else if (Intrinsics.f(statsSectionD, StatsSection.Risk.f103776b)) {
            i = R$string.trading_bonds_stats_dictionary_risk_title;
        } else {
            if (!Intrinsics.f(statsSectionD, StatsSection.RiskRating.f103777b) && !Intrinsics.f(statsSectionD, StatsSection.EeaRiskRating.f103767b)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.wealth_details_stats_group_etf_risk_rating;
        }
        return u.c(new ListSubheaderDelegate.Model(str, (Image) null, (Clause) new TextLocalisedClause(i, null, null, 14), parcel.D().f103761a ? new ResourceImage(R$drawable.uikit_icn_16_info_outline, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : null, parcel.D().f103761a, false, (Clause) null, false, (Object) parcel, (AnalyticsContext) null, 0, 0, 0, 0, (String) null, 260066));
    }
}
