package i2l;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f158011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f158012b;

    static {
        int[] iArr = new int[a2l.q.values().length];
        try {
            iArr[a2l.q.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a2l.q.ACTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a2l.q.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f158011a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[a.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f158012b = iArr2;
    }
}
