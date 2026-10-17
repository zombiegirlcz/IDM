package aig;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.travel.miles.impl.ui.screen.home.TravelMilesHomeScreen;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ TravelMilesHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TravelMilesHomeScreen travelMilesHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelMilesHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.miles.impl.ui.screen.home.e eVar = (com.revolut.feature.travel.miles.impl.ui.screen.home.e) this.u.R2();
        eVar.getClass();
        eVar.C1(new BridgeDestination(gc0.c.f(new RevPointsFeatureConfig.RevPointsLearnConfig(m1c.p.MILES))));
        return Unit.f186387a;
    }
}
