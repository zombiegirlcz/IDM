package sy6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.InvoiceScheduleSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.InvoiceScheduleSettingsScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceScheduleSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoiceScheduleSettingsScreen invoiceScheduleSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceScheduleSettingsScreen;
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
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.freelancer.impl.ui.invoice.settings.schedule.a) gVarE3).f73942q;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (iHashCode != -1867292732) {
            if (iHashCode != 886143837) {
                if (iHashCode == 1485454938 && listId.equals("ITEM_ID_SETTINGS_SUPPLY_DATE")) {
                    oki.h.v2(aVar2, InvoiceScheduleSettingsScreenContract$Step.SupplyDatePicker.f73940a, bottom_dialog);
                }
            } else if (listId.equals("ITEM_ID_SETTINGS_DUE_DATE")) {
                oki.h.v2(aVar2, InvoiceScheduleSettingsScreenContract$Step.DueDatePicker.f73938a, bottom_dialog);
            }
        } else if (listId.equals("ITEM_ID_SETTINGS_INVOICE_DATE")) {
            oki.h.v2(aVar2, InvoiceScheduleSettingsScreenContract$Step.IssueDatePicker.f73939a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
