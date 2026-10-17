package tx0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f275251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f275252b;

    static {
        int[] iArr = new int[u3.values().length];
        try {
            iArr[u3.AUTOMATIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u3.COLLAPSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u3.ALWAYS_VISIBLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f275251a = iArr;
        int[] iArr2 = new int[t3.values().length];
        try {
            iArr2[t3.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[t3.PROFILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[t3.TWO_LINES.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f275252b = iArr2;
    }
}
