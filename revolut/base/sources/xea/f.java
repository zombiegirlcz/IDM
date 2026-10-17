package xea;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f304563a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.ON_HOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.CURRENCIES.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.CREDITS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e.LINKED_ACCOUNTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e.CRYPTO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f304563a = iArr;
    }
}
