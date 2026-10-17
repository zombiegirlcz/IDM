package l4b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f192080a;

    static {
        int[] iArr = new int[e2b.a.values().length];
        try {
            iArr[e2b.a.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e2b.a.LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e2b.a.STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f192080a = iArr;
    }
}
