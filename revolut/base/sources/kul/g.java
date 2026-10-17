package kul;

import k4l.r0;
import nel.z;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f189856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f189857c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[com.revolut.shared.feature.market_data.models.domain.models.a.values().length];
        try {
            iArr[com.revolut.shared.feature.market_data.models.domain.models.a.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.shared.feature.market_data.models.domain.models.a.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f189855a = iArr;
        int[] iArr2 = new int[z.values().length];
        try {
            iArr2[z.FUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[z.MUTUAL_FUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f189856b = iArr2;
        int[] iArr3 = new int[f8l.e.values().length];
        try {
            iArr3[f8l.e.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[f8l.e.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[f8l.e.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[f8l.e.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f189857c = iArr3;
        int[] iArr4 = new int[bfl.g.values().length];
        try {
            iArr4[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
        int[] iArr5 = new int[hel.b.values().length];
        try {
            iArr5[hel.b.GB.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr5[hel.b.EEA.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[hel.b.MX.ordinal()] = 3;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[hel.b.BR.ordinal()] = 4;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[hel.b.SG.ordinal()] = 5;
        } catch (NoSuchFieldError unused15) {
        }
        e = iArr5;
        int[] iArr6 = new int[r0.values().length];
        try {
            iArr6[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr6[r0.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr6[r0.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr6[r0.RECURRING.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        f = iArr6;
    }
}
