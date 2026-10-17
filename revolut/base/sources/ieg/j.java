package ieg;

import aqd.o1;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.TravelHotelsRoomsSelectionScreen;
import com.revolut.feature_travel_hotels_models.property.room.HotelsPropertyRoomOccupancyRatesSelection;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsRoomsSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TravelHotelsRoomsSelectionScreen travelHotelsRoomsSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsRoomsSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        p pVarE3 = this.v.R2();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b) pVarE3;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f;
        nag.b bVar2 = obj3 instanceof nag.b ? (nag.b) obj3 : null;
        if (bVar2 == null) {
            throw new UnsupportedOperationException();
        }
        HotelsPropertyRoomOccupancyRatesSelection hotelsPropertyRoomOccupancyRatesSelection = bVar2.f213902a;
        int i = bVar2.f213903b;
        cli.y yVar = bVar.f94025y;
        Map map = ((m) ((j2) yVar.f22677a).getValue()).f160722c;
        bVar.H2(yVar, new o1(i == 0 ? r0.l(hotelsPropertyRoomOccupancyRatesSelection, map) : map.containsKey(hotelsPropertyRoomOccupancyRatesSelection) ? foh.i.w(hotelsPropertyRoomOccupancyRatesSelection, Integer.valueOf(i), map) : r0.q(map, new Pair(hotelsPropertyRoomOccupancyRatesSelection, Integer.valueOf(i))), 6));
        j60.a.v(bVar.f94022t, false, null, 3);
        return Unit.f186387a;
    }
}
