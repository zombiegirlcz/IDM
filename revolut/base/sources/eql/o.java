package eql;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f128513a;

    static {
        int[] iArr = new int[hjl.c.values().length];
        try {
            iArr[hjl.c.BANK_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[hjl.c.GOOGLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[hjl.c.DAP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[hjl.c.UAE_PASS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f128513a = iArr;
    }
}
