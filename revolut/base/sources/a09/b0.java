package a09;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247a;

    static {
        int[] iArr = new int[k0.values().length];
        try {
            iArr[k0.LOCAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k0.NETWORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k0.BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f247a = iArr;
    }
}
