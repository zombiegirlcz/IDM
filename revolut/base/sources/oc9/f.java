package oc9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f224145b;

    static {
        int[] iArr = new int[k89.b.values().length];
        try {
            iArr[k89.b.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k89.b.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k89.b.INVALID_OTP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[k89.b.PENDING_OTP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[k89.b.VALIDATING_SIGNATURE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[k89.b.WAITING_FOR_CODE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f224144a = iArr;
        int[] iArr2 = new int[y89.d.values().length];
        try {
            iArr2[y89.d.CROSS.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[y89.d.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[y89.d.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        f224145b = iArr2;
    }
}
