package uwb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f283608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f283609b;

    static {
        int[] iArr = new int[tvb.g.values().length];
        try {
            iArr[tvb.g.CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[tvb.g.CODE_AND_PIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[tvb.g.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f283608a = iArr;
        int[] iArr2 = new int[tvb.f.values().length];
        try {
            iArr2[tvb.f.C39.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[tvb.f.C128A.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[tvb.f.C128B.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[tvb.f.EAN13.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[tvb.f.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f283609b = iArr2;
    }
}
