package m9d;

/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f203725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f203726b;

    static {
        int[] iArr = new int[com.revolut.core.chaosmanagement.domain.model.a.values().length];
        try {
            iArr[com.revolut.core.chaosmanagement.domain.model.a.DISMISS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.core.chaosmanagement.domain.model.a.SUBSCRIBE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.core.chaosmanagement.domain.model.a.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f203725a = iArr;
        int[] iArr2 = new int[j30.b.values().length];
        try {
            iArr2[j30.b.DISABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[j30.b.PARTIALLY_ENABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[j30.b.FULLY_ENABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f203726b = iArr2;
    }
}
