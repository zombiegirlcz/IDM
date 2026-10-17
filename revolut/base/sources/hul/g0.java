package hul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155718w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155718w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g0(this.f155718w, continuation, 0);
            case 1:
                return new g0(this.f155718w, continuation, 1);
            case 2:
                return new g0(this.f155718w, continuation, 2);
            case 3:
                return new g0(this.f155718w, continuation, 3);
            case 4:
                return new g0(this.f155718w, continuation, 4);
            case 5:
                return new g0(this.f155718w, continuation, 5);
            case 6:
                return new g0(this.f155718w, continuation, 6);
            case 7:
                return new g0(this.f155718w, continuation, 7);
            default:
                return new g0(this.f155718w, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = this.f155718w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.c cVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.c(oVar, null);
                this.v = 1;
                Object objB = pu7.a.B(oVar.k, "on_custody_fee_click", cVar, this);
                return objB == aVar ? aVar : objB;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar2 = this.f155718w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.d dVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.d(oVar2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(oVar2.k, "on_early_redemption_fee_click", dVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar3 = this.f155718w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.e eVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.e(oVar3, null);
                this.v = 1;
                Object objB3 = pu7.a.B(oVar3.k, "onExchangedHeaderClick", eVar, this);
                return objB3 == aVar3 ? aVar3 : objB3;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar4 = this.f155718w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.f fVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.f(oVar4, null);
                this.v = 1;
                Object objB4 = pu7.a.B(oVar4.k, "on_hard_lockup_click", fVar, this);
                return objB4 == aVar4 ? aVar4 : objB4;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar5 = this.f155718w;
                i0 i0Var = new i0(oVar5, null, 2);
                this.v = 1;
                Object objB5 = pu7.a.B(oVar5.k, "on_item_settlement_date_click", i0Var, this);
                return objB5 == aVar5 ? aVar5 : objB5;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar6 = this.f155718w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.i iVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.i(oVar6, null);
                this.v = 1;
                Object objB6 = pu7.a.B(oVar6.k, "on_large_order_warning_click", iVar, this);
                return objB6 == aVar6 ? aVar6 : objB6;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 != 0) {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar7 = this.f155718w;
                i0 i0Var2 = new i0(oVar7, null, 3);
                this.v = 1;
                Object objB7 = pu7.a.B(oVar7.k, "on_set_frequency_settings_click", i0Var2, this);
                return objB7 == aVar7 ? aVar7 : objB7;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 != 0) {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar8 = this.f155718w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.l lVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.l(oVar8, null);
                this.v = 1;
                Object objB8 = pu7.a.B(oVar8.k, "on_soft_lockup_click", lVar, this);
                return objB8 == aVar8 ? aVar8 : objB8;
            default:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 != 0) {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar9 = this.f155718w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.m mVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.m(oVar9, null);
                this.v = 1;
                Object objB9 = pu7.a.B(oVar9.k, "on_submit_order_button_click", mVar, this);
                return objB9 == aVar9 ? aVar9 : objB9;
        }
    }
}
