package ne0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f214382a;

    static {
        int[] iArr = new int[b.values().length];
        try {
            iArr[b.HASH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[b.LINKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f214382a = iArr;
    }
}
