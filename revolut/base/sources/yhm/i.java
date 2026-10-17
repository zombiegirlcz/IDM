package yhm;

/* JADX INFO: loaded from: classes13.dex */
public abstract /* synthetic */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314192a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.SYNCHRONIZED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.PUBLICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f314192a = iArr;
    }
}
