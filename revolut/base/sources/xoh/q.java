package xoh;

import com.revolut.feature.wealth_discovery.impl.screener.flows.all_filters.ScreenerAllFiltersFlowContract$Page;

/* JADX INFO: loaded from: classes10.dex */
public abstract /* synthetic */ class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f307849b;

    static {
        int[] iArr = new int[ScreenerAllFiltersFlowContract$Page.values().length];
        try {
            iArr[ScreenerAllFiltersFlowContract$Page.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScreenerAllFiltersFlowContract$Page.ETP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScreenerAllFiltersFlowContract$Page.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScreenerAllFiltersFlowContract$Page.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f307848a = iArr;
        int[] iArr2 = new int[zel.f.values().length];
        try {
            iArr2[zel.f.STOCKS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[zel.f.ETP.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[zel.f.BOND.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[zel.f.CFD.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f307849b = iArr2;
    }
}
