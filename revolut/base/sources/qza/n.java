package qza;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f250468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f250469c;

    static {
        int[] iArr = new int[mza.a.values().length];
        try {
            iArr[mza.a.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mza.a.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f250467a = iArr;
        int[] iArr2 = new int[mza.b.values().length];
        try {
            iArr2[mza.b.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[mza.b.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f250468b = iArr2;
        int[] iArr3 = new int[tza.a.values().length];
        try {
            iArr3[tza.a.WHITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[tza.a.BLACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f250469c = iArr3;
    }
}
