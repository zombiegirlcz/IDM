package hma;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f153616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f153617b;

    static {
        int[] iArr = new int[soa.c.values().length];
        try {
            iArr[soa.c.MARKETING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[soa.c.PERSONALIZED_THIRD_PARTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[soa.c.REVOLUT_PAY_DELIVERY_TRACKING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[soa.c.REVOLUT_PAY_FLIGHT_TRACKING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f153616a = iArr;
        int[] iArr2 = new int[qla.a.values().length];
        try {
            iArr2[qla.a.FULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[qla.a.INDIA.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[qla.a.REVOLUT_X.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f153617b = iArr2;
    }
}
