package g2f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f140043a;

    static {
        int[] iArr = new int[u2f.l.values().length];
        try {
            iArr[u2f.l.PARTNER_POINTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u2f.l.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u2f.l.REV_PAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u2f.l.GIFT_CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f140043a = iArr;
    }
}
