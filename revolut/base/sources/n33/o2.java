package n33;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f211778c;

    static {
        int[] iArr = new int[zn3.a.values().length];
        try {
            iArr[zn3.a.ONBOARDING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f211776a = iArr;
        int[] iArr2 = new int[e13.a.values().length];
        try {
            iArr2[e13.a.DISPOSABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[e13.a.PHYSICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e13.a.VIRTUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused4) {
        }
        f211777b = iArr2;
        int[] iArr3 = new int[kc8.a.values().length];
        try {
            iArr3[kc8.a.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[kc8.a.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f211778c = iArr3;
    }
}
