package fqe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137251a;

    static {
        int[] iArr = new int[tqe.a.values().length];
        try {
            iArr[tqe.a.PASSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tqe.a.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tqe.a.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[tqe.a.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[tqe.a.PENDING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f137251a = iArr;
    }
}
