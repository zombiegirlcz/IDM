package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class vy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f166906a;

    static {
        int[] iArr = new int[ry.values().length];
        try {
            iArr[ry.LARGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ry.COMPACT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ry.COMPACT_NO_PADDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ry.DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f166906a = iArr;
    }
}
