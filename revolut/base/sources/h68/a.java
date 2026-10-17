package h68;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f149604a;

    static {
        int[] iArr = new int[bj0.b.values().length];
        try {
            iArr[bj0.b.MALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bj0.b.FEMALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f149604a = iArr;
        int[] iArr2 = new int[kf8.b.values().length];
        try {
            iArr2[kf8.b.PARENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[kf8.b.LEGAL_GUARDIAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
