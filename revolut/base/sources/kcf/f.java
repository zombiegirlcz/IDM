package kcf;

import kotlin.jvm.internal.Intrinsics;
import xbf.g;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mbf.c f182726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f182727b;

    public f(mbf.c tradingProUpsellingBannerProvider, g tradingProUpsellingNavigationProvider) {
        Intrinsics.checkNotNullParameter(tradingProUpsellingBannerProvider, "tradingProUpsellingBannerProvider");
        Intrinsics.checkNotNullParameter(tradingProUpsellingNavigationProvider, "tradingProUpsellingNavigationProvider");
        this.f182726a = tradingProUpsellingBannerProvider;
        this.f182727b = tradingProUpsellingNavigationProvider;
    }
}
