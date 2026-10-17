package x8h;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303347b;

    static {
        int[] iArr = new int[a0h.a.values().length];
        try {
            iArr[a0h.a.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a0h.a.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a0h.a.COMMODITIES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a0h.a.STOCKS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f303346a = iArr;
        int[] iArr2 = new int[xzg.q.values().length];
        try {
            iArr2[xzg.q.SECURITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[xzg.q.CRYPTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[xzg.q.COMMODITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f303347b = iArr2;
    }
}
