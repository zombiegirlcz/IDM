package d2i;

import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import cu8.u0;
import d27.g0;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k61.a f110853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vi0.b f110854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rea.m f110855c;
    public final x0i.f d;

    public e(k61.a transferInteractor, vi0.b accountIdProvider, rea.m pocketDetailsInteractor, x0i.f exchangeCurrenciesInteractor) {
        Intrinsics.checkNotNullParameter(transferInteractor, "transferInteractor");
        Intrinsics.checkNotNullParameter(accountIdProvider, "accountIdProvider");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(exchangeCurrenciesInteractor, "exchangeCurrenciesInteractor");
        this.f110853a = transferInteractor;
        this.f110854b = accountIdProvider;
        this.f110855c = pocketDetailsInteractor;
        this.d = exchangeCurrenciesInteractor;
    }

    public static dj0.d b(MoneyDetails moneyDetails) {
        Long l2 = moneyDetails.f96898b;
        return new dj0.d(l2 != null ? l2.longValue() : 0L, moneyDetails.f96897a);
    }

    @Override // d2i.f
    public final d0 a(ExchangeOrderDraft draft) {
        b bVar;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Long l2 = draft.f96884j;
        TakeProfitStopLoss takeProfitStopLoss = draft.f;
        r1i.h hVar = draft.f96882g;
        MoneyDetails moneyDetails = draft.f96879a;
        MoneyDetails moneyDetails2 = draft.f96880b;
        if (l2 == null) {
            throw new IllegalArgumentException("timestamp should be specified");
        }
        long jLongValue = l2.longValue();
        if (draft.f96881c == wd6.e.BUY) {
            bVar = new b(b(moneyDetails2), moneyDetails2.f, b(moneyDetails), hVar == r1i.h.TOP ? c.TO : c.FROM, jLongValue, draft.f96881c, takeProfitStopLoss != null ? takeProfitStopLoss.f72160b : null, takeProfitStopLoss != null ? takeProfitStopLoss.f72161c : null);
        } else {
            bVar = new b(b(moneyDetails), moneyDetails.f, b(moneyDetails2), hVar == r1i.h.TOP ? c.FROM : c.TO, jLongValue, draft.f96881c, takeProfitStopLoss != null ? takeProfitStopLoss.f72160b : null, takeProfitStopLoss != null ? takeProfitStopLoss.f72161c : null);
        }
        OrderQuote orderQuote = draft.f96891s;
        String str = orderQuote != null ? orderQuote.f104762q : null;
        d0 d0VarC = this.d.c(bVar.f110848b, bVar.f110847a.f115083b, this.f110854b.f289492a, io3.l.CURRENT);
        u0 u0Var = new u0(29, new d27.d0(6));
        d0VarC.getClass();
        ufm.i iVar = new ufm.i(d0VarC, u0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(ue0.e.I(iVar, h0.f322473a, new d27.d0(7)), new a(new g0(this, 1, bVar, str), 0), 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }
}
