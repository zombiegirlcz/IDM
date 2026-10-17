package tch;

import com.revolut.feature.wealth.impl.data.network.recurring_orders.PortfolioRecurringOrdersService;
import com.revolut.retail.trading.core.domain.orders.PortfolioRecurringOrder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a f269832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ PortfolioRecurringOrder f269833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k4l.d0 f269834y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar, PortfolioRecurringOrder portfolioRecurringOrder, k4l.d0 d0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f269832w = aVar;
        this.f269833x = portfolioRecurringOrder;
        this.f269834y = d0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(this.f269832w, this.f269833x, this.f269834y, continuation, 0);
            default:
                return new i0(this.f269832w, this.f269833x, this.f269834y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.b bVarActivateRecurringOrder;
        switch (this.u) {
            case 0:
                t1j.b bVar = this.f269832w.f95641r;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                PortfolioRecurringOrder portfolioRecurringOrder = this.f269833x;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String orderId = portfolioRecurringOrder.f104649a;
                    String portfolioId = portfolioRecurringOrder.f104650b;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    k4l.d0 state = this.f269834y;
                    Intrinsics.checkNotNullParameter(state, "state");
                    r10.q qVar = (r10.q) bVar.f267380b;
                    Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                    Intrinsics.checkNotNullParameter(orderId, "orderId");
                    Intrinsics.checkNotNullParameter(state, "state");
                    PortfolioRecurringOrdersService portfolioRecurringOrdersService = (PortfolioRecurringOrdersService) qVar.f250849b;
                    int i2 = e8h.v.f123732a[state.ordinal()];
                    if (i2 == 1) {
                        bVarActivateRecurringOrder = portfolioRecurringOrdersService.activateRecurringOrder(orderId);
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVarActivateRecurringOrder = portfolioRecurringOrdersService.deactivateRecurringOrder(orderId);
                    }
                    pfm.a aVarE = bVarActivateRecurringOrder.e(((w4l.f) qVar.d).g(orderId, false)).e(((w4l.f) qVar.f250850c).g(portfolioId, false));
                    Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                    pfm.r rVarG0 = te0.w.g0(aVarE);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                String portfolioId2 = portfolioRecurringOrder.f104650b;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                r10.q qVar2 = (r10.q) bVar.f267380b;
                Intrinsics.checkNotNullParameter(portfolioId2, "portfolioId");
                efm.b bVarG = ((w4l.f) qVar2.f250850c).g(portfolioId2, false);
                this.v = 2;
                if (nim.a.a(bVarG, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.wealth.impl.ui.screens.recurring_transfer_details.a aVar3 = this.f269832w;
                    i0 i0Var = new i0(aVar3, this.f269833x, this.f269834y, null, 0);
                    this.v = 1;
                    if (aVar3.p2(this, i0Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
