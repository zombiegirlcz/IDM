package t73;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f268502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f268503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f268504c;

    static {
        int[] iArr = new int[q63.d.values().length];
        try {
            iArr[q63.d.REPLACE_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        f268502a = iArr;
        int[] iArr2 = new int[o1.values().length];
        try {
            iArr2[o1.ACTIVATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr2[o1.UNBLOCK.ordinal()] = 2;
        } catch (NoSuchFieldError unused3) {
        }
        f268503b = iArr2;
        int[] iArr3 = new int[c90.b.values().length];
        try {
            iArr3[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr3[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[c90.b.XXHDPI.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[c90.b.XXXHDPI.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f268504c = iArr3;
    }
}
