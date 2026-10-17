package azl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f11481a;

    static {
        int[] iArr = new int[k.values().length];
        try {
            iArr[k.RIGHT_TO_LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[k.LEFT_TO_RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[k.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f11481a = iArr;
    }
}
