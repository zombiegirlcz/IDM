package sy6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f266626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f266627b;

    static {
        int[] iArr = new int[sr6.a.values().length];
        try {
            iArr[sr6.a.TODAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[sr6.a.FIRST_DAY_OF_CURRENT_MONTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[sr6.a.FIRST_DAY_OF_NEXT_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f266626a = iArr;
        int[] iArr2 = new int[sr6.b.values().length];
        try {
            iArr2[sr6.b.ZERO_DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        f266627b = iArr2;
    }
}
