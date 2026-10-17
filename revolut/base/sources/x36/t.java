package x36;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f302682w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(y yVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f302682w = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new t(this.f302682w, continuation, 0);
            default:
                return new t(this.f302682w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((t) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    y yVar = this.f302682w;
                    wma.e eVar = new wma.e(1, yVar.f302690r, b46.c.class, "applyMaximumTradeAmount", "applyMaximumTradeAmount(Lcom/revolut/feature/defi/exchange/impl/ui/exchange_amount/model/DeFiExchangeOrderDraft;)Lcom/revolut/feature/defi/exchange/impl/ui/exchange_amount/model/DeFiExchangeOrderDraft;", 0, 12);
                    this.v = 1;
                    if (y.K2(yVar, eVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    y yVar2 = this.f302682w;
                    m mVar = new m(yVar2, 2);
                    this.v = 1;
                    if (y.K2(yVar2, mVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
