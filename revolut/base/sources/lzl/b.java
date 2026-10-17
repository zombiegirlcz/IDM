package lzl;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f201025a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.THREE_DIGITS_SEPARATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.ONE_DIGIT_AFTER_DOT_WITHOUT_ROUNDING_ZERO_ABSENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_ZEROES_ABSENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.TWO_DIGITS_AFTER_DOT_WITHOUT_ROUNDING_SHOW_ZEROES.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f201025a = iArr;
    }
}
