package qoc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f248118a;

    static {
        int[] iArr = new int[roc.a.values().length];
        try {
            iArr[roc.a.ON_TRACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[roc.a.OFF_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[roc.a.FAILED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[roc.a.ACHIEVED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f248118a = iArr;
    }
}
