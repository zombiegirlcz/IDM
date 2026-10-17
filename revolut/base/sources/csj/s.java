package csj;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108497a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.UPDATE_REMOTELY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.UPDATE_LOCALLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108497a = iArr;
    }
}
