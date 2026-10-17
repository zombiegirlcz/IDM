package l10;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191378a;

    static {
        int[] iArr = new int[n10.b.values().length];
        try {
            iArr[n10.b.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[n10.b.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[n10.b.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f191378a = iArr;
    }
}
