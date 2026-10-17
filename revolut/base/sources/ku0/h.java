package ku0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f189589a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.NEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.PREVIOUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.NO_ANIMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.SCROLLED_TO_TOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.SCROLLED_TO_BOTTOM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[d.SCROLLED_TO_OFFSET.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f189589a = iArr2;
    }
}
