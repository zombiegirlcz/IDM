package ytl;

import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuote;
import com.revolut.feature.trading_asset_quotes.api.domain.models.FiatExchangeOrderQuoteParams;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams;
import com.revolut.trading.orders.ui.invest.placement.models.FiatExchangeOrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.models.ProcessedInputAmount;
import f8l.e;
import gim.i;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import yo7.p;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f316841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f316841w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f316841w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c(this.f316841w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            default:
                c cVar3 = new c(this.f316841w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((FiatExchangeOrderQuoteParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((OrderQuoteParams) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((wtl.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        d dVar = this.f316841w;
        switch (i) {
            case 0:
                final FiatExchangeOrderQuoteParams fiatExchangeOrderQuoteParams = (FiatExchangeOrderQuoteParams) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                rcf.a aVar2 = fiatExchangeOrderQuoteParams.f91690b;
                int i2 = aVar2 == null ? -1 : b.f316840a[aVar2.ordinal()];
                final int i3 = 1;
                if (i2 != -1) {
                    if (i2 == 1) {
                        final int i5 = 0;
                        return nim.a.v(usc.a.f(dVar.f316843m, fiatExchangeOrderQuoteParams), new Function1() { // from class: ytl.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                switch (i5) {
                                    case 0:
                                        return new FiatExchangeOrderQuoteResult(fiatExchangeOrderQuoteParams, (FiatExchangeOrderQuote) obj3);
                                    default:
                                        return new FiatExchangeOrderQuoteResult(fiatExchangeOrderQuoteParams, new FiatExchangeOrderQuote(u.c((OrderQuote) obj3), null, f0.f322471a));
                                }
                            }
                        });
                    }
                    if (i2 != 2 && i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return nim.a.v(o7.b.u(dVar.f316842l, fiatExchangeOrderQuoteParams.f91689a), new Function1() { // from class: ytl.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        switch (i3) {
                            case 0:
                                return new FiatExchangeOrderQuoteResult(fiatExchangeOrderQuoteParams, (FiatExchangeOrderQuote) obj3);
                            default:
                                return new FiatExchangeOrderQuoteResult(fiatExchangeOrderQuoteParams, new FiatExchangeOrderQuote(u.c((OrderQuote) obj3), null, f0.f322471a));
                        }
                    }
                });
            case 1:
                OrderQuoteParams orderQuoteParams = (OrderQuoteParams) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return nim.a.v(o7.b.u(dVar.f316842l, orderQuoteParams), new p(orderQuoteParams, 26));
            default:
                wtl.c cVar = (wtl.c) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Amount amount = cVar.f300034a;
                xi0.b bVar = cVar.f300035b;
                Asset asset = amount.f104718b;
                if (asset.f104719a == f8l.c.SECURITY || Intrinsics.f(asset.f104721c, bVar)) {
                    return zi0.c.i(new ProcessedInputAmount.Original(amount));
                }
                xi0.b bVar2 = amount.f104718b.f104721c;
                e eVar = e.MARKET;
                BigDecimal bigDecimal = amount.f104717a;
                f8l.b bVar3 = f8l.b.FROM;
                OrderQuoteParams orderQuoteParams2 = new OrderQuoteParams(bVar2, bVar, eVar, bigDecimal, bVar3, bVar3, null, false, null, null, null, null, null, null, 15616);
                return nim.a.v(o7.b.u(dVar.f316842l, orderQuoteParams2), new yrk.e(amount, 2, dVar, orderQuoteParams2));
        }
    }
}
