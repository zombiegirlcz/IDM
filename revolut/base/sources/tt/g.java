package tt;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f274186b;

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
        f274185a = iArr;
        int[] iArr2 = new int[nq.b.values().length];
        try {
            iArr2[nq.b.BACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nq.b.FRONT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f274186b = iArr2;
    }
}
