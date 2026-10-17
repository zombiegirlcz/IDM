package x36;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f302697b;

    static {
        int[] iArr = new int[wd6.e.values().length];
        try {
            iArr[wd6.e.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[wd6.e.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f302696a = iArr;
        int[] iArr2 = new int[com.revolut.feature.defi.common.models.domain.a.values().length];
        try {
            iArr2[com.revolut.feature.defi.common.models.domain.a.DAILY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[com.revolut.feature.defi.common.models.domain.a.MONTHLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        f302697b = iArr2;
    }
}
