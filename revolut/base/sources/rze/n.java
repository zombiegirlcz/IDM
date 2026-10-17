package rze;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258605a;

    static {
        int[] iArr = new int[e7l.a.values().length];
        try {
            iArr[e7l.a.OAUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e7l.a.DIRECT_LINK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e7l.a.OAUTH_ONCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f258605a = iArr;
    }
}
