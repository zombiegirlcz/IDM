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
public final class x implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f319769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6e.i f319770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ssi.o f319771c;
    public final g6e.f d;
    public final g6e.g e;
    public final a7e.f f;

    public x(a7e.f defaultRemovalSource, g6e.d subaccountInteractor, g6e.f transactionInteractor, g6e.g navigationProvider, ssi.o transactionsWidgetUiModel, x6e.i mapper) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(defaultRemovalSource, "defaultRemovalSource");
        this.f319769a = subaccountInteractor;
        this.f319770b = mapper;
        this.f319771c = transactionsWidgetUiModel;
        this.d = transactionInteractor;
        this.e = navigationProvider;
        this.f = defaultRemovalSource;
    }

    @Override // z5e.c
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return nim.a.v(((l0) this.d).a(accountId.f89729a, SubaccountType.ProTax.f88965a), new z1.c(this, accountId, 19));
    }

    @Override // z5e.c
    public final Object c(ProductAccountId productAccountId, yhe.k kVar) {
        return this.f.d(productAccountId.f89729a, SubaccountType.ProTax.f88965a, kVar);
    }

    @Override // z5e.c
    public final Object d(ProductAccountId productAccountId, Continuation continuation) {
        Object objZ = ((s6e.z) this.f319769a).z(SubaccountType.ProTax.f88965a, (gim.c) continuation);
        return objZ == fim.a.COROUTINE_SUSPENDED ? objZ : Unit.f186387a;
    }

    @Override // z5e.c
    public final Object e(ProductAccountId productAccountId, Continuation continuation) {
        HomeFeedWidgetContext.ProTaxPocket.Companion companion = HomeFeedWidgetContext.ProTaxPocket.INSTANCE;
        String subaccountId = productAccountId.f89729a;
        companion.getClass();
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        return new sfe.z(new HomeFeedWidgetContext.ProTaxPocket(null, subaccountId, 1, null));
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        return xam.a.h(new w(this, null), ((s6e.z) this.f319769a).w(f.g.f149642a, c8g.c.C(dataLoadingMode)));
    }

    @Override // z5e.c
    public final Object g(ProductAccountId productAccountId, a6e.f fVar) {
        return this.f.c(productAccountId, fVar);
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.q.Q(b(accountId), new g((Continuation) null, this, 3));
    }

    @Override // z5e.c
    public final Object i(ProductAccountId productAccountId, Continuation continuation) {
        Object objE = this.f.e(productAccountId, (yhe.i) continuation);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new v(accountId, this, null), ((s6e.z) this.f319769a).u(accountId.f89729a));
    }
}
