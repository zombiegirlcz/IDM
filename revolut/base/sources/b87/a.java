package b87;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f13113a;

    static {
        int[] iArr = new int[fel.a.values().length];
        try {
            iArr[fel.a.COMMODITY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fel.a.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fel.a.CRYPTO.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fel.a.INDEX.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[fel.a.FIAT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f13113a = iArr;
    }
}
