package hp5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f154478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f154479b;

    static {
        int[] iArr = new int[ko5.c.values().length];
        try {
            iArr[ko5.c.FAILED_SCREENING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ko5.c.SCREENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f154478a = iArr;
        int[] iArr2 = new int[ho5.a.values().length];
        try {
            iArr2[ho5.a.BLOCKCHAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ho5.a.ADDRESS_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ho5.a.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f154479b = iArr2;
    }
}
