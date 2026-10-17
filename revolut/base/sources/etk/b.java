package etk;

import com.revolut.retail.feature.stockdetails.impl.domain.internal.key_stats.models.AssetStatsId;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f129444a;

    static {
        int[] iArr = new int[AssetStatsId.Etf.values().length];
        try {
            iArr[AssetStatsId.Etf.RISK_RATING_SRI.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[AssetStatsId.Etf.RISK_RATING_SRRI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[AssetStatsId.Etf.DAILY_OPEN_PRICE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[AssetStatsId.Etf.DAY_RANGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[AssetStatsId.Etf.FIFTY_TWO_WEEK_RANGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[AssetStatsId.Etf.FIVE_YEAR_RANGE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[AssetStatsId.Etf.BETA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[AssetStatsId.Etf.TOTAL_NET_ASSETS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[AssetStatsId.Etf.NET_ASSET_VALUE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[AssetStatsId.Etf.INCOME_DIVIDEND.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[AssetStatsId.Etf.DIVIDEND_YIELD.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[AssetStatsId.Etf.GROSS_EXPENSE_RATIO.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[AssetStatsId.Etf.NET_EXPENSE_RATIO.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[AssetStatsId.Etf.TOTAL_EXPENSE_RATIO.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[AssetStatsId.Etf.GROSS_MANAGEMENT_FEE.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[AssetStatsId.Etf.NET_MANAGEMENT_FEE.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        f129444a = iArr;
    }
}
