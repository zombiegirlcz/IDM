package vkm;

/* JADX INFO: loaded from: classes14.dex */
public abstract /* synthetic */ class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290036a;

    static {
        int[] iArr = new int[b2.values().length];
        try {
            iArr[b2.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b2.STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[b2.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f290036a = iArr;
    }
}
