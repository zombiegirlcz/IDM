package s6f;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f260339a;

    static {
        int[] iArr = new int[alc.d.values().length];
        try {
            iArr[alc.d.DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[alc.d.WITHDRAWAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[alc.d.STATEMENTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[alc.d.SETTINGS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f260339a = iArr;
    }
}
