package jq;

/* JADX INFO: loaded from: classes17.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f177328a;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.LOGIN_REQUIRED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.KYC_PENDING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.KYC_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f177328a = iArr;
    }
}
