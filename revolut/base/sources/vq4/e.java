package vq4;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f291311a;

    static {
        int[] iArr = new int[kl4.a.values().length];
        try {
            iArr[kl4.a.FACILITY_RECENTLY_OPENED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[kl4.a.RECENT_CREDIT_LIMIT_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[kl4.a.FACILITY_IS_LATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[kl4.a.OFFER_NOT_AFFORDABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f291311a = iArr;
    }
}
