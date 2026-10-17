package do2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f116385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f116386b;

    static {
        int[] iArr = new int[mn2.a.values().length];
        try {
            iArr[mn2.a.OVERSTAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[mn2.a.CASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[mn2.a.MOBILITY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f116385a = iArr;
        int[] iArr2 = new int[fo2.o.values().length];
        try {
            iArr2[fo2.o.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[fo2.o.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f116386b = iArr2;
    }
}
