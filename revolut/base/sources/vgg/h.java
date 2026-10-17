package vgg;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreen;
import com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.TravelMilesAirlineDetailsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelMilesAirlineDetailsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelMilesAirlineDetailsScreen travelMilesAirlineDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelMilesAirlineDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        t tVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b bVar = (com.revolut.feature.travel.miles.impl.ui.screen.airlines.details.b) tVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (d0.J(str, "EXTRA_REDEEM_OPTIONS_ITEM_LIST_ID_", false)) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.miles.api.model.TravelMilesRedeemOption");
            TravelMilesRedeemOption travelMilesRedeemOption = (TravelMilesRedeemOption) obj3;
            if (!travelMilesRedeemOption.e.isEmpty()) {
                oki.h.v2(bVar.f94278x, new TravelMilesAirlineDetailsScreenContract$ModalStep.RedeemOptionBottomSheet(travelMilesRedeemOption), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        } else if (d0.J(str, "YOUR_GIFT_CARDS_USER_VOUCHER_PREFIX_LIST_ID", false)) {
            Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.String");
            bVar.C1(new RevPointsGiftcardsDestination(new RevPointsGiftcardsDestination.StartType.OpenGiftcardsDetails(null, (String) obj3, null, null, 13), TransitionAnimation.SLIDE_END_TO_START.f98395a));
        }
        return Unit.f186387a;
    }
}
