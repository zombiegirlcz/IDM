package zsc;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f324879a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.WORD_PREFIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.MIDDLE_OF_THE_WORD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f324879a = iArr;
    }
}
