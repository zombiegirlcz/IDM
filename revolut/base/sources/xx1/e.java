package xx1;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f309385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f309386b;

    static {
        int[] iArr = new int[wx1.a.values().length];
        f309386b = iArr;
        try {
            iArr[wx1.a.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f309386b[wx1.a.BUSINESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[wx1.b.values().length];
        f309385a = iArr2;
        try {
            iArr2[wx1.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f309385a[wx1.b.DELETED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
