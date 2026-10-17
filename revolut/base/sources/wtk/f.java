package wtk;

import com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionDestination;
import com.revolut.feature.instruments.trend.collections.api.model.InstrumentsTrendCollectionId;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.FundamentalsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ FundamentalsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FundamentalsScreen fundamentalsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = fundamentalsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FundamentalsScreen fundamentalsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a) ((j) fundamentalsScreen.M.getValue())).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a aVar3 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.insights.fundamentals.a) ((j) fundamentalsScreen.M.getValue());
                aVar3.getClass();
                aVar3.C1(new InstrumentsTrendCollectionDestination(InstrumentsTrendCollectionId.RecommendedBuy.f74905a, null, ph7.c.RECOMMENDED_BUY));
                break;
        }
        return Unit.f186387a;
    }
}
