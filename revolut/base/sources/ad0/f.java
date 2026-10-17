package ad0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f3213a;

    static {
        int[] iArr = new int[com.revolut.feature.backend_flow.domain.models.d.values().length];
        try {
            iArr[com.revolut.feature.backend_flow.domain.models.d.ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.backend_flow.domain.models.d.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[com.revolut.feature.backend_flow.domain.models.d.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[com.revolut.feature.backend_flow.domain.models.d.DEFAULT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f3213a = iArr;
    }
}
