package du2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f117540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f117541b;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.REVOLUT_CALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.NOT_REVOLUT_CALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f117540a = iArr;
        int[] iArr2 = new int[f.values().length];
        try {
            iArr2[f.SHOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[f.HIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f117541b = iArr2;
    }
}
