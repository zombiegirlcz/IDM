package kc9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f182677a;

    static {
        int[] iArr = new int[k89.b.values().length];
        try {
            iArr[k89.b.WAITING_FOR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k89.b.PENDING_OTP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k89.b.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k89.b.INVALID_OTP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k89.b.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k89.b.VALIDATING_SIGNATURE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f182677a = iArr;
    }
}
