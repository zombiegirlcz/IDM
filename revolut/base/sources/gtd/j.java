package gtd;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig;
import com.revolut.feature.spending_analytics.impl.ui.rev10.travel.TravelController;
import com.revolut.retail.core.navigation.FinishCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelController travelController, Continuation continuation) {
        super(2, continuation);
        this.v = travelController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        boolean zF = Intrinsics.f(model.f52373a, "ERROR_STATE_ID");
        TravelController travelController = this.v;
        if (zF) {
            travelController.d().v.k(Unit.f186387a);
        } else {
            travelController.d().o.f146598a.c(com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), u0.f(new AnalyticsFeatureConfig.Trips.Destination(null, null))));
        }
        return Unit.f186387a;
    }
}
