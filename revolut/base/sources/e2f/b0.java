package e2f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f122056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f122057b;

    static {
        int[] iArr = new int[u2f.l.values().length];
        try {
            iArr[u2f.l.PARTNER_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u2f.l.REV_PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u2f.l.GIFT_CARDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u2f.l.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f122056a = iArr;
        int[] iArr2 = new int[u2f.b.values().length];
        try {
            iArr2[u2f.b.TAX_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        f122057b = iArr2;
    }
}
