package hib;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152589a;

    static {
        int[] iArr = new int[fib.j.values().length];
        try {
            iArr[fib.j.IN_PROGRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fib.j.VERIFIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f152589a = iArr;
    }
}
