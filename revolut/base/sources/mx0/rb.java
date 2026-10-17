package mx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209978a;

    static {
        int[] iArr = new int[qb.values().length];
        try {
            iArr[qb.DETECTING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qb.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qb.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f209978a = iArr;
    }
}
