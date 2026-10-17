package j0g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f170029a;

    static {
        int[] iArr = new int[iyf.c.values().length];
        try {
            iArr[iyf.c.CONFIRMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[iyf.c.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[iyf.c.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[iyf.c.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f170029a = iArr;
    }
}
