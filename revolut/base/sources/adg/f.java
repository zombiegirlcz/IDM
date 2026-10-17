package adg;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$ChildAgePayload;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$ModalStep;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.kompot.common.ModalDestination;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TravelHotelsGuestPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = travelHotelsGuestPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j jVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a aVar2 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.f51787l;
        Child child = null;
        TravelHotelsGuestPickerScreenContract$ChildAgePayload travelHotelsGuestPickerScreenContract$ChildAgePayload = obj3 instanceof TravelHotelsGuestPickerScreenContract$ChildAgePayload ? (TravelHotelsGuestPickerScreenContract$ChildAgePayload) obj3 : null;
        if (travelHotelsGuestPickerScreenContract$ChildAgePayload != null) {
            HotelsPropertyRoomOccupancy hotelsPropertyRoomOccupancy = (HotelsPropertyRoomOccupancy) d0.e0(travelHotelsGuestPickerScreenContract$ChildAgePayload.f93956a, ((g) ((j2) aVar2.f93964r.f22677a).getValue()).f3344a);
            if (hotelsPropertyRoomOccupancy != null && (list = hotelsPropertyRoomOccupancy.f98128b) != null) {
                child = (Child) d0.e0(travelHotelsGuestPickerScreenContract$ChildAgePayload.f93957b, list);
            }
            if (child != null) {
                oki.h.v2(aVar2.f93963q, new TravelHotelsGuestPickerScreenContract$ModalStep.ChildAgePicker(travelHotelsGuestPickerScreenContract$ChildAgePayload, child.f98125a), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            }
        }
        return Unit.f186387a;
    }
}
