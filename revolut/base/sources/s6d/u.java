package s6d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260257a;

    static {
        int[] iArr = new int[k6d.e.values().length];
        try {
            iArr[k6d.e.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k6d.e.ARCHIVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f260257a = iArr;
    }
}
