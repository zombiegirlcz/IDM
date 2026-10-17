package roc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f255969a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.ON_TRACK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.OFF_TRACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ACHIEVED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.FAILED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f255969a = iArr;
    }
}
