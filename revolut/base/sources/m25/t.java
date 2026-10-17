package m25;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f201717b;

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
        f201716a = iArr;
        int[] iArr2 = new int[yw4.c.values().length];
        try {
            iArr2[yw4.c.WITHDRAWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yw4.c.CANCELLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f201717b = iArr2;
    }
}
