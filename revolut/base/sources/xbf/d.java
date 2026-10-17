package xbf;

import kotlin.jvm.internal.Intrinsics;
import ybl.l;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements mbf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbf.a f304071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zja.a f304072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wbf.e f304073c;
    public final l d;
    public final qka.c e;

    public d(kbf.a tradingAddOnsSpecificAddOnInteractor, zja.a productArticleInteractor, wbf.e portfolioStatusCalculator, l tradingConfigInteractor, qka.c productArticleNavigationProvider) {
        Intrinsics.checkNotNullParameter(tradingAddOnsSpecificAddOnInteractor, "tradingAddOnsSpecificAddOnInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(portfolioStatusCalculator, "portfolioStatusCalculator");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f304071a = tradingAddOnsSpecificAddOnInteractor;
        this.f304072b = productArticleInteractor;
        this.f304073c = portfolioStatusCalculator;
        this.d = tradingConfigInteractor;
        this.e = productArticleNavigationProvider;
    }
}
