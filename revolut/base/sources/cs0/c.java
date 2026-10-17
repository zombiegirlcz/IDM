package cs0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108424a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.MASKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.UNMASKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f108424a = iArr;
    }
}
