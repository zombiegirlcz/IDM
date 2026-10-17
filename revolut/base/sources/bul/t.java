package bul;

import k4l.r0;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f18916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f18917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f18918c;

    static {
        int[] iArr = new int[aul.b.values().length];
        try {
            iArr[aul.b.FIAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[aul.b.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f18916a = iArr;
        int[] iArr2 = new int[bfl.g.values().length];
        try {
            iArr2[bfl.g.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[bfl.g.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f18917b = iArr2;
        int[] iArr3 = new int[r0.values().length];
        try {
            iArr3[r0.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[r0.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[r0.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[r0.STOP.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f18918c = iArr3;
    }
}
