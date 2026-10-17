package hul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.trading.orders.ui.invest.placement.screens.review.o f155731w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f155732x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f155731w = oVar;
        this.f155732x = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h0(this.f155731w, this.f155732x, continuation, 0);
            default:
                return new h0(this.f155731w, this.f155732x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                Object obj3 = this.f155732x;
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar = this.f155731w;
                com.revolut.trading.orders.ui.invest.placement.screens.review.g gVar = new com.revolut.trading.orders.ui.invest.placement.screens.review.g(oVar, obj3, null);
                this.v = 1;
                Object objB = pu7.a.B(oVar.k, "on_item_exchange_fees_click", gVar, this);
                return objB == aVar ? aVar : objB;
            default:
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
                Object obj4 = this.f155732x;
                com.revolut.trading.orders.ui.invest.placement.screens.review.o oVar2 = this.f155731w;
                afa.u uVar = new afa.u(obj4, oVar2, null, 23);
                this.v = 1;
                Object objB2 = pu7.a.B(oVar2.k, "on_item_fee_click", uVar, this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
