package mae;

import i9e.z;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f204020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9l.a f204021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f204022c;
    public final thf.c d;
    public final thf.l e;
    public final nr2.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jla.h f204023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z f204024h;
    public final nm1.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f204025j;
    public final k k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f204026l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g1i.c f204027m;

    public p(h subscriptionsAppMapper, j9l.a moneyCalculator, l80.e dateProvider, thf.c transactionCategoryResourcesMapper, thf.l transactionsItemMapper, nr2.d blockedMerchantWidgetProvider, jla.h productCatalogueInteractor, z editPaymentSourceInfoProvider, nm1.b boletoFinderItemsProvider, m subscriptionsIconMapper, k subscriptionsBadgeMapper, r subscriptionsTextMapper, g1i.c subscriptionPaymentFromMapper) {
        Intrinsics.checkNotNullParameter(subscriptionsAppMapper, "subscriptionsAppMapper");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        Intrinsics.checkNotNullParameter(blockedMerchantWidgetProvider, "blockedMerchantWidgetProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(editPaymentSourceInfoProvider, "editPaymentSourceInfoProvider");
        Intrinsics.checkNotNullParameter(boletoFinderItemsProvider, "boletoFinderItemsProvider");
        Intrinsics.checkNotNullParameter(subscriptionsIconMapper, "subscriptionsIconMapper");
        Intrinsics.checkNotNullParameter(subscriptionsBadgeMapper, "subscriptionsBadgeMapper");
        Intrinsics.checkNotNullParameter(subscriptionsTextMapper, "subscriptionsTextMapper");
        Intrinsics.checkNotNullParameter(subscriptionPaymentFromMapper, "subscriptionPaymentFromMapper");
        this.f204020a = subscriptionsAppMapper;
        this.f204021b = moneyCalculator;
        this.f204022c = dateProvider;
        this.d = transactionCategoryResourcesMapper;
        this.e = transactionsItemMapper;
        this.f = blockedMerchantWidgetProvider;
        this.f204023g = productCatalogueInteractor;
        this.f204024h = editPaymentSourceInfoProvider;
        this.i = boletoFinderItemsProvider;
        this.f204025j = subscriptionsIconMapper;
        this.k = subscriptionsBadgeMapper;
        this.f204026l = subscriptionsTextMapper;
        this.f204027m = subscriptionPaymentFromMapper;
    }

    public final o a(f01.c uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return new o(this.f204020a, uiKitResources, this.f204021b, this.f204022c, currenciesLocalization, this.f204023g, this.i, this.f204025j, this.k, this.f204026l, this.f204027m);
    }

    public final i9e.f b(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        return new i9e.f(this.e, this.d, this.f204020a, uiKitResources, this.f204022c, this.f, this.f204023g, this.f204024h);
    }

    public final o c(f01.a uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return new o(this.f204020a, uiKitResources, this.f204021b, this.f204022c, currenciesLocalization, this.f204023g, this.i, this.f204025j, this.k, this.f204026l, this.f204027m);
    }

    public final o d(f01.a uiKitResources, t70.b currenciesLocalization) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currenciesLocalization, "currenciesLocalization");
        return new o(this.f204020a, uiKitResources, this.f204021b, this.f204022c, currenciesLocalization, this.f204023g, this.i, this.f204025j, this.k, this.f204026l, this.f204027m);
    }
}
