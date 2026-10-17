package udj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f279225a;

    static {
        int[] iArr = new int[asi.c.values().length];
        try {
            iArr[asi.c.SCOPED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[asi.c.UNAUTHORIZED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[asi.c.EXPIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[asi.c.EXIST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[asi.c.ABSENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f279225a = iArr;
    }
}
