package fs0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f137534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f137535b;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f137534a = iArr;
        int[] iArr2 = new int[n.values().length];
        try {
            iArr2[n.AWAITING_LONG_PRESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[n.SELECTION_ANCHORED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[n.DRAG_EXPANDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[n.HANDLE_DRAGGING.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[n.IDLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        f137535b = iArr2;
    }
}
