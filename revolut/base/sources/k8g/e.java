package k8g;

import com.revolut.core.ui_kit.delegates.HeroBannerDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ TravelHotelTransfersHomeScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TravelHotelTransfersHomeScreen travelHotelTransfersHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.u = travelHotelTransfersHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((HeroBannerDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar2 = (com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) this.u.R2();
        aVar2.getClass();
        aVar2.C1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenLearnScreen(m1c.p.HOTELS_POINTS)));
        return Unit.f186387a;
    }
}
