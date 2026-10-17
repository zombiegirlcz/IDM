package cu;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108703a;

    static {
        int[] iArr = new int[yt.a.values().length];
        try {
            iArr[yt.a.PASSPORT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[yt.a.IDENTITY_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[yt.a.RESIDENCE_PERMIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f108703a = iArr;
    }
}
