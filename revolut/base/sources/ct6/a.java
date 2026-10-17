package ct6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f108619a;

    static {
        int[] iArr = new int[lr6.d.values().length];
        try {
            iArr[lr6.d.INBOUND_BLOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[lr6.d.OUTBOUND_BLOCKED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[lr6.d.INBOUND_OUTBOUND_BLOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[lr6.d.ACCOUNT_CLOSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[lr6.d.ACCOUNT_CLOSED_MANUALLY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f108619a = iArr;
    }
}
