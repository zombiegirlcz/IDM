package w4k;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f294618a;

    static {
        int[] iArr = new int[bgf.c.values().length];
        try {
            iArr[bgf.c.WARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bgf.c.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bgf.c.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f294618a = iArr;
    }
}
