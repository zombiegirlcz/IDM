package d7j;

import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class r extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CommodityOrderEditScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CommodityOrderEditScreen commodityOrderEditScreen, Continuation continuation) {
        super(2, continuation);
        this.v = commodityOrderEditScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        r rVar = new r(this.v, continuation);
        rVar.u = obj2;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((nqi.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        nqi.a aVar = (nqi.a) this.u;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h0 h0VarF3 = this.v.R2();
        String formattedAmountInput = aVar.f218468b;
        com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g) h0VarF3;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(formattedAmountInput, "formattedAmountInput");
        MutableStateFlow mutableStateFlow = (MutableStateFlow) gVar.R.getValue();
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.h(value, formattedAmountInput));
        return Unit.f186387a;
    }
}
