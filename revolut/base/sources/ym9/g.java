package ym9;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f314889a;

    static {
        int[] iArr = new int[d.values().length];
        try {
            iArr[d.BLOCKED_USERS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[d.REQUIRE_AUTHENTICATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f314889a = iArr;
    }
}
