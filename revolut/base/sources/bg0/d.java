package bg0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f15045a;

    static {
        int[] iArr = new int[gj0.c.values().length];
        try {
            iArr[gj0.c.BRANCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[gj0.c.CONTENT_REF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[gj0.c.DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f15045a = iArr;
    }
}
