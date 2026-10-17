package yma;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314902a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.EMAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.CHECK_EMAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[d.CODE_CONFIRMATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[d.SUCCESS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[d.ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f314902a = iArr;
    }
}
