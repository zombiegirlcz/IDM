package eoa;

import foa.z;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f127882b;

    static {
        int[] iArr = new int[soa.c.values().length];
        try {
            iArr[soa.c.MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[soa.c.REVOLUT_X_MARKETING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[soa.c.PERSONALIZED_THIRD_PARTY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[soa.c.TRADING_STOCKS_VOLATILITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[soa.c.COMMODITY_VOLATILITY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[soa.c.CRYPTOCURRENCY_VOLATILITY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[soa.c.REVOLUT_PAY_DELIVERY_TRACKING.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[soa.c.REVOLUT_PAY_FLIGHT_TRACKING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        f127881a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.CREDIT_COLLECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        f127882b = iArr2;
    }
}
