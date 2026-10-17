package tuc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f274587b;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.LINKED_MERCHANTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.LINKED_WALLETS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274586a = iArr;
        int[] iArr2 = new int[qtc.f.values().length];
        try {
            iArr2[qtc.f.ANDROID_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[qtc.f.APPLE_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[qtc.f.FITBIT_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qtc.f.GARMIN_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qtc.f.SAMSUNG_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[qtc.f.CLICK_TO_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        f274587b = iArr2;
    }
}
