package kd3;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.cashback.impl.ui.pocket.details.CashbackPocketDetailsScreen;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CashbackPocketDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CashbackPocketDetailsScreen cashbackPocketDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = cashbackPocketDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarT2 = this.v.T2();
        Intrinsics.h(model);
        m mVar = (m) hVarT2;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51822a;
        if (Intrinsics.f(str, "ID_SEE_ALL_CASHBACK_ITEM")) {
            mVar.v2(new g(new YourCashbackFlowContract$Step.Home(false)));
        } else if (Intrinsics.f(str, "ID_GET_HELP")) {
            mVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("topic.earning-cashback-with-metal-plan", 2))));
        }
        return Unit.f186387a;
    }
}
