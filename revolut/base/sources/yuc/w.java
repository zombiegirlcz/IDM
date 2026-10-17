package yuc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f317000a;

    static {
        int[] iArr = new int[qtc.f.values().length];
        try {
            iArr[qtc.f.CLICK_TO_PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qtc.f.ANDROID_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qtc.f.APPLE_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qtc.f.FITBIT_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qtc.f.GARMIN_PAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[qtc.f.SAMSUNG_PAY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f317000a = iArr;
    }
}
