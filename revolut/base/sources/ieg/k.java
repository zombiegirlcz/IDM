package ieg;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomsSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(item);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) pVarE3;
        xag.g gVar = bVar.u;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f58316a;
        switch (str.hashCode()) {
            case -1704324088:
                if (str.equals("AMENITIES_QUICK_FILTER_ID")) {
                    oki.h.v2(bVar.z, TravelHotelsRoomsSelectionScreenContract$ModalStep.Amenities.f94016a, ModalDestination.Style.POPUP.f98311a);
                }
                break;
            case -980865785:
                if (str.equals("FREE_CANCELLATION_QUICK_FILTER_ID")) {
                    gVar.b(new id8.a(21));
                }
                break;
            case 1199640780:
                if (str.equals("BREAKFAST_QUICK_FILTER_ID")) {
                    Object obj3 = item.f58324n;
                    Intrinsics.i(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                    gVar.b(new g7b.q(bVar, ((Boolean) obj3).booleanValue(), 22));
                }
                break;
            case 1479356475:
                if (str.equals("PAY_AT_PROPERTY_QUICK_FILTER_ID")) {
                    gVar.b(new id8.a(22));
                }
                break;
        }
        return Unit.f186387a;
    }
}
