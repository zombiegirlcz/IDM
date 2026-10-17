package p62;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f233208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f233209b;

    static {
        int[] iArr = new int[zz1.b.values().length];
        try {
            iArr[zz1.b.SEND_ONLY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[zz1.b.FULL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f233208a = iArr;
        int[] iArr2 = new int[zz1.e.values().length];
        try {
            iArr2[zz1.e.COMPLETED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[zz1.e.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[zz1.e.PROCESSING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zz1.e.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f233209b = iArr2;
    }
}
