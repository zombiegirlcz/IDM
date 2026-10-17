package vm5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f290541a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.FUTURE_DATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.TOO_OLD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.TOO_YOUNG.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[h.EMPTY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[h.VALID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f290541a = iArr;
    }
}
