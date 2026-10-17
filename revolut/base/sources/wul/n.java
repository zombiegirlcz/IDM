package wul;

import k4l.q0;
import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f300246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f300247c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int[] f300248g;

    static {
        int[] iArr = new int[z.values().length];
        try {
            iArr[z.ADR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z.BOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[z.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[z.ETF.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[z.ETC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[z.ETN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[z.EQUITY.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[z.SPAC.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[z.WARRANT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[z.OPTION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[z.UNSPECIFIED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[z.STRUCTURED_NOTE.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[z.FUND.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[z.MUTUAL_FUND.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        f300245a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        f300246b = iArr2;
        int[] iArr3 = new int[r0.values().length];
        try {
            iArr3[r0.LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[r0.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[r0.MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr3[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused21) {
        }
        f300247c = iArr3;
        int[] iArr4 = new int[q0.values().length];
        try {
            iArr4[q0.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[q0.GTC.ordinal()] = 2;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[q0.GOOD_TIL_EXT_MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[q0.MARKET_ON_OPEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused25) {
        }
        d = iArr4;
        int[] iArr5 = new int[cfl.j.values().length];
        try {
            iArr5[cfl.j.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr5[cfl.j.YOUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr5[cfl.j.PERSONAL_JOINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused28) {
        }
        e = iArr5;
        int[] iArr6 = new int[k4l.e.values().length];
        try {
            iArr6[k4l.e.JISA.ordinal()] = 1;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr6[k4l.e.ISA.ordinal()] = 2;
        } catch (NoSuchFieldError unused30) {
        }
        f = iArr6;
        int[] iArr7 = new int[sel.a.values().length];
        try {
            iArr7[sel.a.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr7[sel.a.WEEKLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr7[sel.a.MONTHLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused33) {
        }
        f300248g = iArr7;
    }
}
