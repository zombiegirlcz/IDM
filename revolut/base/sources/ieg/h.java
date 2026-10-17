package ieg;

import com.revolut.core.ui_kit.delegates.ExtraLargeListingCardDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreen;
import com.revolut.feature_travel_hotels_models.property.HotelsProperty;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomsSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ExtraLargeListingCardDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HotelsProperty hotelsProperty;
        ExtraLargeListingCardDelegate.Model model = (ExtraLargeListingCardDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) pVarE3;
        cli.y yVar = bVar.f94025y;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f52276m;
        fgi.a aVar2 = null;
        nag.b bVar2 = obj3 instanceof nag.b ? (nag.b) obj3 : null;
        if (bVar2 == null) {
            throw new UnsupportedOperationException();
        }
        afi.a aVar3 = (afi.a) ((m) ((j2) yVar.f22677a).getValue()).f160720a.getContent();
        if (aVar3 != null) {
            HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = bVar2.f213902a;
            int iH = (int) oc.c.h(aVar3.f4102c, aVar3.d);
            afi.a aVar4 = (afi.a) ((m) ((j2) yVar.f22677a).getValue()).f160720a.getContent();
            if (aVar4 != null && (hotelsProperty = aVar4.f4101b) != null) {
                aVar2 = hotelsProperty.u;
            }
            bVar.C2(new n(hotelsPropertyRoomOccupancyRatesSelection, iH, aVar2));
        }
        return Unit.f186387a;
    }
}
