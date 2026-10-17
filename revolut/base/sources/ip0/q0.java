package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f165906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f165907b;

    static {
        int[] iArr = new int[l0.values().length];
        try {
            iArr[l0.TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l0.BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[k0.values().length];
        try {
            iArr2[k0.BOTTOM.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[k0.TOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[k0.TOP_BOTTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        f165906a = iArr2;
        int[] iArr3 = new int[bw0.n.values().length];
        try {
            iArr3[bw0.n.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[bw0.n.END.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f165907b = iArr3;
    }
}
