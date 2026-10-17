package qza;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f250483a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.ERROR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.LOADED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f250483a = iArr;
    }
}
