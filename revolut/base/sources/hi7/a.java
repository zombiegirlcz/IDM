package hi7;

import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsCollectionAssetsTypeFilterValue;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f152528a;

    static {
        int[] iArr = new int[InstrumentsCollectionAssetsTypeFilterValue.values().length];
        try {
            iArr[InstrumentsCollectionAssetsTypeFilterValue.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InstrumentsCollectionAssetsTypeFilterValue.CFDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InstrumentsCollectionAssetsTypeFilterValue.STOCKS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InstrumentsCollectionAssetsTypeFilterValue.BONDS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InstrumentsCollectionAssetsTypeFilterValue.ETFS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f152528a = iArr;
    }
}
