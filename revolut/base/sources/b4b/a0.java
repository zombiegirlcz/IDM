package b4b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f12209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f12210b;

    static {
        int[] iArr = new int[l3b.a.values().length];
        try {
            iArr[l3b.a.NINETY_DAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l3b.a.TODAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l3b.a.CUSTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l3b.a.SIX_MONTHS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l3b.a.NEVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f12209a = iArr;
        int[] iArr2 = new int[e2b.a.values().length];
        try {
            iArr2[e2b.a.MARKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[e2b.a.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[e2b.a.LIMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f12210b = iArr2;
    }
}
