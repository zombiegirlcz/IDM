package wbg;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.TravelHotelsCheckoutScreenContract$ModalStep;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment$Card;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsCheckoutScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(TravelHotelsCheckoutScreen travelHotelsCheckoutScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsCheckoutScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e0 e0Var = new e0(this.v, continuation);
        e0Var.u = obj2;
        return e0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e0) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s0 s0VarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) s0VarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52708a;
        if (Intrinsics.f(str, "TRAVELLER_INFO_SUBHEADER_ITEM_ID")) {
            aVar2.C2(new l0(aVar2.o.f93895a.f93650a));
        } else if (Intrinsics.f(str, "RESERVE_WITH_CARD_SUBHEADER_ITEM_ID")) {
            Object obj3 = model.f52715m;
            Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.model.PropertyPayment.Card");
            oki.h.v2(aVar2.P, new TravelHotelsCheckoutScreenContract$ModalStep.CardSelection((PropertyPayment$Card) obj3), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
