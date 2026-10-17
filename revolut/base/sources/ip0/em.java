package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class em {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f164122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f164123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f164124c;

    static {
        int[] iArr = new int[am.values().length];
        try {
            iArr[am.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[am.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[am.AUTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f164122a = iArr;
        int[] iArr2 = new int[aw0.v1.values().length];
        try {
            iArr2[aw0.v1.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[aw0.v1.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f164123b = iArr2;
        int[] iArr3 = new int[cm.values().length];
        try {
            iArr3[cm.HERO.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[cm.LARGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f164124c = iArr3;
    }
}
