package g1i;

import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0 f139646w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExchangeOrderDraft f139647x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(l0 l0Var, ExchangeOrderDraft exchangeOrderDraft, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f139646w = l0Var;
        this.f139647x = exchangeOrderDraft;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k0(this.f139646w, this.f139647x, continuation, 0);
            default:
                return new k0(this.f139646w, this.f139647x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
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
                jx0.a aVar2 = this.f139646w.f139653h;
                ExchangeOrderDraft exchangeOrderDraft = this.f139647x;
                jhi.b bVarO = aVar2.o(new Pair(exchangeOrderDraft.f96879a.f96897a, exchangeOrderDraft.f96880b.f96897a));
                this.v = 1;
                Object objX = vkm.q.x(bVarO, this);
                return objX == aVar ? aVar : objX;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                jx0.a aVar4 = this.f139646w.f139653h;
                ExchangeOrderDraft exchangeOrderDraft2 = this.f139647x;
                jhi.b bVarP = aVar4.p(new Pair(exchangeOrderDraft2.f96879a.f96897a, exchangeOrderDraft2.f96880b.f96897a));
                this.v = 1;
                Object objX2 = vkm.q.x(bVarP, this);
                return objX2 == aVar3 ? aVar3 : objX2;
        }
    }
}
