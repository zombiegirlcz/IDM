package r6g;

import cli.y;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreen;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$Child;
import com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.TravelFlightsPassengersPickerScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import ip0.u8;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r40.y0;
import vkm.j2;
import yhm.o;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TravelFlightsPassengersPickerScreen f251840w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f251840w = travelFlightsPassengersPickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f251840w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f251840w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            default:
                e eVar3 = new e(this.f251840w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        Object obj3 = null;
        TravelFlightsPassengersPickerScreen travelFlightsPassengersPickerScreen = this.f251840w;
        switch (i) {
            case 0:
                u8 model = (u8) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE3 = travelFlightsPassengersPickerScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar2 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a) jVarE3;
                y yVar = aVar2.f93386s;
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f166617a;
                if (Intrinsics.f(str, "ADULT_PASSENGERS_ITEM_ID")) {
                    if (((h) ((j2) yVar.f22677a).getValue()).f251841a < 9) {
                        aVar2.H2(yVar, new y0(24));
                    }
                } else if (!Intrinsics.f(str, "CHILD_PASSENGERS_ITEM_ID")) {
                    int i2 = jli.h.f175850a;
                } else if (((h) ((j2) yVar.f22677a).getValue()).f251842b.size() < 4) {
                    com.revolut.kompot.navigable.vc.modal.a aVar3 = aVar2.f93387t;
                    TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker.Companion companion = TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker.INSTANCE;
                    int iJ = v.j(((h) ((j2) yVar.f22677a).getValue()).f251842b);
                    companion.getClass();
                    oki.h.v2(aVar3, new TravelFlightsPassengersPickerScreenContract$ModalStep.ChildBirthDatePicker(iJ + 2, null), bottom_dialog);
                }
                break;
            case 1:
                u8 model2 = (u8) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE32 = travelFlightsPassengersPickerScreen.d();
                Intrinsics.h(model2);
                com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a aVar5 = (com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a) jVarE32;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                y yVar2 = aVar5.f93386s;
                h hVar = (h) ((j2) yVar2.f22677a).getValue();
                String str2 = model2.f166617a;
                if (Intrinsics.f(str2, "ADULT_PASSENGERS_ITEM_ID")) {
                    int i3 = hVar.f251841a;
                    List list = hVar.f251842b;
                    if (i3 > 1) {
                        if (i3 <= aVar5.I2(list)) {
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    Object objPrevious = listIterator.previous();
                                    if (((TravelFlightsPassengersPickerScreenContract$Child) objPrevious).a(aVar5.f93384q)) {
                                        obj3 = objPrevious;
                                    }
                                }
                            }
                            TravelFlightsPassengersPickerScreenContract$Child travelFlightsPassengersPickerScreenContract$Child = (TravelFlightsPassengersPickerScreenContract$Child) obj3;
                            if (travelFlightsPassengersPickerScreenContract$Child != null) {
                                oki.h.v2(aVar5.f93387t, new TravelFlightsPassengersPickerScreenContract$ModalStep.RemoveAdultForInfant(travelFlightsPassengersPickerScreenContract$Child), bottom_dialog);
                            }
                        } else {
                            aVar5.H2(yVar2, new y0(25));
                        }
                    }
                } else if (!Intrinsics.f(str2, "CHILD_PASSENGERS_ITEM_ID")) {
                    int i5 = jli.h.f175850a;
                } else if (hVar.f251842b.size() > 0) {
                    aVar5.H2(yVar2, new y0(26));
                }
                break;
            default:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                j jVarE33 = travelFlightsPassengersPickerScreen.d();
                Intrinsics.h(clickData);
                ((com.revolut.feature.travel.flights.impl.ui.screen.passengers_picker.a) jVarE33).getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Intrinsics.f(clickData.f275445a, "INFANT_FOOTNOTE_LEARN_MORE_CLICK_ID");
                break;
        }
        return Unit.f186387a;
    }
}
