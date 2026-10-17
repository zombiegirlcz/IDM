package t2e;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f267559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f267560b;

    static {
        int[] iArr = new int[t1e.b.values().length];
        try {
            iArr[t1e.b.ACTIVATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[t1e.b.NOT_ACTIVATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[t1e.b.NOT_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[t1e.b.PENDING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[t1e.b.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f267559a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.ONLINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[f.IN_STORE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[f.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f267560b = iArr2;
    }
}
