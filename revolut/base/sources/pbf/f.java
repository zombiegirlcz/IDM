package pbf;

import lbf.k;
import lbf.o;
import qbf.q;
import qbf.t;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f234681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f234682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f234683c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[qbf.f.values().length];
        try {
            iArr[qbf.f.TRADING_PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qbf.f.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f234681a = iArr;
        int[] iArr2 = new int[lbf.f.values().length];
        try {
            iArr2[lbf.f.TRADING_PRO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[lbf.f.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f234682b = iArr2;
        int[] iArr3 = new int[t.values().length];
        try {
            iArr3[t.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[t.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[t.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[t.ADVANCED_PORTFOLIO_ANALYTICS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[t.ADVANCED_WEB_TRADING_TERMINAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[t.EXTENDED_SECURITIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[t.INCREASED_ORDER_LIMITS.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[t.DEDICATED_CUSTOMER_SUPPORT.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[t.NO_MINIMUM_FEES.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[t.ORDER_BOOK.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        f234683c = iArr3;
        int[] iArr4 = new int[k.values().length];
        try {
            iArr4[k.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr4[k.STOCKS.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[k.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[k.ADVANCED_PORTFOLIO_ANALYTICS.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[k.ADVANCED_WEB_TRADING_TERMINAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[k.EXTENDED_SECURITIES.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr4[k.INCREASED_ORDER_LIMITS.ordinal()] = 7;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[k.DEDICATED_CUSTOMER_SUPPORT.ordinal()] = 8;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[k.NO_MINIMUM_FEES.ordinal()] = 9;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[k.ORDER_BOOK.ordinal()] = 10;
        } catch (NoSuchFieldError unused24) {
        }
        d = iArr4;
        int[] iArr5 = new int[q.values().length];
        try {
            iArr5[q.TRADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr5[q.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused26) {
        }
        e = iArr5;
        int[] iArr6 = new int[o.values().length];
        try {
            iArr6[o.TRADE.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[o.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        f = iArr6;
    }
}
