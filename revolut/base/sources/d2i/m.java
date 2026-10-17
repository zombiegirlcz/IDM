package d2i;

import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import cui.v;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import vrl.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f110868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tzg.m f110869b;

    public m(u0 tradingOrdersInteractor, tzg.m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f110868a = tradingOrdersInteractor;
        this.f110869b = wealthAccountsInteractor;
    }

    @Override // d2i.f
    public final d0 a(ExchangeOrderDraft draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(tzg.m.c(this.f110869b, null, null, 3), kotlin.coroutines.g.f186406a), null, new czh.a(10), 1).firstOrError();
        a aVar = new a(new v(this, draft, 21), 6);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarFirstOrError, aVar, 0), new a(new d27.d0(11), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
