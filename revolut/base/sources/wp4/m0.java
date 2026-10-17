package wp4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f299078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f299079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f299080c;

    static {
        int[] iArr = new int[nb5.e.values().length];
        try {
            iArr[nb5.e.REVOLUT_POCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nb5.e.DIRECT_DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f299078a = iArr;
        int[] iArr2 = new int[nb5.d.values().length];
        try {
            iArr2[nb5.d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nb5.d.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f299079b = iArr2;
        int[] iArr3 = new int[nb5.b.values().length];
        try {
            iArr3[nb5.b.FIXED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[nb5.b.DUE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f299080c = iArr3;
    }
}
