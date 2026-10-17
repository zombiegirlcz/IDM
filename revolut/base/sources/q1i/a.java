package q1i;

import r1i.h;
import wd6.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f241443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f241444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f241445c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[wd6.e.values().length];
        try {
            iArr[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f241443a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[i.MERCHANT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i.TRADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f241444b = iArr2;
        int[] iArr3 = new int[r1i.e.values().length];
        try {
            iArr3[r1i.e.EXCEEDED_BALANCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[r1i.e.AMOUNT_TOO_SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[r1i.e.STOP_PRICE_NEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[r1i.e.LIMIT_PRICE_NEEDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[r1i.e.ESTIMATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[r1i.e.EXCEEDED_CRYPTO_LIMIT.ordinal()] = 6;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[r1i.e.FAILED_CRYPTO_LOWER_LIMIT.ordinal()] = 7;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr3[r1i.e.FAILED_COMMODITY_LOWER_LIMIT.ordinal()] = 8;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr3[r1i.e.BRL_USAGE_LIMIT_EXCEEDED.ordinal()] = 9;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[r1i.e.BRL_UPPER_LIMIT_EXCEEDED.ordinal()] = 10;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[r1i.e.BRL_LOWER_LIMIT_EXCEEDED.ordinal()] = 11;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[r1i.e.NOT_DEALABLE_CURRENCIES.ordinal()] = 12;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[r1i.e.MX_BALANCE_LIMIT_EXCEEDED.ordinal()] = 13;
        } catch (NoSuchFieldError unused18) {
        }
        f241445c = iArr3;
        int[] iArr4 = new int[r1i.b.values().length];
        try {
            iArr4[r1i.b.COST.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr4[r1i.b.CREDIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        d = iArr4;
        int[] iArr5 = new int[h.values().length];
        try {
            iArr5[h.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[h.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        e = iArr5;
    }
}
