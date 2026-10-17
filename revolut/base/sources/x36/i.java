package x36;

import com.revolut.feature.defi.exchange.impl.domain.model.DeFiSwapQuoteParams;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.DeFiExchangeAmountScreen;
import com.revolut.feature.defi.exchange.impl.ui.exchange_amount.model.DeFiExchangeOrderDraft;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ DeFiExchangeAmountScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(DeFiExchangeAmountScreen deFiExchangeAmountScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = deFiExchangeAmountScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.v, continuation, 0);
            case 1:
                return new i(this.v, continuation, 1);
            default:
                return new i(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DeFiSwapQuoteParams deFiSwapQuoteParamsL2;
        int i = this.u;
        DeFiExchangeAmountScreen deFiExchangeAmountScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((y) deFiExchangeAmountScreen.d()).B2();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar = (y) deFiExchangeAmountScreen.d();
                if (yVar.o.f71758c == wd6.e.SELL) {
                    yVar.n2(new r(yVar, null, 8), new whi.b(6));
                }
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                y yVar2 = (y) deFiExchangeAmountScreen.d();
                DeFiExchangeOrderDraft deFiExchangeOrderDraft = ((a) ((j2) yVar2.A.f22677a).getValue()).f302659a;
                if (deFiExchangeOrderDraft != null && deFiExchangeOrderDraft.f71766g != null) {
                    kyh.f fVar = deFiExchangeOrderDraft.f71763a.f71770c;
                    kyh.f fVar2 = deFiExchangeOrderDraft.f71764b.f71770c;
                    if (fVar == null) {
                        fVar = fVar2;
                    }
                    if (fVar == null && (deFiSwapQuoteParamsL2 = yVar2.L2(deFiExchangeOrderDraft)) != null) {
                        yVar2.C2(new b(deFiSwapQuoteParamsL2, deFiExchangeOrderDraft));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
