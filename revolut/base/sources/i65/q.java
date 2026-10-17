package i65;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158871a;

    static {
        int[] iArr = new int[z45.a.values().length];
        try {
            iArr[z45.a.CONFIRM_WITHDRAWAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[z45.a.KEEP_LOAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[z45.a.CLOSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f158871a = iArr;
    }
}
