package k8g;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreen;
import com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.TravelHotelTransfersHomeScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelTransfersHomeScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TravelHotelTransfersHomeScreen travelHotelTransfersHomeScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelTransfersHomeScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((vh) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vh clickData = (vh) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.R2();
        Intrinsics.h(clickData);
        com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a aVar2 = (com.revolut.feature.travel.hotel.transfers.impl.ui.screen.home.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj3 = ((RowDelegate.Model) clickData.f54884b).u;
        u2f.d dVar = obj3 instanceof u2f.d ? (u2f.d) obj3 : null;
        if (dVar != null) {
            oki.h.v2(aVar2.f93612x, new TravelHotelTransfersHomeScreenContract$ModalStep.UnlinkAccount(dVar.f276617a, dVar.d), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
