package mra;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208093a;

    static {
        int[] iArr = new int[fqa.a.values().length];
        try {
            iArr[fqa.a.MANUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fqa.a.CAMERA.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fqa.a.NFC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f208093a = iArr;
    }
}
