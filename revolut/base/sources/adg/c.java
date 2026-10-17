package adg;

import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreen;
import com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.TravelHotelsGuestPickerScreenContract$ModalStep;
import com.revolut.feature_travel_hotels_models.property.search.Child;
import com.revolut.feature_travel_hotels_models.property.search.HotelsPropertyRoomOccupancy;
import com.revolut.kompot.common.ModalDestination;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TravelHotelsGuestPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = travelHotelsGuestPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TravelHotelsGuestPickerScreen travelHotelsGuestPickerScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a) travelHotelsGuestPickerScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a aVar3 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.picker.guest.a) travelHotelsGuestPickerScreen.d();
                List list = ((g) ((j2) aVar3.f93964r.f22677a).getValue()).f3344a;
                List list2 = list;
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    aVar3.l2(new ad4.c(aVar3, list, null, 2), new yi5.b(26));
                } else {
                    Iterator it8 = list2.iterator();
                    while (it8.hasNext()) {
                        List list3 = ((HotelsPropertyRoomOccupancy) it8.next()).f98128b;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator it9 = list3.iterator();
                            while (it9.hasNext()) {
                                if (((Child) it9.next()).f98125a == null) {
                                    oki.h.v2(aVar3.f93963q, TravelHotelsGuestPickerScreenContract$ModalStep.AgeRequiredWarningInfo.f93959a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                }
                            }
                        }
                    }
                    aVar3.l2(new ad4.c(aVar3, list, null, 2), new yi5.b(26));
                }
                break;
        }
        return Unit.f186387a;
    }
}
