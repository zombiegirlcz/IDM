package cul;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e1 extends gim.i implements Function2 {
    public final /* synthetic */ int u = 1;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.edit.e f109092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f109093x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f109092w = eVar;
        this.f109093x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e1 e1Var = new e1(this.f109093x, this.f109092w, continuation);
                e1Var.v = obj2;
                return e1Var;
            default:
                e1 e1Var2 = new e1(this.f109092w, this.f109093x, continuation);
                e1Var2.v = obj2;
                return e1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        OrderQuote orderQuote = (OrderQuote) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e1) create(orderQuote, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        boolean z = this.f109093x;
        com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar = this.f109092w;
        switch (i) {
            case 0:
                OrderQuote orderQuote = (OrderQuote) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Amount amountM = d9.e1.m(orderQuote);
                if (!z) {
                    return zi0.c.i(amountM);
                }
                ufm.i iVar = new ufm.i(((ael.t0) eVar.f106926r).e(), new aed.f(new aed.a(26), 5), 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                ufm.i iVar2 = new ufm.i(iVar, new aed.f(new aed.a(27), 6), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                efm.r rVarX = iVar2.x();
                Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
                return new d1(rd0.e.b(rVarX), eVar, amountM, 0);
            default:
                OrderQuote orderQuote2 = (OrderQuote) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Amount amountV = d9.e1.v(orderQuote2);
                bfl.g gVar = ((v) ((vkm.j2) eVar.m0.f22677a).getValue()).f109175a;
                if (!z || !v13.d.q(gVar)) {
                    return zi0.c.i(amountV);
                }
                ufm.i iVar3 = new ufm.i(((ael.t0) eVar.f106926r).e(), new aed.f(new aed.a(26), 5), 1);
                Intrinsics.checkNotNullExpressionValue(iVar3, "map(...)");
                ufm.i iVar4 = new ufm.i(iVar3, new aed.f(new aed.a(27), 6), 1);
                Intrinsics.checkNotNullExpressionValue(iVar4, "map(...)");
                efm.r rVarX2 = iVar4.x();
                Intrinsics.checkNotNullExpressionValue(rVarX2, "toObservable(...)");
                return new d1(rd0.e.b(rVarX2), eVar, amountV, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z, com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f109093x = z;
        this.f109092w = eVar;
    }
}
