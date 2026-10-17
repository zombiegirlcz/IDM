package zvc;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f325651a;

    static {
        int[] iArr = new int[y80.d.values().length];
        try {
            iArr[y80.d.GRANTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[y80.d.DENIED_PERMANENTLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[y80.d.DENIED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f325651a = iArr;
    }
}
