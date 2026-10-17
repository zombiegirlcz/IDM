package om4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f226653a;

    static {
        int[] iArr = new int[ql4.v.values().length];
        try {
            iArr[ql4.v.POST_PURCHASE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ql4.v.STATEMENT_DEFERRAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ql4.v.PRE_PURCHASE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f226653a = iArr;
    }
}
