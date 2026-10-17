package g0a;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f139379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f139380b;

    static {
        int[] iArr = new int[cu9.f.values().length];
        try {
            iArr[cu9.f.CLAIM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cu9.f.REJECT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[cu9.f.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f139379a = iArr;
        int[] iArr2 = new int[i.values().length];
        try {
            iArr2[i.REJECT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[i.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f139380b = iArr2;
    }
}
