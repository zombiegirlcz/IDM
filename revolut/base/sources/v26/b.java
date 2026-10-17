package v26;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f285673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f285674b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.AMOUNT_BELOW_MINIMUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.AMOUNT_ABOVE_MAXIMUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f285673a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.DAILY_USAGE_LIMIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[d.MONTHLY_USAGE_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f285674b = iArr2;
    }
}
