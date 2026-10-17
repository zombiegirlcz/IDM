package lc0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f193777a;

    static {
        int[] iArr = new int[n.values().length];
        try {
            iArr[n.CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n.SELFIE_WITH_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n.SELFIE_AND_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f193777a = iArr;
    }
}
