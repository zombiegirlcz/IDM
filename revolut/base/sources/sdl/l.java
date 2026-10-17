package sdl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f261979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f261980b;

    static {
        int[] iArr = new int[cfl.a.values().length];
        try {
            iArr[cfl.a.DEPENDANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cfl.a.SELF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f261979a = iArr;
        int[] iArr2 = new int[e.values().length];
        try {
            iArr2[e.DEPENDANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[e.SELF.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f261980b = iArr2;
    }
}
