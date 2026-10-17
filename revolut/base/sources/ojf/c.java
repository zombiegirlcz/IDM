package ojf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f225769a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.AFTER_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.BEFORE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f225769a = iArr;
    }
}
