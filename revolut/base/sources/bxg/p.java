package bxg;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f19698a;

    static {
        int[] iArr = new int[pwg.q.values().length];
        try {
            iArr[pwg.q.HIGHEST_FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[pwg.q.LOWEST_FIRST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f19698a = iArr;
    }
}
