package m3b;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f202320a;

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
            iArr[l3b.a.SIX_MONTHS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[l3b.a.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[l3b.a.NEVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f202320a = iArr;
    }
}
