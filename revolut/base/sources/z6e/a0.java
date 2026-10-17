package z6e;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.l0;
import xfe.a;
import zh9.u0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.d f319719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6e.i f319720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ssi.o f319721c;
    public final g6e.f d;
    public final g6e.g e;

    public a0(g6e.d subaccountInteractor, x6e.i mapper, ssi.o transactionsWidgetUiModel, g6e.f transactionInteractor, g6e.g navigationProvider) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(transactionInteractor, "transactionInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.f319719a = subaccountInteractor;
        this.f319720b = mapper;
        this.f319721c = transactionsWidgetUiModel;
        this.d = transactionInteractor;
        this.e = navigationProvider;
    }

    @Override // z5e.c
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        String str = accountId.f89729a;
        l0 l0Var = (l0) this.d;
        SubaccountType.Teen teen = SubaccountType.Teen.f88966a;
        return nim.a.v(u0.m(l0Var.a(str, teen), l0Var.c(accountId.f89729a, teen)), new z1.c(this, accountId, 20));
    }

    @Override // z5e.c
    public final Object c(ProductAccountId productAccountId, yhe.k kVar) {
        return null;
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        ProductSpaceIdentifier.Teen teen = productSpaceIdentifier instanceof ProductSpaceIdentifier.Teen ? (ProductSpaceIdentifier.Teen) productSpaceIdentifier : null;
        String str = teen != null ? teen.f89752c : null;
        if (str != null) {
            return xam.a.h(new z(this, null), ((s6e.z) this.f319719a).w(new h6e.h(str), c8g.c.C(dataLoadingMode)));
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Space has to be teen");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
    }

    @Override // z5e.c
    public final Object g(ProductAccountId productAccountId, a6e.f fVar) {
        return a.C1695a.f305241a;
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return vkm.q.Q(b(accountId), new g((Continuation) null, this, 4));
    }

    @Override // z5e.c
    public final Object i(ProductAccountId productAccountId, Continuation continuation) {
        return Unit.f186387a;
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return xam.a.h(new y(accountId, this, null), ((s6e.z) this.f319719a).u(accountId.f89729a));
    }
}
