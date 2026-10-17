package oul;

import eq5.z0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.target_price.b f229888w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.trading.orders.ui.invest.placement.target_price.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f229888w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a0(this.f229888w, continuation, 0);
            case 1:
                return new a0(this.f229888w, continuation, 1);
            case 2:
                return new a0(this.f229888w, continuation, 2);
            default:
                return new a0(this.f229888w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (com.revolut.trading.orders.ui.invest.placement.target_price.b.I2(this.f229888w, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
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
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar = this.f229888w;
                z0 z0Var = new z0(bVar, null);
                this.v = 1;
                Object objB = pu7.a.B(bVar.k, "on_next_button_click", z0Var, this);
                return objB == aVar2 ? aVar2 : objB;
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
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar2 = this.f229888w;
                com.revolut.trading.orders.ui.invest.placement.target_price.a aVar4 = new com.revolut.trading.orders.ui.invest.placement.target_price.a(bVar2, null);
                this.v = 1;
                Object objB2 = pu7.a.B(bVar2.k, "on_tutorial_icon_click", aVar4, this);
                return objB2 == aVar3 ? aVar3 : objB2;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                com.revolut.trading.orders.ui.invest.placement.target_price.b bVar3 = this.f229888w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    bVar3.H2(bVar3.getState(), new ou6.o(8));
                    int i6 = 9;
                    njj.l lVar = new njj.l(new olf.e(bVar3.getState().B(new ou6.o(i6)), i6), i6);
                    this.v = 1;
                    if (vkm.q.x(lVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                bVar3.f107010t.S(true);
                return Unit.f186387a;
        }
    }
}
