package dej;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f113586a;

    static {
        int[] iArr = new int[n1.values().length];
        try {
            iArr[n1.SYSTEM_API_ACTIVATION_CODE_ICCID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n1.SYSTEM_API_ACTIVATION_CODE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n1.INSTALLATION_LINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[n1.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f113586a = iArr;
    }
}
