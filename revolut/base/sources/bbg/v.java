package bbg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f14303a;

    static {
        int[] iArr = new int[rei.h.values().length];
        try {
            iArr[rei.h.WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rei.h.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f14303a = iArr;
    }
}
