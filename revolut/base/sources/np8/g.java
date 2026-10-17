package np8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f218164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f218165b;

    static {
        int[] iArr = new int[dp8.d.values().length];
        try {
            iArr[dp8.d.ONE_OFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[dp8.d.DAILY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[dp8.d.WEEKLY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[dp8.d.MONTHLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f218164a = iArr;
        int[] iArr2 = new int[c.values().length];
        try {
            iArr2[c.Edit.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c.Create.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f218165b = iArr2;
    }
}
