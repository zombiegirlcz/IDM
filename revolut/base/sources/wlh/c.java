package wlh;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import x8h.n0;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4f.f f298479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f298480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f298481c;
    public final n d;
    public final m e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kpj.f f298482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ybl.l f298483h;
    public final gte.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ybl.i f298484j;
    public final d1e.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f298485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f298486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j6h.c f298487n;
    public final ybl.j o;

    public c(d4f.f stockBuyBlockInteractor, n0 stockLendingInteractor, l stockBuyBlockItemFactory, n stocksBuyBlockDialogFactory, m stockLendingItemFactory, a complexBondsAssessmentItemFactory, kpj.f wealthAccountHeaderUiMapper, ybl.l tradingConfigInteractor, gte.a featureToggleInteractor, ybl.i productGroupAvailabilityInteractor, d1e.a stockLendingNaviCommandProvider, Map productsProviders, o wealthGiaMarginProductItemFactory, j6h.c giaMarginCommandProvider, ybl.j tradingAccountProductGroupOnboardingStateInteractor) {
        Intrinsics.checkNotNullParameter(stockBuyBlockInteractor, "stockBuyBlockInteractor");
        Intrinsics.checkNotNullParameter(stockLendingInteractor, "stockLendingInteractor");
        Intrinsics.checkNotNullParameter(stockBuyBlockItemFactory, "stockBuyBlockItemFactory");
        Intrinsics.checkNotNullParameter(stocksBuyBlockDialogFactory, "stocksBuyBlockDialogFactory");
        Intrinsics.checkNotNullParameter(stockLendingItemFactory, "stockLendingItemFactory");
        Intrinsics.checkNotNullParameter(complexBondsAssessmentItemFactory, "complexBondsAssessmentItemFactory");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productGroupAvailabilityInteractor, "productGroupAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(stockLendingNaviCommandProvider, "stockLendingNaviCommandProvider");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(wealthGiaMarginProductItemFactory, "wealthGiaMarginProductItemFactory");
        Intrinsics.checkNotNullParameter(giaMarginCommandProvider, "giaMarginCommandProvider");
        Intrinsics.checkNotNullParameter(tradingAccountProductGroupOnboardingStateInteractor, "tradingAccountProductGroupOnboardingStateInteractor");
        this.f298479a = stockBuyBlockInteractor;
        this.f298480b = stockLendingInteractor;
        this.f298481c = stockBuyBlockItemFactory;
        this.d = stocksBuyBlockDialogFactory;
        this.e = stockLendingItemFactory;
        this.f = complexBondsAssessmentItemFactory;
        this.f298482g = wealthAccountHeaderUiMapper;
        this.f298483h = tradingConfigInteractor;
        this.i = featureToggleInteractor;
        this.f298484j = productGroupAvailabilityInteractor;
        this.k = stockLendingNaviCommandProvider;
        this.f298485l = productsProviders;
        this.f298486m = wealthGiaMarginProductItemFactory;
        this.f298487n = giaMarginCommandProvider;
        this.o = tradingAccountProductGroupOnboardingStateInteractor;
    }
}
