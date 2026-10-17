package tt;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f274182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f274183b;

    static {
        int[] iArr = new int[nq.c.values().length];
        try {
            iArr[nq.c.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[nq.c.TILT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f274182a = iArr;
        int[] iArr2 = new int[nq.b.values().length];
        try {
            iArr2[nq.b.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[nq.b.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f274183b = iArr2;
    }
}
