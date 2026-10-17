package ma;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203854a;

    static {
        int[] iArr = new int[fa.l.values().length];
        try {
            iArr[fa.l.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fa.l.COMPLETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fa.l.IN_REVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f203854a = iArr;
    }
}
