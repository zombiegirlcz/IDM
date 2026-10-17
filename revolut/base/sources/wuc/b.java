package wuc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f300102a;

    static {
        int[] iArr = new int[qtc.b.values().length];
        try {
            iArr[qtc.b.PHONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qtc.b.TABLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qtc.b.MOBILEPHONE_OR_TABLET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[qtc.b.PC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[qtc.b.WATCH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[qtc.b.HOUSEHOLD_DEVICE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[qtc.b.WEARABLE_DEVICE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[qtc.b.AUTOMOBILE_DEVICE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[qtc.b.UNKNOWN.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        f300102a = iArr;
    }
}
