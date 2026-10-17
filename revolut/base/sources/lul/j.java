package lul;

/* JADX INFO: loaded from: classes12.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f200259a;

    static {
        int[] iArr = new int[com.revolut.shared.feature.market_data.models.domain.models.a.values().length];
        try {
            iArr[com.revolut.shared.feature.market_data.models.domain.models.a.BUY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[com.revolut.shared.feature.market_data.models.domain.models.a.SELL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f200259a = iArr;
    }
}
