package zvk;

import afl.a0;
import afl.f;
import afl.g;
import afl.h;
import afl.j;
import afl.k;
import afl.l;
import afl.m;
import afl.n;
import afl.o;
import afl.p;
import afl.q;
import afl.t0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import com.revolut.retail.wealth.resources.R$string;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.d f325715a;

    public d(o7.d labelsFormatter) {
        Intrinsics.checkNotNullParameter(labelsFormatter, "labelsFormatter");
        this.f325715a = labelsFormatter;
    }

    public static int a(AssetStatsGroup assetStatsGroupId) {
        Intrinsics.checkNotNullParameter(assetStatsGroupId, "assetStatsGroupId");
        if (assetStatsGroupId == AssetStatsGroup.Stocks.PRICE) {
            return R$string.wealth_details_stats_group_stocks_price;
        }
        if (assetStatsGroupId == AssetStatsGroup.Stocks.VOLUME) {
            return R$string.wealth_details_stats_group_stocks_volume;
        }
        if (assetStatsGroupId == AssetStatsGroup.Stocks.MARKET_CAP) {
            return R$string.wealth_details_stats_group_stocks_market_capitalization;
        }
        if (assetStatsGroupId == AssetStatsGroup.Stocks.PER_SHARE) {
            return R$string.wealth_details_stats_group_stocks_per_share;
        }
        if (assetStatsGroupId == AssetStatsGroup.Stocks.DIVIDEND) {
            return R$string.wealth_details_stats_group_stocks_dividend;
        }
        if (assetStatsGroupId == AssetStatsGroup.Stocks.VALUATION) {
            return R$string.wealth_details_stats_group_stocks_valuation;
        }
        if (assetStatsGroupId == AssetStatsGroup.Stocks.PROFITABILITY) {
            return R$string.wealth_details_stats_group_stocks_profitability_ratios;
        }
        if (assetStatsGroupId == AssetStatsGroup.Stocks.MANAGEMENT_EFFECTIVENESS) {
            return R$string.wealth_details_stats_group_stocks_management_effectiveness;
        }
        if (assetStatsGroupId == AssetStatsGroup.Bonds.YIELD_RANGE) {
            return R$string.wealth_details_stats_group_bonds_yield_range;
        }
        if (assetStatsGroupId == AssetStatsGroup.Bonds.YIELD) {
            return R$string.wealth_details_stats_group_bonds_yield;
        }
        if (assetStatsGroupId == AssetStatsGroup.Bonds.PRICE_RANGE) {
            return R$string.wealth_details_stats_group_bonds_price_range;
        }
        if (assetStatsGroupId == AssetStatsGroup.Bonds.PRICE) {
            return R$string.wealth_details_stats_group_stocks_price;
        }
        if (assetStatsGroupId == AssetStatsGroup.Bonds.RISK) {
            return R$string.wealth_details_stats_group_bonds_risk;
        }
        if (assetStatsGroupId == AssetStatsGroup.Etf.PRICE) {
            return R$string.wealth_details_stats_group_etf_price;
        }
        if (assetStatsGroupId == AssetStatsGroup.Etf.MARKET_CAPITALIZATION) {
            return R$string.wealth_details_stats_group_etf_market_capitalization;
        }
        if (assetStatsGroupId == AssetStatsGroup.Etf.DIVIDEND) {
            return R$string.wealth_details_stats_group_etf_dividend;
        }
        if (assetStatsGroupId == AssetStatsGroup.Etf.CHARGES) {
            return R$string.wealth_details_stats_group_etf_charges;
        }
        if (assetStatsGroupId == AssetStatsGroup.Etf.RISK_RATING) {
            return R$string.wealth_details_stats_group_etf_risk_rating;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int b(AssetStatsId assetStatsId) {
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        if (assetStatsId instanceof AssetStatsId.Stocks) {
            switch (c.f325712a[((AssetStatsId.Stocks) assetStatsId).ordinal()]) {
                case 1:
                    return R$string.wealth_details_section_stats_open;
                case 2:
                    return R$string.wealth_details_section_stats_day_range;
                case 3:
                    return R$string.wealth_details_section_stats_fifty_two_week_range;
                case 4:
                    return R$string.wealth_details_section_stats_five_year_range;
                case 5:
                    return R$string.wealth_details_section_stats_beta_five_year_monthly;
                case 6:
                    return R$string.wealth_details_section_stats_volume;
                case 7:
                    return R$string.wealth_details_section_stats_average_volume;
                case 8:
                    return R$string.wealth_details_section_stats_market_cap;
                case 9:
                    return R$string.wealth_stock_details_stats_price_volume_market_shares_outstanding;
                case 10:
                    return R$string.wealth_stock_details_stats_price_volume_market_float;
                case 11:
                    return R$string.wealth_stock_details_stats_per_share_data_earnings_per_share;
                case 12:
                    return R$string.wealth_stock_details_stats_per_share_data_sales_per_share;
                case 13:
                    return R$string.wealth_stock_details_stats_per_share_data_book_value_per_share;
                case 14:
                    return R$string.wealth_stock_details_stats_per_share_data_cash_flow_per_share;
                case 15:
                    return R$string.wealth_stock_details_stats_per_share_data_cash_per_share;
                case 16:
                    return R$string.wealth_details_section_stats_dividend_yield;
                case 17:
                    return R$string.wealth_stock_details_stats_per_share_dividend_information_info_per_share_title;
                case 18:
                    return R$string.wealth_stock_details_stats_per_share_dividend_information_payout_ratio;
                case 19:
                    return R$string.wealth_stock_details_stats_ratios_valuation_price_earnings;
                case 20:
                    return R$string.wealth_stock_details_stats_ratios_valuation_price_sales;
                case 21:
                    return R$string.wealth_stock_details_stats_ratios_valuation_price_book;
                case 22:
                    return R$string.wealth_stock_details_stats_ratios_valuation_price_cash_flow;
                case 23:
                    return R$string.wealth_stock_details_stats_ratios_profitability_ratios_gross;
                case 24:
                    return R$string.wealth_stock_details_stats_ratios_profitability_ratios_operating;
                case 25:
                    return R$string.wealth_stock_details_stats_ratios_profitability_ratios_net_profit;
                case 26:
                    return R$string.wealth_stock_details_stats_ratios_management_effectiveness_return_equity;
                case 27:
                    return R$string.wealth_stock_details_stats_ratios_management_effectiveness_return_assets;
                case 28:
                    return R$string.wealth_stock_details_stats_ratios_management_effectiveness_return_investment;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (assetStatsId instanceof AssetStatsId.Etf) {
            switch (c.f325713b[((AssetStatsId.Etf) assetStatsId).ordinal()]) {
                case 1:
                    return R$string.wealth_details_section_stats_open;
                case 2:
                    return R$string.wealth_details_section_stats_day_range;
                case 3:
                    return R$string.wealth_details_section_stats_fifty_two_week_range;
                case 4:
                    return R$string.wealth_details_section_stats_five_year_range;
                case 5:
                    return R$string.wealth_details_section_stats_beta_five_year_monthly;
                case 6:
                    return R$string.wealth_details_section_stats_total_assets;
                case 7:
                    return R$string.wealth_details_section_stats_nav;
                case 8:
                    return R$string.wealth_details_section_stats_glossary_income_dividend_title;
                case 9:
                    return R$string.wealth_details_section_stats_glossary_dividend_yield_title;
                case 10:
                    return R$string.wealth_details_section_stats_glossary_gross_expense_ratio_title;
                case 11:
                    return R$string.wealth_details_section_stats_glossary_net_expense_ratio_title;
                case 12:
                    return R$string.wealth_details_section_stats_glossary_total_expense_ratio_title;
                case 13:
                    return R$string.wealth_details_section_stats_glossary_gross_management_fee_title;
                case 14:
                    return R$string.wealth_details_section_stats_glossary_net_management_fee_title;
                case 15:
                    return R$string.wealth_details_section_stats_risk_rating_sri;
                case 16:
                    return R$string.wealth_details_section_stats_risk_rating_srri;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (!(assetStatsId instanceof AssetStatsId.Bonds)) {
            throw new NoWhenBranchMatchedException();
        }
        switch (c.f325714c[((AssetStatsId.Bonds) assetStatsId).ordinal()]) {
            case 1:
                return R$string.trading_bonds_stats_dictionary_price_range_open;
            case 2:
                return R$string.trading_bonds_stats_dictionary_price_range_dayRange;
            case 3:
                return R$string.trading_bonds_stats_dictionary_price_range_fiftyTwoWeekRange;
            case 4:
                return R$string.trading_bonds_stats_dictionary_price_cleanPrice;
            case 5:
                return R$string.trading_bonds_stats_dictionary_price_dirtyPrice;
            case 6:
                return R$string.trading_bonds_stats_dictionary_price_accruedInterest;
            case 7:
                return R$string.trading_bonds_stats_dictionary_yield_currentYield;
            case 8:
                return R$string.trading_bonds_stats_dictionary_yield_yieldToMaturity;
            case 9:
                return R$string.trading_bonds_stats_dictionary_yield_range_open;
            case 10:
                return R$string.trading_bonds_stats_dictionary_yield_range_dayRange;
            case 11:
                return R$string.trading_bonds_stats_dictionary_yield_range_fiftyTwoWeekRange;
            case 12:
                return R$string.trading_bonds_stats_dictionary_risk_macaulayDuration;
            case 13:
                return R$string.trading_bonds_stats_dictionary_risk_modifiedDuration;
            case 14:
                return R$string.trading_bonds_stats_dictionary_risk_convexity;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static ResourceImage c(AssetStatsId assetStatsId) {
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        if ((assetStatsId instanceof AssetStatsId.Stocks) || (assetStatsId instanceof AssetStatsId.Bonds)) {
            return null;
        }
        if (!(assetStatsId instanceof AssetStatsId.Etf)) {
            throw new NoWhenBranchMatchedException();
        }
        switch (c.f325713b[((AssetStatsId.Etf) assetStatsId).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return null;
            case 15:
            case 16:
                return new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorGreyTone50), (List) null, (ImageTransformations) null, (Clause) null, 246);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Clause d(afl.a baseInstrumentStats, AssetStatsId assetStatsId) {
        dj0.d dVar;
        t0 t0Var;
        t0 t0Var2;
        t0 t0Var3;
        Double d;
        dj0.d dVar2;
        dj0.d dVar3;
        dj0.d dVar4;
        Double d5;
        Double d6;
        Double d10;
        Double d15;
        Double d41;
        Double d51;
        o oVar;
        Double d68;
        o oVar2;
        Double d81;
        o oVar3;
        Double d82;
        o oVar4;
        Double d95;
        o7.d dVar5 = this.f325715a;
        x3h.a aVar = (x3h.a) dVar5.f222642b;
        Intrinsics.checkNotNullParameter(baseInstrumentStats, "baseInstrumentStats");
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        if (assetStatsId instanceof AssetStatsId.Bonds) {
            if (baseInstrumentStats instanceof f) {
                switch (c.f325714c[((AssetStatsId.Bonds) assetStatsId).ordinal()]) {
                    case 1:
                        ej0.b bVar = ((f) baseInstrumentStats).f4593b.f4576a;
                        if (bVar != null) {
                            return dVar5.t(bVar);
                        }
                        break;
                    case 2:
                        g gVar = ((f) baseInstrumentStats).f4593b.f4577b;
                        if (gVar != null) {
                            return dVar5.u(gVar);
                        }
                        break;
                    case 3:
                        g gVar2 = ((f) baseInstrumentStats).f4593b.f4578c;
                        if (gVar2 != null) {
                            return dVar5.u(gVar2);
                        }
                        break;
                    case 4:
                        ej0.b bVar2 = ((f) baseInstrumentStats).f4594c.f4580a;
                        if (bVar2 != null) {
                            return dVar5.t(bVar2);
                        }
                        break;
                    case 5:
                        ej0.b bVar3 = ((f) baseInstrumentStats).f4594c.f4581b;
                        if (bVar3 != null) {
                            return dVar5.t(bVar3);
                        }
                        break;
                    case 6:
                        ej0.b bVar4 = ((f) baseInstrumentStats).f4594c.f4582c;
                        if (bVar4 != null) {
                            return dVar5.t(bVar4);
                        }
                        break;
                    case 7:
                        BigDecimal bigDecimal = ((f) baseInstrumentStats).f4594c.d;
                        if (bigDecimal != null) {
                            return dVar5.s(bigDecimal);
                        }
                        break;
                    case 8:
                        BigDecimal bigDecimal2 = ((f) baseInstrumentStats).f4594c.e;
                        if (bigDecimal2 != null) {
                            return dVar5.s(bigDecimal2);
                        }
                        break;
                    case 9:
                        BigDecimal bigDecimal3 = ((f) baseInstrumentStats).d.f4588a;
                        if (bigDecimal3 != null) {
                            return dVar5.s(bigDecimal3);
                        }
                        break;
                    case 10:
                        h hVar = ((f) baseInstrumentStats).d.f4589b;
                        if (hVar != null) {
                            return dVar5.q(hVar);
                        }
                        break;
                    case 11:
                        h hVar2 = ((f) baseInstrumentStats).d.f4590c;
                        if (hVar2 != null) {
                            return dVar5.q(hVar2);
                        }
                        break;
                    case 12:
                        BigDecimal bigDecimal4 = ((f) baseInstrumentStats).e.f4584a;
                        if (bigDecimal4 != null) {
                            return dVar5.w(bigDecimal4);
                        }
                        break;
                    case 13:
                        BigDecimal bigDecimal5 = ((f) baseInstrumentStats).e.f4585b;
                        if (bigDecimal5 != null) {
                            return dVar5.w(bigDecimal5);
                        }
                        break;
                    case 14:
                        BigDecimal bigDecimal6 = ((f) baseInstrumentStats).e.f4586c;
                        if (bigDecimal6 != null) {
                            return dVar5.w(bigDecimal6);
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else if (assetStatsId instanceof AssetStatsId.Etf) {
            if (baseInstrumentStats instanceof q) {
                switch (c.f325713b[((AssetStatsId.Etf) assetStatsId).ordinal()]) {
                    case 1:
                        n nVar = ((q) baseInstrumentStats).f4628b;
                        if (nVar != null && (dVar = nVar.f4617a) != null) {
                            return dVar5.p(dVar);
                        }
                        break;
                    case 2:
                        n nVar2 = ((q) baseInstrumentStats).f4628b;
                        if (nVar2 != null && (t0Var = nVar2.f4618b) != null) {
                            return dVar5.r(t0Var);
                        }
                        break;
                    case 3:
                        n nVar3 = ((q) baseInstrumentStats).f4628b;
                        if (nVar3 != null && (t0Var2 = nVar3.f4619c) != null) {
                            return dVar5.r(t0Var2);
                        }
                        break;
                    case 4:
                        n nVar4 = ((q) baseInstrumentStats).f4628b;
                        if (nVar4 != null && (t0Var3 = nVar4.d) != null) {
                            return dVar5.r(t0Var3);
                        }
                        break;
                    case 5:
                        n nVar5 = ((q) baseInstrumentStats).f4628b;
                        if (nVar5 != null && (d = nVar5.e) != null) {
                            return aVar.a(d.doubleValue());
                        }
                        break;
                    case 6:
                        m mVar = ((q) baseInstrumentStats).f4629c;
                        if (mVar != null && (dVar2 = mVar.f4614a) != null) {
                            return dVar5.v(dVar2);
                        }
                        break;
                    case 7:
                        m mVar2 = ((q) baseInstrumentStats).f4629c;
                        if (mVar2 != null && (dVar3 = mVar2.f4615b) != null) {
                            return dVar5.v(dVar3);
                        }
                        break;
                    case 8:
                        j jVar = ((q) baseInstrumentStats).d;
                        if (jVar != null && (dVar4 = jVar.f4604a) != null) {
                            return dVar5.v(dVar4);
                        }
                        break;
                    case 9:
                        j jVar2 = ((q) baseInstrumentStats).d;
                        if (jVar2 != null && (d5 = jVar2.f4605b) != null) {
                            return aVar.a(d5.doubleValue());
                        }
                        break;
                    case 10:
                        k kVar = ((q) baseInstrumentStats).e;
                        if (kVar != null && (d6 = kVar.f4607a) != null) {
                            return aVar.a(d6.doubleValue());
                        }
                        break;
                    case 11:
                        k kVar2 = ((q) baseInstrumentStats).e;
                        if (kVar2 != null && (d10 = kVar2.f4608b) != null) {
                            return aVar.a(d10.doubleValue());
                        }
                        break;
                    case 12:
                        k kVar3 = ((q) baseInstrumentStats).e;
                        if (kVar3 != null && (d15 = kVar3.f4609c) != null) {
                            return aVar.a(d15.doubleValue());
                        }
                        break;
                    case 13:
                        l lVar = ((q) baseInstrumentStats).f;
                        if (lVar != null && (d41 = lVar.f4611a) != null) {
                            return aVar.a(d41.doubleValue());
                        }
                        break;
                    case 14:
                        l lVar2 = ((q) baseInstrumentStats).f;
                        if (lVar2 != null && (d51 = lVar2.f4612b) != null) {
                            return aVar.a(d51.doubleValue());
                        }
                        break;
                    case 15:
                        p pVar = ((q) baseInstrumentStats).f4631h;
                        Integer numValueOf = (pVar == null || (oVar2 = pVar.f4624a) == null || (d81 = oVar2.f4621a) == null) ? null : Integer.valueOf((int) d81.doubleValue());
                        Integer numValueOf2 = (pVar == null || (oVar = pVar.f4624a) == null || (d68 = oVar.f4622b) == null) ? null : Integer.valueOf((int) d68.doubleValue());
                        if (numValueOf != null && numValueOf2 != null) {
                            return aVar.b(numValueOf.intValue(), numValueOf2.intValue());
                        }
                        break;
                    case 16:
                        p pVar2 = ((q) baseInstrumentStats).f4631h;
                        Integer numValueOf3 = (pVar2 == null || (oVar4 = pVar2.f4625b) == null || (d95 = oVar4.f4621a) == null) ? null : Integer.valueOf((int) d95.doubleValue());
                        Integer numValueOf4 = (pVar2 == null || (oVar3 = pVar2.f4625b) == null || (d82 = oVar3.f4622b) == null) ? null : Integer.valueOf((int) d82.doubleValue());
                        if (numValueOf3 != null && numValueOf4 != null) {
                            return aVar.b(numValueOf3.intValue(), numValueOf4.intValue());
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            if (!(assetStatsId instanceof AssetStatsId.Stocks)) {
                throw new NoWhenBranchMatchedException();
            }
            if (baseInstrumentStats instanceof a0) {
                switch (c.f325712a[((AssetStatsId.Stocks) assetStatsId).ordinal()]) {
                    case 1:
                        dj0.d dVar6 = ((a0) baseInstrumentStats).f4571b.f4655a;
                        if (dVar6 != null) {
                            return dVar5.p(dVar6);
                        }
                        break;
                    case 2:
                        t0 t0Var4 = ((a0) baseInstrumentStats).f4571b.f4656b;
                        if (t0Var4 != null) {
                            return dVar5.r(t0Var4);
                        }
                        break;
                    case 3:
                        t0 t0Var5 = ((a0) baseInstrumentStats).f4571b.f4657c;
                        if (t0Var5 != null) {
                            return dVar5.r(t0Var5);
                        }
                        break;
                    case 4:
                        t0 t0Var6 = ((a0) baseInstrumentStats).f4571b.d;
                        if (t0Var6 != null) {
                            return dVar5.r(t0Var6);
                        }
                        break;
                    case 5:
                        Double d100 = ((a0) baseInstrumentStats).f4571b.e;
                        if (d100 != null) {
                            return aVar.c(d100.doubleValue());
                        }
                        break;
                    case 6:
                        Integer num = ((a0) baseInstrumentStats).f4572c.f4664a;
                        if (num != null) {
                            return aVar.d(num.intValue());
                        }
                        break;
                    case 7:
                        Integer num2 = ((a0) baseInstrumentStats).f4572c.f4665b;
                        if (num2 != null) {
                            return aVar.d(num2.intValue());
                        }
                        break;
                    case 8:
                        dj0.d dVar7 = ((a0) baseInstrumentStats).d.f4649a;
                        if (dVar7 != null) {
                            return dVar5.v(dVar7);
                        }
                        break;
                    case 9:
                        Long l2 = ((a0) baseInstrumentStats).d.f4650b;
                        if (l2 != null) {
                            return aVar.e(l2.longValue());
                        }
                        break;
                    case 10:
                        Long l3 = ((a0) baseInstrumentStats).d.f4651c;
                        if (l3 != null) {
                            return aVar.e(l3.longValue());
                        }
                        break;
                    case 11:
                        dj0.d dVar8 = ((a0) baseInstrumentStats).e.f4652a;
                        if (dVar8 != null) {
                            return dVar5.p(dVar8);
                        }
                        break;
                    case 12:
                        dj0.d dVar9 = ((a0) baseInstrumentStats).e.f4653b;
                        if (dVar9 != null) {
                            return dVar5.p(dVar9);
                        }
                        break;
                    case 13:
                        dj0.d dVar10 = ((a0) baseInstrumentStats).e.f4654c;
                        if (dVar10 != null) {
                            return dVar5.p(dVar10);
                        }
                        break;
                    case 14:
                        dj0.d dVar11 = ((a0) baseInstrumentStats).e.d;
                        if (dVar11 != null) {
                            return dVar5.p(dVar11);
                        }
                        break;
                    case 15:
                        dj0.d dVar12 = ((a0) baseInstrumentStats).e.e;
                        if (dVar12 != null) {
                            return dVar5.p(dVar12);
                        }
                        break;
                    case 16:
                        Double d101 = ((a0) baseInstrumentStats).f.f4633a;
                        if (d101 != null) {
                            return aVar.a(d101.doubleValue());
                        }
                        break;
                    case 17:
                        dj0.d dVar13 = ((a0) baseInstrumentStats).f.f4634b;
                        if (dVar13 != null) {
                            return dVar5.v(dVar13);
                        }
                        break;
                    case 18:
                        Double d102 = ((a0) baseInstrumentStats).f.f4635c;
                        if (d102 != null) {
                            return aVar.c(d102.doubleValue());
                        }
                        break;
                    case 19:
                        Double d103 = ((a0) baseInstrumentStats).f4573g.f4661a;
                        if (d103 != null) {
                            return aVar.c(d103.doubleValue());
                        }
                        break;
                    case 20:
                        Double d104 = ((a0) baseInstrumentStats).f4573g.f4662b;
                        if (d104 != null) {
                            return aVar.c(d104.doubleValue());
                        }
                        break;
                    case 21:
                        Double d105 = ((a0) baseInstrumentStats).f4573g.f4663c;
                        if (d105 != null) {
                            return aVar.c(d105.doubleValue());
                        }
                        break;
                    case 22:
                        Double d106 = ((a0) baseInstrumentStats).f4573g.d;
                        if (d106 != null) {
                            return aVar.c(d106.doubleValue());
                        }
                        break;
                    case 23:
                        Double d107 = ((a0) baseInstrumentStats).f4574h.f4658a;
                        if (d107 != null) {
                            return aVar.a(d107.doubleValue());
                        }
                        break;
                    case 24:
                        Double d108 = ((a0) baseInstrumentStats).f4574h.f4659b;
                        if (d108 != null) {
                            return aVar.a(d108.doubleValue());
                        }
                        break;
                    case 25:
                        Double d109 = ((a0) baseInstrumentStats).f4574h.f4660c;
                        if (d109 != null) {
                            return aVar.a(d109.doubleValue());
                        }
                        break;
                    case 26:
                        Double d110 = ((a0) baseInstrumentStats).i.f4644a;
                        if (d110 != null) {
                            return aVar.a(d110.doubleValue());
                        }
                        break;
                    case 27:
                        Double d111 = ((a0) baseInstrumentStats).i.f4645b;
                        if (d111 != null) {
                            return aVar.a(d111.doubleValue());
                        }
                        break;
                    case 28:
                        Double d112 = ((a0) baseInstrumentStats).i.f4646c;
                        if (d112 != null) {
                            return aVar.a(d112.doubleValue());
                        }
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }
        return null;
    }
}
