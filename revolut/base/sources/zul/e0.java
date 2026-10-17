package zul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.screens.investment_plan.projection.a f325526w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i, com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f325526w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e0(0, this.f325526w, continuation);
            default:
                return new e0(1, this.f325526w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar = this.f325526w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0Var = new d0(0, aVar, continuation);
                this.v = 1;
                x xVar = com.revolut.trading.orders.ui.screens.investment_plan.projection.a.Companion;
                Object objB = pu7.a.B(aVar.k, "on_next_button_click", d0Var, this);
                return objB == aVar2 ? aVar2 : objB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                d0 d0Var2 = new d0(i2, aVar, continuation);
                this.v = 1;
                x xVar2 = com.revolut.trading.orders.ui.screens.investment_plan.projection.a.Companion;
                Object objB2 = pu7.a.B(aVar.k, "on_slider_value_click", d0Var2, this);
                return objB2 == aVar3 ? aVar3 : objB2;
        }
    }
}
