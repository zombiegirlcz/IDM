package z6e;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import h6e.f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class u implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x6e.i f319763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.g f319764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.d f319765c;
    public final g6e.f d;
    public final ssi.o e;
    public final a7e.f f;

    public u(a7e.f defaultRemovalSource, g6e.d subaccountInteractor, g6e.f transactionInteractor, g6e.g navigationProvider, ssi.o transactionsWidgetUiModel, x6e.i mapper) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(defaultRemovalSource, "defaultRemovalSource");
        this.f319763a = mapper;
        this.f319764b = navigationProvider;
        this.f319765c = subaccountInteractor;
        this.d = transactionInteractor;
        this.e = transactionsWidgetUiModel;
        this.f = defaultRemovalSource;
    }

    @Override // z5e.c
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.v(((l0) this.d).a(accountId.f89729a, SubaccountType.Pro.f88964a), new z1.c(this, accountId, 18));
    }

    @Override // z5e.c
    public final Object c(ProductAccountId productAccountId, yhe.k kVar) {
        return this.f.d(productAccountId.f89729a, SubaccountType.Pro.f88964a, kVar);
    }

    @Override // z5e.c
    public final Object d(ProductAccountId productAccountId, Continuation continuation) {
        Object objZ = ((s6e.z) this.f319765c).z(SubaccountType.Pro.f88964a, (gim.c) continuation);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    @Override // z5e.c
    public final Object e(ProductAccountId productAccountId, Continuation continuation) {
        HomeFeedWidgetContext.ProPocket.Companion companion = HomeFeedWidgetContext.ProPocket.INSTANCE;
        String subaccountId = productAccountId.f89729a;
        companion.getClass();
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        return new sfe.z(new HomeFeedWidgetContext.ProPocket(null, subaccountId, 1, null));
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return xam.a.h(new t(this, null), ((s6e.z) this.f319765c).w(f.C0861f.f149641a, c8g.c.C(dataLoadingMode)));
    }

    @Override // z5e.c
    public final Object g(ProductAccountId productAccountId, a6e.f fVar) {
        return this.f.c(productAccountId, fVar);
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.q.Q(b(accountId), new g((Continuation) null, this, 2));
    }

    @Override // z5e.c
    public final Object i(ProductAccountId productAccountId, Continuation continuation) {
        Object objE = this.f.e(productAccountId, (yhe.i) continuation);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new s(accountId, this, null), ((s6e.z) this.f319765c).u(accountId.f89729a));
    }
}
