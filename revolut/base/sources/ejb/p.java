package ejb;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f126855a;

    static {
        int[] iArr = new int[o.values().length];
        try {
            iArr[o.INTEREST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[o.MONEY_IN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[o.MONEY_OUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f126855a = iArr;
    }
}
