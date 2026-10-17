package ss4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f265269a;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.BALANCE_LIMIT_EXCEEDED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.UNDER_MINIMUM_LIMIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.BALANCE_AND_MAXIMUM_LIMIT_EXCEEDS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.MAXIMUM_LIMIT_EXCEEDED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[j.INSTALMENT_BOUND_LIMIT_EXCEEDED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f265269a = iArr;
    }
}
