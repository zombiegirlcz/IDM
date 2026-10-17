package b77;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.giro.api.R$string;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreen;
import com.revolut.feature.giro.impl.ui.form.DirectDebitFormScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDebitFormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DirectDebitFormScreen directDebitFormScreen, Continuation continuation) {
        super(2, continuation);
        this.v = directDebitFormScreen;
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
        j jVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.giro.impl.ui.form.b bVar = (com.revolut.feature.giro.impl.ui.form.b) jVarE3;
        y yVar = bVar.f74552t;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = bVar.u;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (iHashCode != -178682026) {
            if (iHashCode != 273435439) {
                if (iHashCode == 1805121534 && listId.equals("ID_CREDITOR_SELECTOR")) {
                    oki.h.v2(aVar2, DirectDebitFormScreenContract$ModalStep.CreditorSelector.f74543a, ModalDestination.Style.POPUP.f98311a);
                }
            } else if (listId.equals("ID_START_DATE")) {
                oki.h.v2(aVar2, new DirectDebitFormScreenContract$ModalStep.DateSelection("ID_START_DATE", R$string.giro_direct_debits_add_direct_debit_form_label_start_date, bVar.I2(), ((h) ((j2) yVar.f22677a).getValue()).f12923b.f74555c), bottom_dialog);
            }
        } else if (listId.equals("ID_END_DATE")) {
            LocalDate localDatePlusDays = ((h) ((j2) yVar.f22677a).getValue()).f12923b.f74555c.plusDays(1L);
            int i = R$string.giro_direct_debits_add_direct_debit_form_label_end_date;
            Intrinsics.h(localDatePlusDays);
            LocalDate localDate = ((h) ((j2) yVar.f22677a).getValue()).f12923b.d;
            if (localDate == null) {
                localDate = localDatePlusDays;
            }
            oki.h.v2(aVar2, new DirectDebitFormScreenContract$ModalStep.DateSelection("ID_END_DATE", i, localDatePlusDays, localDate), bottom_dialog);
        }
        return Unit.f186387a;
    }
}
