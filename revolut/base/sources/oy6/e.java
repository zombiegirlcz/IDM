package oy6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.InvoiceRecurringSettingsScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.InvoiceRecurringSettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoiceRecurringSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoiceRecurringSettingsScreen invoiceRecurringSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoiceRecurringSettingsScreen;
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
        yhm.o.b(obj2);
        k kVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = ((com.revolut.feature.freelancer.impl.ui.invoice.settings.recurring_settings.a) kVarE3).f73937s;
        Intrinsics.checkNotNullParameter(listId, "listId");
        boolean zF = Intrinsics.f(listId, "LIST_ID_LIMITS_INPUT_SELECTED_LIMIT_OPTION");
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (zF) {
            oki.h.v2(aVar2, InvoiceRecurringSettingsScreenContract$ModalStep.Limit.f73932a, bottom_dialog);
        } else if (Intrinsics.f(listId, "LIST_ID_RECURRING_PERIOD_INPUT_TEXT_PERIOD")) {
            oki.h.v2(aVar2, InvoiceRecurringSettingsScreenContract$ModalStep.Period.f73933a, bottom_dialog);
        }
        return Unit.f186387a;
    }
}
