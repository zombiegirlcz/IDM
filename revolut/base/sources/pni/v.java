package pni;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f237824a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.REQUEST_ANOTHER_METHOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.RESEND_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.SELECT_ANOTHER_METHOD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f237824a = iArr;
    }
}
