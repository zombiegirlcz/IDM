package jsk;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178191a;

    static {
        int[] iArr = new int[pdh.e.values().length];
        try {
            iArr[pdh.e.PURPOSE_LEARNING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pdh.e.PURPOSE_PRESERVE_CAPITAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[pdh.e.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f178191a = iArr;
    }
}
