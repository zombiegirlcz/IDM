package mx0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f209996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f209997c;

    static {
        int[] iArr = new int[n8.values().length];
        try {
            iArr[n8.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n8.SECURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f209995a = iArr;
        int[] iArr2 = new int[r8.values().length];
        try {
            iArr2[r8.VOLUMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[r8.REGULAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[r8.REGULAR_FULLSCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f209996b = iArr2;
        int[] iArr3 = new int[aw0.v1.values().length];
        try {
            iArr3[aw0.v1.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[aw0.v1.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f209997c = iArr3;
    }
}
