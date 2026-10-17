package wjd;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f298064b;

    static {
        int[] iArr = new int[rl0.d.values().length];
        try {
            iArr[rl0.d.PASSCODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[rl0.d.PASSKEY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f298063a = iArr;
        int[] iArr2 = new int[hjl.c.values().length];
        try {
            iArr2[hjl.c.BANK_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[hjl.c.DAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[hjl.c.UAE_PASS.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[hjl.c.GOOGLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        f298064b = iArr2;
    }
}
