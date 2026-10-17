package l7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f192687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExchangeOrderDraft f192688x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(z zVar, ExchangeOrderDraft exchangeOrderDraft, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f192687w = zVar;
        this.f192688x = exchangeOrderDraft;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f192687w, this.f192688x, continuation, 0);
            default:
                return new r(this.f192687w, this.f192688x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
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
                com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.exchange_action.a aVar2 = this.f192687w.u;
                this.v = 1;
                aVar2.getClass();
                ExchangeOrderDraft exchangeOrderDraft = this.f192688x;
                int i2 = h7j.a.f149898a[exchangeOrderDraft.e.ordinal()];
                if (i2 == 1) {
                    objA = aVar2.a(exchangeOrderDraft, this);
                } else if (i2 == 2 || i2 == 3) {
                    objA = aVar2.c(exchangeOrderDraft, this);
                } else {
                    if (i2 != 4) {
                        throw new IllegalStateException("Unsupported order type " + exchangeOrderDraft.e);
                    }
                    objA = aVar2.b(exchangeOrderDraft, this);
                }
                return objA == aVar ? aVar : objA;
            default:
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
                z zVar = this.f192687w;
                r rVar = new r(zVar, this.f192688x, null, 0);
                this.v = 1;
                Object objF0 = ue8.c.f0(zVar, rVar, this);
                return objF0 == aVar3 ? aVar3 : objF0;
        }
    }
}
