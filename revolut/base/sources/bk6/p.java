package bk6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16278a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.TRANSACTIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.AUTHORIZATIONS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[h.LINKED_ACCOUNTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f16278a = iArr;
    }
}
