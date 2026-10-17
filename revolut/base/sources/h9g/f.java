package h9g;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f150252a;

    static {
        int[] iArr = new int[cgi.d.values().length];
        try {
            iArr[cgi.d.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[cgi.d.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f150252a = iArr;
    }
}
