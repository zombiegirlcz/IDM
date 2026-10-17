package ry5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f258235a;

    static {
        int[] iArr = new int[ce9.n.values().length];
        try {
            iArr[ce9.n.REFRESH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ce9.n.FORCE_REFRESH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ce9.n.LOAD_NEXT_PAGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ce9.n.RETRY_LAST_PAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f258235a = iArr;
    }
}
