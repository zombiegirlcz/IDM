package ybh;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f312302a;

    static {
        int[] iArr = new int[j0h.a.values().length];
        try {
            iArr[j0h.a.REQUIRE_ONE_OFF_DEPOSIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j0h.a.REQUIRE_RECURRING_DEPOSIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j0h.a.ONE_OFF_OR_RECURRING_DEPOSIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f312302a = iArr;
    }
}
