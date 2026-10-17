package mwc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f209422a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.ACCEPTABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f209422a = iArr;
    }
}
