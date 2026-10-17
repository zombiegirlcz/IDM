package zul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.t0;

/* JADX INFO: loaded from: classes12.dex */
public final class d0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.screens.investment_plan.projection.a f325524w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f325524w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d0(0, this.f325524w, continuation);
            default:
                return new d0(1, this.f325524w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 27;
        com.revolut.trading.orders.ui.screens.investment_plan.projection.a aVar = this.f325524w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = vkm.q.x(new t0(aVar.C.B(new zr2.o(i2)), 1), this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                o oVar = new o((dj0.d) obj2);
                x xVar = com.revolut.trading.orders.ui.screens.investment_plan.projection.a.Companion;
                aVar.C2(oVar);
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    obj2 = vkm.q.x(new t0(aVar.C.B(new zr2.o(i2)), 1), this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                o oVar2 = new o((dj0.d) obj2);
                x xVar2 = com.revolut.trading.orders.ui.screens.investment_plan.projection.a.Companion;
                aVar.C2(oVar2);
                return Unit.f186387a;
        }
    }
}
