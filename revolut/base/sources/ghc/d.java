package ghc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f143901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f143902b;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.OPEN_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.COPY_AND_OPEN_URL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b.SUBSCRIBE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[b.CANCEL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[b.BOTTOM_SHEET.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f143901a = iArr;
        int[] iArr2 = new int[a.values().length];
        try {
            iArr2[a.OPEN_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[a.COPY_AND_OPEN_URL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f143902b = iArr2;
    }
}
