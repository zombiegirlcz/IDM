package bbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14231a;

    static {
        int[] iArr = new int[tjg.e.values().length];
        try {
            iArr[tjg.e.PASSCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tjg.e.SMS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tjg.e.CALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tjg.e.EMAIL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f14231a = iArr;
    }
}
