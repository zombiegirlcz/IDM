package zvk;

import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.key_stats.models.AssetStatsGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.a0;
import zhm.f0;
import zhm.r0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b {
    public static AssetStatsGroup a(AssetStatsId assetStatsId, hel.b bVar) {
        Intrinsics.checkNotNullParameter(assetStatsId, "assetStatsId");
        Set<Map.Entry> setEntrySet = b(bVar).entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            AssetStatsGroup assetStatsGroup = (AssetStatsGroup) entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList2.add(new Pair((AssetStatsId) it8.next(), assetStatsGroup));
            }
            a0.x(arrayList2, arrayList);
        }
        AssetStatsGroup assetStatsGroup2 = (AssetStatsGroup) r0.t(arrayList).get(assetStatsId);
        if (assetStatsGroup2 != null) {
            return assetStatsGroup2;
        }
        throw new IllegalStateException(("AssetStatsId " + assetStatsId + " is not mapped to any group").toString());
    }

    public static Map b(hel.b bVar) {
        Object objC;
        Pair pair = new Pair(AssetStatsGroup.Stocks.PRICE, v.k(AssetStatsId.Stocks.DAILY_OPEN_PRICE, AssetStatsId.Stocks.DAY_RANGE, AssetStatsId.Stocks.FIFTY_TWO_WEEK_RANGE, AssetStatsId.Stocks.FIVE_YEAR_RANGE, AssetStatsId.Stocks.BETA));
        Pair pair2 = new Pair(AssetStatsGroup.Stocks.VOLUME, v.k(AssetStatsId.Stocks.DAY_VOLUME, AssetStatsId.Stocks.AVERAGE_3_MONTH_VOLUME));
        Pair pair3 = new Pair(AssetStatsGroup.Stocks.MARKET_CAP, v.k(AssetStatsId.Stocks.MARKET_CAP, AssetStatsId.Stocks.SHARES_OUTSTANDING, AssetStatsId.Stocks.SHARES_FLOAT));
        Pair pair4 = new Pair(AssetStatsGroup.Stocks.PER_SHARE, v.k(AssetStatsId.Stocks.EARNINGS_PER_SHARE_RFY, AssetStatsId.Stocks.SALES_PER_SHARE_RFY, AssetStatsId.Stocks.BOOK_VALUE_PER_SHARE_RFY, AssetStatsId.Stocks.CASH_FLOW_PER_SHARE_RFY, AssetStatsId.Stocks.CASH_PER_SHARE_RFY));
        Pair pair5 = new Pair(AssetStatsGroup.Stocks.DIVIDEND, v.k(AssetStatsId.Stocks.DIVIDEND_YIELD, AssetStatsId.Stocks.DIVIDEND_PER_SHARE_RFY, AssetStatsId.Stocks.PAYOUT_RATIO));
        Pair pair6 = new Pair(AssetStatsGroup.Stocks.VALUATION, v.k(AssetStatsId.Stocks.PRICE_TO_EARNINGS_RATIO_RFY, AssetStatsId.Stocks.PRICE_TO_SALES_RATIO_RFY, AssetStatsId.Stocks.PRICE_TO_BOOK_RATIO_RFY, AssetStatsId.Stocks.PRICE_TO_CASH_FLOW_RATIO_RFY));
        Pair pair7 = new Pair(AssetStatsGroup.Stocks.PROFITABILITY, v.k(AssetStatsId.Stocks.GROSS_MARGIN_RFY, AssetStatsId.Stocks.OPERATING_MARGIN_RFY, AssetStatsId.Stocks.NET_PROFIT_MARGIN_RFY));
        Pair pair8 = new Pair(AssetStatsGroup.Stocks.MANAGEMENT_EFFECTIVENESS, v.k(AssetStatsId.Stocks.RETURN_ON_EQUITY_RFY, AssetStatsId.Stocks.RETURN_ON_ASSETS_RFY, AssetStatsId.Stocks.RETURN_ON_INVESTMENT_RFY));
        Pair pair9 = new Pair(AssetStatsGroup.Etf.MARKET_CAPITALIZATION, v.k(AssetStatsId.Etf.TOTAL_NET_ASSETS, AssetStatsId.Etf.NET_ASSET_VALUE));
        Pair pair10 = new Pair(AssetStatsGroup.Etf.DIVIDEND, v.k(AssetStatsId.Etf.INCOME_DIVIDEND, AssetStatsId.Etf.DIVIDEND_YIELD));
        Pair pair11 = new Pair(AssetStatsGroup.Etf.CHARGES, v.k(AssetStatsId.Etf.GROSS_EXPENSE_RATIO, AssetStatsId.Etf.NET_EXPENSE_RATIO, AssetStatsId.Etf.TOTAL_EXPENSE_RATIO, AssetStatsId.Etf.GROSS_MANAGEMENT_FEE, AssetStatsId.Etf.NET_MANAGEMENT_FEE));
        Pair pair12 = new Pair(AssetStatsGroup.Etf.PRICE, v.k(AssetStatsId.Etf.DAILY_OPEN_PRICE, AssetStatsId.Etf.DAY_RANGE, AssetStatsId.Etf.FIFTY_TWO_WEEK_RANGE, AssetStatsId.Etf.FIVE_YEAR_RANGE, AssetStatsId.Etf.BETA));
        AssetStatsGroup.Etf etf2 = AssetStatsGroup.Etf.RISK_RATING;
        switch (bVar == null ? -1 : a.f325711b[bVar.ordinal()]) {
            case -1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                objC = f0.f322471a;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                objC = u.c(AssetStatsId.Etf.RISK_RATING_SRI);
                break;
            case 2:
                objC = u.c(AssetStatsId.Etf.RISK_RATING_SRRI);
                break;
        }
        return r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, new Pair(etf2, objC), new Pair(AssetStatsGroup.Bonds.YIELD_RANGE, v.k(AssetStatsId.Bonds.DAILY_OPEN, AssetStatsId.Bonds.DAY_RANGE, AssetStatsId.Bonds.FIFTY_TWO_WEEK_RANGE)), new Pair(AssetStatsGroup.Bonds.YIELD, v.k(AssetStatsId.Bonds.CURRENT_YIELD, AssetStatsId.Bonds.YIELD_TO_MATURITY)), new Pair(AssetStatsGroup.Bonds.PRICE_RANGE, v.k(AssetStatsId.Bonds.DAILY_OPEN_PRICE_PRECISE, AssetStatsId.Bonds.DAY_RANGE_PRECISE, AssetStatsId.Bonds.FIFTY_TWO_WEEK_RANGE_PRECISE)), new Pair(AssetStatsGroup.Bonds.PRICE, v.k(AssetStatsId.Bonds.CLEAN_PRICE, AssetStatsId.Bonds.DIRTY_PRICE, AssetStatsId.Bonds.ACCRUED_INTEREST)), new Pair(AssetStatsGroup.Bonds.RISK, v.k(AssetStatsId.Bonds.MACAULAY_DURATION, AssetStatsId.Bonds.MODIFIED_DURATION, AssetStatsId.Bonds.CONVEXITY)));
    }

    public static List c(trk.a assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        int i = a.f325710a[assetType.ordinal()];
        if (i == 1) {
            return v.k(AssetStatsGroup.Stocks.MARKET_CAP, AssetStatsGroup.Stocks.PER_SHARE, AssetStatsGroup.Stocks.DIVIDEND, AssetStatsGroup.Stocks.VALUATION, AssetStatsGroup.Stocks.PROFITABILITY, AssetStatsGroup.Stocks.MANAGEMENT_EFFECTIVENESS, AssetStatsGroup.Stocks.PRICE, AssetStatsGroup.Stocks.VOLUME);
        }
        if (i == 2) {
            return v.k(AssetStatsGroup.Etf.MARKET_CAPITALIZATION, AssetStatsGroup.Etf.DIVIDEND, AssetStatsGroup.Etf.CHARGES, AssetStatsGroup.Etf.PRICE, AssetStatsGroup.Etf.RISK_RATING);
        }
        if (i == 3) {
            return v.k(AssetStatsGroup.Bonds.YIELD_RANGE, AssetStatsGroup.Bonds.YIELD, AssetStatsGroup.Bonds.PRICE_RANGE, AssetStatsGroup.Bonds.PRICE, AssetStatsGroup.Bonds.RISK);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static List d(AssetStatsGroup assetStatsGroup, hel.b bVar) {
        Intrinsics.checkNotNullParameter(assetStatsGroup, "assetStatsGroup");
        List list = (List) b(bVar).get(assetStatsGroup);
        if (list != null) {
            return list;
        }
        throw new IllegalStateException(("AssetStatsGroup " + assetStatsGroup + " is not mapped to any items").toString());
    }
}
