package maa;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203985a;

    static {
        int[] iArr = new int[l.values().length];
        try {
            iArr[l.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[l.INDIVIDUALS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[l.BUSINESSES.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f203985a = iArr;
    }
}
