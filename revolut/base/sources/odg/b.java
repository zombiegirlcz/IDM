package odg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224465a;

    static {
        int[] iArr = new int[vei.a.values().length];
        try {
            iArr[vei.a.STANDARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[vei.a.PLUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[vei.a.PREMIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[vei.a.METAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[vei.a.ULTRA.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f224465a = iArr;
    }
}
