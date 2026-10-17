package eoi;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f127955a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.ALL_SHIMMERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.EMPTY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.FULL_DATA.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.DATA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f127955a = iArr;
    }
}
