package vdf;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f287922a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.NEVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.ONLY_NEGATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f287922a = iArr;
    }
}
