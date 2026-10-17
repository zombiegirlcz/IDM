package wo2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f298877b;

    static {
        int[] iArr = new int[yo2.g.values().length];
        try {
            iArr[yo2.g.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yo2.g.IN_PROGRESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yo2.g.TODO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f298876a = iArr;
        int[] iArr2 = new int[yo2.e.values().length];
        try {
            iArr2[yo2.e.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yo2.e.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yo2.e.SUCCESS.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[yo2.e.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[yo2.e.WARNING.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f298877b = iArr2;
    }
}
