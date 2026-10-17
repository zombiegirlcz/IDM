package toh;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f273223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f273224b;

    static {
        int[] iArr = new int[zel.f.values().length];
        try {
            iArr[zel.f.ETP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zel.f.CFD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f273223a = iArr;
        int[] iArr2 = new int[zel.g.values().length];
        try {
            iArr2[zel.g.TOTAL_EXPECTED_RETURN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[zel.g.MARKET_CAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zel.g.COUNTRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zel.g.SECTOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[zel.g.INVESTMENT_SUGGESTION.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[zel.g.DIVIDEND_FREQUENCY.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[zel.g.PRICE_EARNINGS_RATIO.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[zel.g.PRICE_EARNINGS_GROWTH_RATIO.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[zel.g.ENTERPRISE_VALUE.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[zel.g.PRICE_SALES_RATIO.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[zel.g.EVS_RATIO.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[zel.g.PRICE_BOOK_RATIO.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[zel.g.PRICE_CASH_FLOW_RATIO.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[zel.g.REVENUE_GROWTH_1Y.ordinal()] = 14;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[zel.g.EPS_GROWTH_1Y.ordinal()] = 15;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[zel.g.REVENUE_GROWTH_3Y.ordinal()] = 16;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[zel.g.EPS_GROWTH_3Y.ordinal()] = 17;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[zel.g.OPERATING_PROFIT_MARGIN.ordinal()] = 18;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[zel.g.NET_PROFIT_MARGIN.ordinal()] = 19;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[zel.g.ROE.ordinal()] = 20;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[zel.g.DIVIDEND_YIELD.ordinal()] = 21;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[zel.g.AVERAGE_VOLUME.ordinal()] = 22;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[zel.g.TARGET_PRICE_DISTANCE.ordinal()] = 23;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[zel.g.SHARPE_RATIO.ordinal()] = 24;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_52W_HIGH.ordinal()] = 25;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_52W_LOW.ordinal()] = 26;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[zel.g.ANALYST_RATING.ordinal()] = 27;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[zel.g.UNDERLYING_ASSET_TYPE.ordinal()] = 28;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[zel.g.ANNUALIZED_RETURN_5Y.ordinal()] = 29;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[zel.g.CURRENCY.ordinal()] = 30;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[zel.g.EXPENSE_RATIO.ordinal()] = 31;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[zel.g.EXPOSURE_GEO.ordinal()] = 32;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[zel.g.DIVIDEND_TYPE.ordinal()] = 33;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[zel.g.LEVERAGE_TYPE.ordinal()] = 34;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[zel.g.COMMISSION_FREE.ordinal()] = 35;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[zel.g.AUM.ordinal()] = 36;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[zel.g.ANNUALIZED_RETURN_1Y.ordinal()] = 37;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[zel.g.ANNUALIZED_RETURN_3Y.ordinal()] = 38;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[zel.g.ISSUER.ordinal()] = 39;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[zel.g.BETA_5Y.ordinal()] = 40;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[zel.g.THEME.ordinal()] = 41;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[zel.g.ISSUER_TYPE.ordinal()] = 42;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[zel.g.RATING.ordinal()] = 43;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[zel.g.ISSUER_COUNTRY.ordinal()] = 44;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[zel.g.YTM.ordinal()] = 45;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[zel.g.REMAINING_YEARS.ordinal()] = 46;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[zel.g.MATURITY_TYPE.ordinal()] = 47;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[zel.g.COUPON_RATE.ordinal()] = 48;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[zel.g.COUPON_TYPE.ordinal()] = 49;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[zel.g.VOLATILITY_1D.ordinal()] = 50;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_1H.ordinal()] = 51;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_4H.ordinal()] = 52;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_1D.ordinal()] = 53;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_1W.ordinal()] = 54;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[zel.g.STANDARD_DEVIATION.ordinal()] = 55;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[zel.g.TRACKING_ERROR.ordinal()] = 56;
        } catch (NoSuchFieldError unused58) {
        }
        try {
            iArr2[zel.g.BETA_1Y.ordinal()] = 57;
        } catch (NoSuchFieldError unused59) {
        }
        try {
            iArr2[zel.g.BETA_3Y.ordinal()] = 58;
        } catch (NoSuchFieldError unused60) {
        }
        try {
            iArr2[zel.g.MANAGEMENT_STYLE.ordinal()] = 59;
        } catch (NoSuchFieldError unused61) {
        }
        try {
            iArr2[zel.g.REGULATORY_RISK.ordinal()] = 60;
        } catch (NoSuchFieldError unused62) {
        }
        try {
            iArr2[zel.g.PAPER_TRADING_INDUSTRY.ordinal()] = 61;
        } catch (NoSuchFieldError unused63) {
        }
        try {
            iArr2[zel.g.TRADEABLE_DAYS.ordinal()] = 62;
        } catch (NoSuchFieldError unused64) {
        }
        try {
            iArr2[zel.g.OWNERSHIP_COUNT.ordinal()] = 63;
        } catch (NoSuchFieldError unused65) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_1M.ordinal()] = 64;
        } catch (NoSuchFieldError unused66) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_5Y.ordinal()] = 65;
        } catch (NoSuchFieldError unused67) {
        }
        try {
            iArr2[zel.g.PRICE_CHANGE_1Y.ordinal()] = 66;
        } catch (NoSuchFieldError unused68) {
        }
        f273224b = iArr2;
    }
}
