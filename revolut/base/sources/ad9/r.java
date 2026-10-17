package ad9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3307a;

    static {
        int[] iArr = new int[b99.b.values().length];
        try {
            iArr[b99.b.OCCUPATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b99.b.PLACE_OF_BIRTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b99.b.QES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b99.b.TERMS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f3307a = iArr;
    }
}
