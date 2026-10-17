package di7;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f114938a;

    static {
        int[] iArr = new int[com.revolut.feature.instruments.trend.collections.api.model.a.values().length];
        try {
            iArr[com.revolut.feature.instruments.trend.collections.api.model.a.GOVERNMENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.feature.instruments.trend.collections.api.model.a.CORPORATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f114938a = iArr;
    }
}
