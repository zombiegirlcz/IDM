package vb8;

import nb8.e;
import nb8.f;
import wb8.k;
import wb8.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f287446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f287447c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;
    public static final /* synthetic */ int[] f;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f287445a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.P1D.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k.P7D.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k.P1W.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[k.P2W.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[k.P14D.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[k.P1M.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[k.P1Y.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        f287446b = iArr2;
        int[] iArr3 = new int[wb8.a.values().length];
        try {
            iArr3[wb8.a.STANDING_ORDER_INSUFFICIENT_FUNDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[wb8.a.STANDING_ORDER_TOPUP_LIMIT_EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        f287447c = iArr3;
        int[] iArr4 = new int[f.values().length];
        try {
            iArr4[f.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[f.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
        int[] iArr5 = new int[e.values().length];
        try {
            iArr5[e.P1D.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr5[e.P7D.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr5[e.P1W.ordinal()] = 3;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr5[e.P2W.ordinal()] = 4;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr5[e.P14D.ordinal()] = 5;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr5[e.P1M.ordinal()] = 6;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr5[e.P1Y.ordinal()] = 7;
        } catch (NoSuchFieldError unused20) {
        }
        e = iArr5;
        int[] iArr6 = new int[nb8.a.values().length];
        try {
            iArr6[nb8.a.STANDING_ORDER_INSUFFICIENT_FUNDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr6[nb8.a.STANDING_ORDER_TOPUP_LIMIT_EXCEEDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        f = iArr6;
    }
}
