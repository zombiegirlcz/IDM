package wul;

import dfl.r;
import k4l.o0;
import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f300242c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f300243g;

    static {
        int[] iArr = new int[f8l.b.values().length];
        try {
            iArr[f8l.b.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f8l.b.TO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f300240a = iArr;
        int[] iArr2 = new int[r.values().length];
        try {
            iArr2[r.MONEY_AMOUNT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r.STOCK_QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f300241b = iArr2;
        int[] iArr3 = new int[bfl.g.values().length];
        try {
            iArr3[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f300242c = iArr3;
        int[] iArr4 = new int[r0.values().length];
        try {
            iArr4[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr4[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
        int[] iArr5 = new int[z.values().length];
        try {
            iArr5[z.BOND.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr5[z.STRUCTURED_NOTE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[z.MUTUAL_FUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[z.FUND.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[z.ADR.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[z.CFD.ordinal()] = 6;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[z.COMMODITY.ordinal()] = 7;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[z.ETF.ordinal()] = 8;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[z.ETC.ordinal()] = 9;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[z.ETN.ordinal()] = 10;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[z.EQUITY.ordinal()] = 11;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr5[z.SPAC.ordinal()] = 12;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr5[z.WARRANT.ordinal()] = 13;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr5[z.OPTION.ordinal()] = 14;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr5[z.UNSPECIFIED.ordinal()] = 15;
        } catch (NoSuchFieldError unused25) {
        }
        e = iArr5;
        int[] iArr6 = new int[o0.values().length];
        try {
            iArr6[o0.PARTIALLY_FILLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr6[o0.RECEIVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr6[o0.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused28) {
        }
        f = iArr6;
        int[] iArr7 = new int[f8l.e.values().length];
        try {
            iArr7[f8l.e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr7[f8l.e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr7[f8l.e.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr7[f8l.e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused32) {
        }
        f300243g = iArr7;
    }
}
