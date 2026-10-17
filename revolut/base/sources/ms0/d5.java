package ms0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f208230b;

    static {
        int[] iArr = new int[c5.values().length];
        try {
            iArr[c5.ACCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c5.PRIMARY_WHITE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c5.PRIMARY_BLACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f208229a = iArr;
        int[] iArr2 = new int[b5.values().length];
        try {
            iArr2[b5.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[b5.PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[b5.LOADING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f208230b = iArr2;
    }
}
