package rob;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f255966b;

    static {
        int[] iArr = new int[jjb.c.values().length];
        try {
            iArr[jjb.c.REJECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jjb.c.UNDER_REVIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[jjb.c.PAUSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[jjb.c.NORMAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f255965a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.WITHDRAW.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[i.TOP_UP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[i.DETAILS.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f255966b = iArr2;
    }
}
