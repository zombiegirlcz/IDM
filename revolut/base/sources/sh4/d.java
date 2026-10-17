package sh4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f263426a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.CONNECTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.ENCRYPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.OTP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.AUTHENTICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f263426a = iArr;
    }
}
