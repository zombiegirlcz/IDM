package rh8;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f254373a;

    static {
        int[] iArr = new int[th8.a.values().length];
        try {
            iArr[th8.a.AVAILABLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[th8.a.MAX_TOTAL_ACCOUNT_LIMIT_REACHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[th8.a.MAX_GUARDIAN_ACCOUNT_LIMIT_REACHED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[th8.a.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f254373a = iArr;
    }
}
