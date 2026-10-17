package ip0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class rd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f166160a;

    static {
        int[] iArr = new int[qd0.values().length];
        try {
            iArr[qd0.INDETERMINATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[qd0.SELECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[qd0.UNSELECTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f166160a = iArr;
    }
}
