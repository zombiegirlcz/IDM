package s87;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260927a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.GDP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.INFLATION_RATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.INTEREST_RATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.RETAIL_SALES.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.UNEMPLOYMENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e.CONSUMER_CONFIDENCE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f260927a = iArr;
    }
}
