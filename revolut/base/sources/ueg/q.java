package ueg;

import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.TravelHotelsSearchResultsMapScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class q extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsSearchResultsMapScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(TravelHotelsSearchResultsMapScreen travelHotelsSearchResultsMapScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsSearchResultsMapScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        q qVar = new q(this.v, continuation);
        qVar.u = obj2;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((TextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TextDelegate.Model model = (TextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        f0 f0VarR2 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.b) f0VarR2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        bVar.C1(new BridgeDestination(new FeatureCommand(new FaqFeatureConfig.Starter("question.how-are-properties-sorted", 2))));
        return Unit.f186387a;
    }
}
