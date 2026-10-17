package m98;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f203668b;

    static {
        int[] iArr = new int[jc8.c.values().length];
        try {
            iArr[jc8.c.VIRTUAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[jc8.c.PHYSICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f203667a = iArr;
        int[] iArr2 = new int[c90.b.values().length];
        try {
            iArr2[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c90.b.XXHDPI.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[c90.b.XXXHDPI.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        f203668b = iArr2;
    }
}
