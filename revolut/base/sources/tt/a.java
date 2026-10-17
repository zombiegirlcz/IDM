package tt;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f274179b;

    static {
        int[] iArr = new int[nq.c.values().length];
        try {
            iArr[nq.c.TILT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nq.c.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274178a = iArr;
        int[] iArr2 = new int[nq.e.values().length];
        try {
            iArr2[nq.e.ONFIDO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        f274179b = iArr2;
    }
}
