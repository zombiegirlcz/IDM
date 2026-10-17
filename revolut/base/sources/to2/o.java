package to2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f272508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f272509b;

    static {
        int[] iArr = new int[vo2.a.values().length];
        try {
            iArr[vo2.a.PENDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vo2.a.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vo2.a.ACTION_NEEDED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vo2.a.DONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vo2.a.FAILED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f272508a = iArr;
        int[] iArr2 = new int[mn2.a.values().length];
        try {
            iArr2[mn2.a.OVERSTAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[mn2.a.CASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[mn2.a.MOBILITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        f272509b = iArr2;
    }
}
