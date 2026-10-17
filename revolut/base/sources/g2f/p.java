package g2f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f140050b;

    static {
        int[] iArr = new int[u2f.k.values().length];
        try {
            iArr[u2f.k.MILES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u2f.k.AVIOS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f140049a = iArr;
        int[] iArr2 = new int[u2f.l.values().length];
        try {
            iArr2[u2f.l.PARTNER_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[u2f.l.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[u2f.l.REV_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[u2f.l.GIFT_CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f140050b = iArr2;
    }
}
