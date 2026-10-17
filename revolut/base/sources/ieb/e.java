package ieb;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.ReservationCreationScreenContract$ModalStep;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.datepicker.ReservationDatePickerContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.partysizepicker.PartySizePickerContract$InputData;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalTime;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import xdb.v;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ReservationCreationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ReservationCreationScreen reservationCreationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = reservationCreationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        v vVar;
        FlowStep partySizePicker;
        FlowStep timePicker;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a aVar2 = (com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) jVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        g gVar = (g) ((j2) aVar2.v.f22677a).getValue();
        i iVar = gVar.f160687g;
        if (iVar != null) {
            int iHashCode = listId.hashCode();
            if (iHashCode != -1129937369) {
                if (iHashCode != -701485605) {
                    if (iHashCode == -701001478 && listId.equals("reservation_creation_time")) {
                        List list = (List) gVar.d.getContent();
                        if (list == null) {
                            list = f0.f322471a;
                        }
                        if (!list.isEmpty()) {
                            LocalTime localTime = iVar.f160691b;
                            if (!list.contains(localTime)) {
                                localTime = null;
                            }
                            if (localTime == null) {
                                localTime = (LocalTime) d0.b0(list);
                            }
                            timePicker = new ReservationCreationScreenContract$ModalStep.TimePicker(new ReservationTimePickerContract$InputData(localTime, list));
                        }
                    }
                } else if (listId.equals("reservation_creation_date")) {
                    List list2 = (List) gVar.f160685b.getContent();
                    if (list2 == null) {
                        list2 = f0.f322471a;
                    }
                    if (!list2.isEmpty()) {
                        partySizePicker = new ReservationCreationScreenContract$ModalStep.DatePicker(new ReservationDatePickerContract$InputData(iVar.f160690a, list2));
                        timePicker = partySizePicker;
                    }
                }
            } else if (listId.equals("reservation_creation_party_size") && (vVar = (v) gVar.f160684a.getContent()) != null) {
                partySizePicker = new ReservationCreationScreenContract$ModalStep.PartySizePicker(new PartySizePickerContract$InputData(iVar.f160692c, vVar.e));
                timePicker = partySizePicker;
            }
            oki.h.v2(aVar2.u, timePicker, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
        return Unit.f186387a;
    }
}
