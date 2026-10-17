package xge;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vge.e2;
import vge.i0;
import vge.j0;
import vge.s0;
import vge.u3;
import vge.v0;
import vge.y2;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f305711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f305712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lge.h f305713c;
    public final su9.c d;
    public final b0 e;
    public final j f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y2 f305714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s0 f305715h;
    public final u3 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v0 f305716j;
    public final i0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j0 f305717l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z f305718m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f305719n;
    public final gte.a o;

    public g(CoroutineScope scope, e2 repository, lge.j iconProvider, lge.h titleProvider, su9.c spacesReorderingItemDecorator, b0 reorderingRepository, j accountSpacesProvider, y2 productAccountsInfoInteractor, s0 convertedBalanceDecorator, u3 productDataSourcesMediator, v0 discoverFilteringDecorator, i0 accountsState, j0 advisedDiscoverProductsDecorator, z hiddenAccountsProductsDecorator, n accountVisibilityProductsDecorator, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(iconProvider, "iconProvider");
        Intrinsics.checkNotNullParameter(titleProvider, "titleProvider");
        Intrinsics.checkNotNullParameter(spacesReorderingItemDecorator, "spacesReorderingItemDecorator");
        Intrinsics.checkNotNullParameter(reorderingRepository, "reorderingRepository");
        Intrinsics.checkNotNullParameter(accountSpacesProvider, "accountSpacesProvider");
        Intrinsics.checkNotNullParameter(productAccountsInfoInteractor, "productAccountsInfoInteractor");
        Intrinsics.checkNotNullParameter(convertedBalanceDecorator, "convertedBalanceDecorator");
        Intrinsics.checkNotNullParameter(productDataSourcesMediator, "productDataSourcesMediator");
        Intrinsics.checkNotNullParameter(discoverFilteringDecorator, "discoverFilteringDecorator");
        Intrinsics.checkNotNullParameter(accountsState, "accountsState");
        Intrinsics.checkNotNullParameter(advisedDiscoverProductsDecorator, "advisedDiscoverProductsDecorator");
        Intrinsics.checkNotNullParameter(hiddenAccountsProductsDecorator, "hiddenAccountsProductsDecorator");
        Intrinsics.checkNotNullParameter(accountVisibilityProductsDecorator, "accountVisibilityProductsDecorator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f305711a = scope;
        this.f305712b = repository;
        this.f305713c = titleProvider;
        this.d = spacesReorderingItemDecorator;
        this.e = reorderingRepository;
        this.f = accountSpacesProvider;
        this.f305714g = productAccountsInfoInteractor;
        this.f305715h = convertedBalanceDecorator;
        this.i = productDataSourcesMediator;
        this.f305716j = discoverFilteringDecorator;
        this.k = accountsState;
        this.f305717l = advisedDiscoverProductsDecorator;
        this.f305718m = hiddenAccountsProductsDecorator;
        this.f305719n = accountVisibilityProductsDecorator;
        this.o = featureToggleInteractor;
    }

    @Override // qfe.m
    public final Flow a(sfe.a loadingMode, qfe.l filterType) {
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return vkm.q.Q(this.f.a(), new d(null, this, filterType, loadingMode, 0));
    }

    public final wkm.l b(sfe.a loadingMode, qfe.l filterType) {
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        return vkm.q.Q(this.f.a(), new d(null, this, filterType, loadingMode, 1));
    }
}
