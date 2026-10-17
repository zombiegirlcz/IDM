package gug;

import ael.q0;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import ybl.k;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b f146936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f146937x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ TradingProductCode f146938y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar, String str, TradingProductCode tradingProductCode, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f146936w = bVar;
        this.f146937x = str;
        this.f146938y = tradingProductCode;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f146936w, this.f146937x, this.f146938y, continuation, 0);
            case 1:
                return new g(this.f146936w, this.f146937x, this.f146938y, continuation, 1);
            default:
                return new g(this.f146936w, this.f146937x, this.f146938y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    k kVar = this.f146936w.f94920q;
                    this.v = 1;
                    if (((q0) kVar).q(this.f146937x, this.f146938y, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar = this.f146936w;
                if (i2 == 0) {
                    o.b(obj2);
                    g gVar = new g(bVar, this.f146937x, this.f146938y, null, 0);
                    this.v = 1;
                    if (q.t(bVar, gVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                oki.h.D2(bVar.f94924w);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.wealth.account_closure.impl.ui.flows.account_closure.b bVar2 = this.f146936w;
                    g gVar2 = new g(bVar2, this.f146937x, this.f146938y, null, 1);
                    this.v = 1;
                    if (bVar2.p2(this, gVar2) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
