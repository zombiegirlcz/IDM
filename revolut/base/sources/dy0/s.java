package dy0;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f121021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f121022b;

    static {
        int[] iArr = new int[r.values().length];
        try {
            iArr[r.SHOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[r.HIDDEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f121021a = iArr;
        int[] iArr2 = new int[o.values().length];
        try {
            iArr2[o.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[o.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[o.LEFT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f121022b = iArr2;
    }
}
