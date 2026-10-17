package mz3;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class n3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f210642a;

    static {
        int[] iArr = new int[bt3.a.values().length];
        try {
            iArr[bt3.a.FAILED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bt3.a.PARTNER_NOT_MATCHED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bt3.a.PARTNER_DECLINED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bt3.a.WAITING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bt3.a.CHECKING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f210642a = iArr;
    }
}
