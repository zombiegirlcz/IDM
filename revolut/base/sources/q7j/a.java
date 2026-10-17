package q7j;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f242861a;

    static {
        int[] iArr = new int[o7j.b.values().length];
        try {
            iArr[o7j.b.PRICE_CLOSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o7j.b.PRICE_SHOULD_BE_LOWER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o7j.b.PRICE_SHOULD_BE_HIGHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f242861a = iArr;
    }
}
