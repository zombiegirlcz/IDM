package zrl;

import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.feature.trading_orders.common.models.SourcePocketWrapper;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import dj0.d;
import f8l.e;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import wrl.c;
import xo8.i0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324781a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f324782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f324783c;

    public /* synthetic */ a(c cVar, b bVar) {
        this.f324783c = cVar;
        this.f324782b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f324781a) {
            case 0:
                Amount sourceAmount = (Amount) obj2;
                Intrinsics.checkNotNullParameter(sourceAmount, "effectiveMaximum");
                xi0.b bVar = sourceAmount.f104718b.f104721c;
                c cVar = this.f324783c;
                if (Intrinsics.f(bVar, cVar.f299635b.i)) {
                    return zi0.c.i(sourceAmount);
                }
                su9.c cVar2 = this.f324782b.f324784a;
                n nVar = cVar.f299635b;
                xi0.b targetCurrency = nVar.i;
                SourcePocketWrapper sourcePocketWrapper = cVar.f299637g;
                Asset targetAsset = yoj.b.b(nVar);
                Intrinsics.checkNotNullParameter(sourceAmount, "sourceAmount");
                Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
                Intrinsics.checkNotNullParameter(sourcePocketWrapper, "sourcePocketWrapper");
                Intrinsics.checkNotNullParameter(targetAsset, "targetAsset");
                xi0.b bVar2 = sourceAmount.f104718b.f104721c;
                e eVar = e.MARKET;
                BigDecimal bigDecimal = sourceAmount.f104717a;
                f8l.b bVar3 = f8l.b.FROM;
                OrderQuoteParams orderQuoteParams = new OrderQuoteParams(bVar2, targetCurrency, eVar, bigDecimal, bVar3, bVar3, null, false, null, oc.c.J(sourcePocketWrapper), null, null, null, null, 15616);
                rcf.a aVarK = oc.c.K(sourcePocketWrapper);
                FiatExchangeOrderQuoteParams fiatExchangeOrderQuoteParams = new FiatExchangeOrderQuoteParams(orderQuoteParams, aVarK, targetAsset.f104719a == f8l.c.SECURITY ? targetAsset.f104721c.f306286a : null);
                int i = aVarK == null ? -1 : xrl.b.f308375a[aVarK.ordinal()];
                if (i != -1) {
                    if (i == 1) {
                        return nim.a.v(usc.a.f((usc.a) cVar2.f265693a, fiatExchangeOrderQuoteParams), new i0(29));
                    }
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return nim.a.v(o7.b.u((o7.b) cVar2.f265694b, orderQuoteParams), new xrl.a(0));
            default:
                Amount maximumInInstrumentCurrency = (Amount) obj2;
                Intrinsics.checkNotNullParameter(maximumInInstrumentCurrency, "maximumInInstrumentCurrency");
                b bVar4 = this.f324782b;
                bVar4.getClass();
                c cVar3 = this.f324783c;
                d dVar = new d(cVar3.f299638h.f, cVar3.f299635b.i);
                Intrinsics.checkNotNullParameter(dVar, "<this>");
                bVar4.e().getClass();
                Amount amountE = l4i.a.e(dVar);
                return a.a.e(amountE, maximumInInstrumentCurrency) < 0 ? amountE : maximumInInstrumentCurrency;
        }
    }

    public /* synthetic */ a(b bVar, c cVar) {
        this.f324782b = bVar;
        this.f324783c = cVar;
    }
}
