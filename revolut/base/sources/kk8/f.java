package kk8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f184506a;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.USER_CURRENT_FEATURES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.USER_PLAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.CONFIG_USER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f184506a = iArr;
    }
}
