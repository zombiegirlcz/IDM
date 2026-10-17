package sp0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f264868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f264869b;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f264868a = iArr;
        int[] iArr2 = new int[h.values().length];
        try {
            iArr2[h.GIF.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[h.QUANTITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[h.INLINE.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f264869b = iArr2;
    }
}
