package od3;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackProductScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CashbackProductScreen cashbackProductScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackProductScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g0 g0VarT2 = this.v.T2();
        Intrinsics.h(model);
        s0 s0Var = (s0) g0VarT2;
        s0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51822a;
        if (Intrinsics.f(str, "ID_BREAKDOWN_BY_CURRENCY")) {
            s0Var.v2(new p(YourCashbackFlowContract$Step.SplitByCurrency.f65710a));
        } else if (Intrinsics.f(str, "ID_GET_HELP")) {
            s0Var.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.earning-cashback-with-metal-plan", 2))));
        }
        return Unit.f186387a;
    }
}
