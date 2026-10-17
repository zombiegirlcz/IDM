package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes14.dex */
public abstract /* synthetic */ class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f186437a;

    static {
        int[] iArr = new int[wim.t.values().length];
        try {
            iArr[wim.t.INVARIANT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wim.t.IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[wim.t.OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f186437a = iArr;
    }
}
