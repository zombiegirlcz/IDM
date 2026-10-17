package msb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208653a;

    static {
        int[] iArr = new int[tjg.e.values().length];
        try {
            iArr[tjg.e.PUSH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tjg.e.SESSION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tjg.e.SMS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tjg.e.EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tjg.e.CALL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[tjg.e.PASSCODE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f208653a = iArr;
    }
}
