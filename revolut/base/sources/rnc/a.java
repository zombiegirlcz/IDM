package rnc;

import yoc.f;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255589a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.AVERAGE_ANNUAL_RETURN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.MEDIAN_RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.BEST_YEAR_RETURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[f.MAX_DRAWDOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[f.AVERAGE_DRAWDOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[f.BETA.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[f.STANDARD_DEVIATION.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[f.SHARPE_RATIO.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[f.VA_R.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[f.DIVIDEND_YIELD.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[f.CAGR.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        f255589a = iArr;
    }
}
