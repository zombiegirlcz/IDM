package vph;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291217a;

    static {
        int[] iArr = new int[moh.a.values().length];
        try {
            iArr[moh.a.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[moh.a.VALID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[moh.a.TOO_LONG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[moh.a.TOO_SHORT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[moh.a.HAS_INVALID_CHARS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[moh.a.DUPLICATE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f291217a = iArr;
    }
}
