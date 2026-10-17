package mra;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f208091a;

    static {
        int[] iArr = new int[lqa.g.values().length];
        try {
            iArr[lqa.g.SELF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lqa.g.LINKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lqa.g.OTHER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f208091a = iArr;
    }
}
