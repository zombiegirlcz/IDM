package tch;

import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a f269827w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f269828x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar, y yVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f269827w = aVar;
        this.f269828x = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f269827w, this.f269828x, continuation, 0);
            default:
                return new g0(this.f269827w, this.f269828x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar = this.f269827w;
                t1j.b bVar = aVar.f95641r;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                y yVar = this.f269828x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    PortfolioRecurringOrder portfolioRecurringOrder = yVar.f269851a;
                    String orderId = portfolioRecurringOrder.f104649a;
                    String portfolioId = portfolioRecurringOrder.f104650b;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    r10.q qVar = (r10.q) bVar.f267380b;
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    pfm.a aVarE = ((PortfolioRecurringOrdersService) qVar.f250849b).deleteRecurringOrder(orderId).e(((w4l.f) qVar.f250850c).g(portfolioId, false)).e(new pfm.h(new a08.l(qVar, orderId, 22), 2));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    pfm.r rVarG0 = te0.w.g0(aVarE);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        aVar.C2(t.f269846a);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String portfolioId2 = yVar.f269851a.f104650b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                r10.q qVar2 = (r10.q) bVar.f267380b;
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                efm.b bVarG = ((w4l.f) qVar2.f250850c).g(portfolioId2, false);
                this.v = 2;
                if (nim.a.a(bVarG, this) == aVar2) {
                    return aVar2;
                }
                aVar.C2(t.f269846a);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar4 = this.f269827w;
                    g0 g0Var = new g0(aVar4, this.f269828x, null, 0);
                    this.v = 1;
                    if (aVar4.p2(this, g0Var) == aVar3) {
                        return aVar3;
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
