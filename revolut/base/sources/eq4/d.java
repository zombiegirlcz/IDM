package eq4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128241a;

    static {
        int[] iArr = new int[tl4.b.values().length];
        try {
            iArr[tl4.b.WITHDRAWAL_NOTICE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tl4.b.CONFIRM_WITHDRAWAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tl4.b.QUIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tl4.b.EXIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f128241a = iArr;
    }
}
