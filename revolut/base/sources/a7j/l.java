package a7j;

import a08.o;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import tzg.m;
import vrl.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f1932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f1933b;

    public l(u0 tradingOrdersInteractor, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f1932a = tradingOrdersInteractor;
        this.f1933b = wealthAccountsInteractor;
    }

    @Override // a7j.e
    public final d0 a(ExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(m.c(this.f1933b, null, null, 3), kotlin.coroutines.g.f186406a), null, new a5g.l(11), 1).firstOrError();
        a6b.a aVar = new a6b.a(new o(this, draft, 15), 13);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarFirstOrError, aVar, 0), new a6b.a(new a5g.h(25), 14), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
