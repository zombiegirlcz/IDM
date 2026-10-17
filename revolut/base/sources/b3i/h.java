package b3i;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f12038c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[wd6.h.values().length];
        try {
            iArr[wd6.h.STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.h.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wd6.h.MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f12036a = iArr;
        int[] iArr2 = new int[c3i.a.values().length];
        try {
            iArr2[c3i.a.PRECISE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c3i.a.ESTIMATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f12037b = iArr2;
        int[] iArr3 = new int[f8l.c.values().length];
        try {
            iArr3[f8l.c.CRYPTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[f8l.c.COMMODITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[f8l.c.FIAT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[f8l.c.SECURITY.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[f8l.c.UNDEFINED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        f12038c = iArr3;
        int[] iArr4 = new int[wd6.e.values().length];
        try {
            iArr4[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
    }
}
