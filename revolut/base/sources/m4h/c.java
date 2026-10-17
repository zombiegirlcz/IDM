package m4h;

import jel.c3;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f202730a;

    static {
        int[] iArr = new int[c3.values().length];
        try {
            iArr[c3.RISK_APPETITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c3.LIQUIDITY_CONSTRAINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c3.GOING_OTC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c3.SANCTIONS_ON_BUY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[c3.PENNY_STOCK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[c3.MERGERS_AND_ACQUISITIONS.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[c3.STOCK_SPLIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[c3.SANCTIONS_SUSPEND.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[c3.BANKRUPTCY.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[c3.GOING_PRIVATE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f202730a = iArr;
    }
}
