package im9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162325a;

    static {
        int[] iArr = new int[c.values().length];
        try {
            iArr[c.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[c.REVOLUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[c.ACCOUNTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[c.CARDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f162325a = iArr;
    }
}
