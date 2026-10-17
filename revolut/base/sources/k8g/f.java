package k8g;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.rev_points.api.navigation.RevPointsFlowDestination;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelTransfersHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelHotelTransfersHomeScreen travelHotelTransfersHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelTransfersHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar2 = (com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        if (Intrinsics.f(str, "AGENTS_SEE_ALL_BUTTON_ITEM_ID")) {
            aVar2.H2(aVar2.f93611w, new k7c.d(24));
        } else if (Intrinsics.f(str, "TRANSACTIONS_SEE_ALL_BUTTON_ITEM_ID")) {
            aVar2.F1(new RevPointsFlowDestination(new RevPointsFlowDestination.StartType.OpenTransactionList(new RevPointsTransactionPageParams(0, null, null, null, f1.HOTELS_POINTS, null, null, null, null, 495), new RevPointsFlowDestination.StartType.OpenTransactionList.UiOverrides(null, null, 13))));
        }
        return Unit.f186387a;
    }
}
