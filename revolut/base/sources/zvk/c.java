package zvk;

import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f325712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f325713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f325714c;

    static {
        int[] iArr = new int[AssetStatsId.Stocks.values().length];
        try {
            iArr[AssetStatsId.Stocks.DAILY_OPEN_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AssetStatsId.Stocks.DAY_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AssetStatsId.Stocks.FIFTY_TWO_WEEK_RANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AssetStatsId.Stocks.FIVE_YEAR_RANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AssetStatsId.Stocks.BETA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AssetStatsId.Stocks.DAY_VOLUME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AssetStatsId.Stocks.AVERAGE_3_MONTH_VOLUME.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AssetStatsId.Stocks.MARKET_CAP.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AssetStatsId.Stocks.SHARES_OUTSTANDING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[AssetStatsId.Stocks.SHARES_FLOAT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[AssetStatsId.Stocks.EARNINGS_PER_SHARE_RFY.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[AssetStatsId.Stocks.SALES_PER_SHARE_RFY.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[AssetStatsId.Stocks.BOOK_VALUE_PER_SHARE_RFY.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[AssetStatsId.Stocks.CASH_FLOW_PER_SHARE_RFY.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[AssetStatsId.Stocks.CASH_PER_SHARE_RFY.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[AssetStatsId.Stocks.DIVIDEND_YIELD.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[AssetStatsId.Stocks.DIVIDEND_PER_SHARE_RFY.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[AssetStatsId.Stocks.PAYOUT_RATIO.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[AssetStatsId.Stocks.PRICE_TO_EARNINGS_RATIO_RFY.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[AssetStatsId.Stocks.PRICE_TO_SALES_RATIO_RFY.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[AssetStatsId.Stocks.PRICE_TO_BOOK_RATIO_RFY.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[AssetStatsId.Stocks.PRICE_TO_CASH_FLOW_RATIO_RFY.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[AssetStatsId.Stocks.GROSS_MARGIN_RFY.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[AssetStatsId.Stocks.OPERATING_MARGIN_RFY.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[AssetStatsId.Stocks.NET_PROFIT_MARGIN_RFY.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[AssetStatsId.Stocks.RETURN_ON_EQUITY_RFY.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[AssetStatsId.Stocks.RETURN_ON_ASSETS_RFY.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[AssetStatsId.Stocks.RETURN_ON_INVESTMENT_RFY.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        f325712a = iArr;
        int[] iArr2 = new int[AssetStatsId.Etf.values().length];
        try {
            iArr2[AssetStatsId.Etf.DAILY_OPEN_PRICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[AssetStatsId.Etf.DAY_RANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[AssetStatsId.Etf.FIFTY_TWO_WEEK_RANGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[AssetStatsId.Etf.FIVE_YEAR_RANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[AssetStatsId.Etf.BETA.ordinal()] = 5;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[AssetStatsId.Etf.TOTAL_NET_ASSETS.ordinal()] = 6;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[AssetStatsId.Etf.NET_ASSET_VALUE.ordinal()] = 7;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[AssetStatsId.Etf.INCOME_DIVIDEND.ordinal()] = 8;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[AssetStatsId.Etf.DIVIDEND_YIELD.ordinal()] = 9;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[AssetStatsId.Etf.GROSS_EXPENSE_RATIO.ordinal()] = 10;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[AssetStatsId.Etf.NET_EXPENSE_RATIO.ordinal()] = 11;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[AssetStatsId.Etf.TOTAL_EXPENSE_RATIO.ordinal()] = 12;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[AssetStatsId.Etf.GROSS_MANAGEMENT_FEE.ordinal()] = 13;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[AssetStatsId.Etf.NET_MANAGEMENT_FEE.ordinal()] = 14;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[AssetStatsId.Etf.RISK_RATING_SRI.ordinal()] = 15;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[AssetStatsId.Etf.RISK_RATING_SRRI.ordinal()] = 16;
        } catch (NoSuchFieldError unused44) {
        }
        f325713b = iArr2;
        int[] iArr3 = new int[AssetStatsId.Bonds.values().length];
        try {
            iArr3[AssetStatsId.Bonds.DAILY_OPEN_PRICE_PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr3[AssetStatsId.Bonds.DAY_RANGE_PRECISE.ordinal()] = 2;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr3[AssetStatsId.Bonds.FIFTY_TWO_WEEK_RANGE_PRECISE.ordinal()] = 3;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr3[AssetStatsId.Bonds.CLEAN_PRICE.ordinal()] = 4;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr3[AssetStatsId.Bonds.DIRTY_PRICE.ordinal()] = 5;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr3[AssetStatsId.Bonds.ACCRUED_INTEREST.ordinal()] = 6;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr3[AssetStatsId.Bonds.CURRENT_YIELD.ordinal()] = 7;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr3[AssetStatsId.Bonds.YIELD_TO_MATURITY.ordinal()] = 8;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr3[AssetStatsId.Bonds.DAILY_OPEN.ordinal()] = 9;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr3[AssetStatsId.Bonds.DAY_RANGE.ordinal()] = 10;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr3[AssetStatsId.Bonds.FIFTY_TWO_WEEK_RANGE.ordinal()] = 11;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr3[AssetStatsId.Bonds.MACAULAY_DURATION.ordinal()] = 12;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr3[AssetStatsId.Bonds.MODIFIED_DURATION.ordinal()] = 13;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr3[AssetStatsId.Bonds.CONVEXITY.ordinal()] = 14;
        } catch (NoSuchFieldError unused58) {
        }
        f325714c = iArr3;
    }
}
