package ah1;

import h93.q0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f4862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f4863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f4864c;

    static {
        int[] iArr = new int[q0.values().length];
        try {
            iArr[q0.ANDROID_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q0.APPLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q0.SAMSUNG_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f4862a = iArr;
        int[] iArr2 = new int[jg1.g.values().length];
        try {
            iArr2[jg1.g.GOOGLE_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[jg1.g.APPLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[jg1.g.SAMSUNG_WALLET.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f4863b = iArr2;
        int[] iArr3 = new int[c90.b.values().length];
        try {
            iArr3[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[c90.b.XXHDPI.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[c90.b.XXXHDPI.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        f4864c = iArr3;
    }
}
