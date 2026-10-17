package r7a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f252058a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.ALLOWED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.DENIED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.EXPLANATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f252058a = iArr;
    }
}
