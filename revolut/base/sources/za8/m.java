package za8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f320585a;

    static {
        int[] iArr = new int[u98.a.values().length];
        try {
            iArr[u98.a.TOO_OLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[u98.a.TOO_YOUNG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[u98.a.INVALID_AGE_DIFFERENCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[u98.a.FUTURE_DATE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[u98.a.ELIGIBLE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f320585a = iArr;
    }
}
