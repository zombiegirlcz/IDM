package zs2;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f324801b;

    static {
        int[] iArr = new int[il3.a.values().length];
        try {
            iArr[il3.a.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[il3.a.PHONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324800a = iArr;
        int[] iArr2 = new int[su.b.values().length];
        try {
            iArr2[su.b.TOAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[su.b.CONFETTI.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f324801b = iArr2;
    }
}
