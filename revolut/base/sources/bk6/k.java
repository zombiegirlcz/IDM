package bk6;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f16273a;

    static {
        int[] iArr = new int[h.values().length];
        try {
            iArr[h.AUTHORIZATIONS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[h.LINKED_ACCOUNTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f16273a = iArr;
    }
}
