package z6e;

import com.revolut.data.model.Data;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.l0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f319749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6e.i f319750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ssi.o f319751c;
    public final g6e.f d;
    public final g6e.g e;
    public final a7e.f f;

    public n(a7e.f defaultRemovalSource, g6e.d subaccountInteractor, g6e.f transactionInteractor, g6e.g navigationProvider, ssi.o transactionsWidgetUiModel, x6e.i mapper) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(defaultRemovalSource, "defaultRemovalSource");
        this.f319749a = subaccountInteractor;
        this.f319750b = mapper;
        this.f319751c = transactionsWidgetUiModel;
        this.d = transactionInteractor;
        this.e = navigationProvider;
        this.f = defaultRemovalSource;
    }

    @Override // z5e.c
    public final Object c(ProductAccountId productAccountId, yhe.k kVar) {
        return this.f.d(productAccountId.f89729a, SubaccountType.Junior.f88962a, kVar);
    }

    @Override // z5e.c
    public final Object e(ProductAccountId productAccountId, Continuation continuation) {
        HomeFeedWidgetContext.JuniorPocket.Companion companion = HomeFeedWidgetContext.JuniorPocket.INSTANCE;
        String vaultId = productAccountId.f89729a;
        companion.getClass();
        Intrinsics.checkNotNullParameter(vaultId, "vaultId");
        return new sfe.z(new HomeFeedWidgetContext.JuniorPocket("YouthPockets", vaultId));
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        ProductSpaceIdentifier.Youth youth = productSpaceIdentifier instanceof ProductSpaceIdentifier.Youth ? (ProductSpaceIdentifier.Youth) productSpaceIdentifier : null;
        if (youth == null) {
            return new go.g(new Data(null, new IllegalArgumentException("Space has to be junior"), false, 5, null), 2);
        }
        ProductSpaceIdentifier.Youth.State state = youth.f89754c;
        if (Intrinsics.f(state, ProductSpaceIdentifier.Youth.State.Discover.f89756a)) {
            return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        if (state instanceof ProductSpaceIdentifier.Youth.State.Active) {
            return xam.a.h(new m(this, null), ((s6e.z) this.f319749a).w(new h6e.g(((ProductSpaceIdentifier.Youth.State.Active) state).f89755a), c8g.c.C(dataLoadingMode)));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // z5e.c
    public final Object g(ProductAccountId productAccountId, a6e.f fVar) {
        return this.f.c(productAccountId, fVar);
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.q.Q(((l0) this.d).a(accountId.f89729a, SubaccountType.Junior.f88962a), new wf0.f0((Continuation) null, this, accountId, 16));
    }

    @Override // z5e.c
    public final Object i(ProductAccountId productAccountId, Continuation continuation) {
        Object objE = this.f.e(productAccountId, (yhe.i) continuation);
        return objE == fim.a.COROUTINE_SUSPENDED ? objE : Unit.f186387a;
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new l(accountId, this, null), ((s6e.z) this.f319749a).u(accountId.f89729a));
    }
}
