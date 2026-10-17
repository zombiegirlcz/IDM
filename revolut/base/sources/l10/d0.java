package l10;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f191372b;

    static {
        int[] iArr = new int[n10.b.values().length];
        try {
            iArr[n10.b.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n10.b.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n10.b.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f191371a = iArr;
        int[] iArr2 = new int[c90.b.values().length];
        try {
            iArr2[c90.b.MDPI.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[c90.b.HDPI.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[c90.b.XHDPI.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f191372b = iArr2;
    }
}
