package fy6;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreen;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$ScheduleTab;
import com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.InvoicePaymentScheduleScreenContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ InvoicePaymentScheduleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(InvoicePaymentScheduleScreen invoicePaymentScheduleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = invoicePaymentScheduleScreen;
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FlowStep saleDateOptionPicker;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c cVar = (com.revolut.feature.freelancer.impl.ui.invoice.screen.payment_schedule.c) oVarE3;
        y yVar = cVar.v;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = cVar.u;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        switch (iHashCode) {
            case -2069426940:
                if (listId.equals("LIST_ID_LIMITS_INPUT_SELECTED_LIMIT_OPTION")) {
                    oki.h.v2(aVar2, InvoicePaymentScheduleScreenContract$Step.LimitOptionPicker.f73909a, bottom_dialog);
                }
                break;
            case -1109804659:
                if (listId.equals("ITEM_ID_SEND_DATE")) {
                    oki.h.v2(aVar2, new InvoicePaymentScheduleScreenContract$Step.IssueDatePicker(((i) ((j2) yVar.f22677a).getValue()).d), bottom_dialog);
                }
                break;
            case -722712827:
                if (listId.equals("LIST_ID_RECURRING_PERIOD_INPUT_TEXT_PERIOD")) {
                    oki.h.v2(aVar2, InvoicePaymentScheduleScreenContract$Step.RepeatPeriodPicker.f73911a, bottom_dialog);
                }
                break;
            case 80701698:
                if (listId.equals("ITEM_ID_NEXT_DATE")) {
                    oki.h.v2(aVar2, new InvoicePaymentScheduleScreenContract$Step.NextDatePicker(((i) ((j2) yVar.f22677a).getValue()).d), bottom_dialog);
                }
                break;
            case 845048454:
                if (listId.equals("ITEM_ID_SUPPLY_DATE")) {
                    InvoicePaymentScheduleScreenContract$ScheduleTab invoicePaymentScheduleScreenContract$ScheduleTab = ((i) ((j2) yVar.f22677a).getValue()).d;
                    if (Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab, InvoicePaymentScheduleScreenContract$ScheduleTab.OneTime.f73903a)) {
                        saleDateOptionPicker = new InvoicePaymentScheduleScreenContract$Step.SaleDatePicker(invoicePaymentScheduleScreenContract$ScheduleTab);
                    } else {
                        if (!Intrinsics.f(invoicePaymentScheduleScreenContract$ScheduleTab, InvoicePaymentScheduleScreenContract$ScheduleTab.Recurring.f73904a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        saleDateOptionPicker = new InvoicePaymentScheduleScreenContract$Step.SaleDateOptionPicker(invoicePaymentScheduleScreenContract$ScheduleTab);
                    }
                    oki.h.v2(aVar2, saleDateOptionPicker, bottom_dialog);
                }
                break;
            case 1227660977:
                if (listId.equals("ITEM_ID_DUE_DATE")) {
                    oki.h.v2(aVar2, new InvoicePaymentScheduleScreenContract$Step.DueDateOptionPicker(((i) ((j2) yVar.f22677a).getValue()).d), bottom_dialog);
                }
                break;
            case 1621674567:
                if (listId.equals("LIST_ID_LIMITS_INPUT_TEXT_DATE")) {
                    oki.h.v2(aVar2, new InvoicePaymentScheduleScreenContract$Step.EndDatePicker(((i) ((j2) yVar.f22677a).getValue()).d), bottom_dialog);
                }
                break;
        }
        return Unit.f186387a;
    }
}
