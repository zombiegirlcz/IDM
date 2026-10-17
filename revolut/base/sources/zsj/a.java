package zsj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f324940c;

    static {
        int[] iArr = new int[hzi.b.values().length];
        try {
            iArr[hzi.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hzi.b.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324938a = iArr;
        int[] iArr2 = new int[hzi.c.values().length];
        try {
            iArr2[hzi.c.ONE_TIME.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hzi.c.RECURRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f324939b = iArr2;
        int[] iArr3 = new int[hzi.a.values().length];
        try {
            iArr3[hzi.a.MANUALLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[hzi.a.AUTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f324940c = iArr3;
    }
}
