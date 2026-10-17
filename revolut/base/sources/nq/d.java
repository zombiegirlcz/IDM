package nq;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f218285b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.FRONT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.BACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f218284a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.TILT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c.NORMAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f218285b = iArr2;
    }
}
