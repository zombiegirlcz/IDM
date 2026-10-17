package d0k;

import com.revolut.feature.global_markets.domain.Market;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f110446a;

    static {
        int[] iArr = new int[Market.values().length];
        try {
            iArr[Market.US.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Market.Europe.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Market.APAC.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f110446a = iArr;
    }
}
