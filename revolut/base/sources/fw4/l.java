package fw4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f138582a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.BELOW_MINIMUM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.EXCEED_MAXIMUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f138582a = iArr;
    }
}
