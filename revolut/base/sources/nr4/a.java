package nr4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218527a;

    static {
        int[] iArr = new int[yw4.a.values().length];
        try {
            iArr[yw4.a.SPENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yw4.a.AVAILABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yw4.a.STATEMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[yw4.a.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[yw4.a.UNSELECTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f218527a = iArr;
    }
}
