package zsd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324890a;

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
        f324890a = iArr;
    }
}
