package n47;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreen;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$DomainState;
import com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.TaxHubTransactionExportPeriodPickerScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TaxHubTransactionExportPeriodPickerScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TaxHubTransactionExportPeriodPickerScreen taxHubTransactionExportPeriodPickerScreen, Continuation continuation) {
        super(2, continuation);
        this.v = taxHubTransactionExportPeriodPickerScreen;
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
        j jVar;
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = model.f52580a;
        com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f fVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.f) lVarE3;
        com.revolut.kompot.navigable.vc.modal.a aVar2 = fVar.f74423w;
        Intrinsics.checkNotNullParameter(listId, "listId");
        y yVar = fVar.v;
        i iVar = ((TaxHubTransactionExportPeriodPickerScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f74403b;
        f fVar2 = (f) ((TaxHubTransactionExportPeriodPickerScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f74402a.getContent();
        if (!(iVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e)) {
            throw new IllegalArgumentException("If not Selected, the content won't render with input text delegate.");
        }
        if (fVar2 == null) {
            throw new IllegalArgumentException("If null, the content won't render with input text delegate.");
        }
        int iHashCode = listId.hashCode();
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        if (iHashCode != -1697196972) {
            if (iHashCode != 1137897893) {
                if (iHashCode == 1949540059 && listId.equals("LIST_ID_INPUT_TEXT_PERIOD")) {
                    com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e eVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e) iVar;
                    if (eVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.a) {
                        jVar = j.ALL_TIME;
                    } else if (eVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.b) {
                        jVar = j.CUSTOM;
                    } else if (eVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.c) {
                        jVar = j.MONTH;
                    } else {
                        if (!(eVar instanceof com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        jVar = j.TAX_YEAR;
                    }
                    oki.h.v2(aVar2, new TaxHubTransactionExportPeriodPickerScreenContract$ModalStep.PeriodPicker(jVar), bottom_dialog);
                }
            } else if (listId.equals("LIST_ID_INPUT_TEXT_PERIOD_CUSTOM_TO")) {
                oki.h.v2(aVar2, new TaxHubTransactionExportPeriodPickerScreenContract$ModalStep.DatePickerTo(((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e) iVar).a(), ((l80.f) fVar.o).e()), bottom_dialog);
            }
        } else if (listId.equals("LIST_ID_INPUT_TEXT_PERIOD_CUSTOM_FROM")) {
            oki.h.v2(aVar2, new TaxHubTransactionExportPeriodPickerScreenContract$ModalStep.DatePickerFrom(((com.revolut.feature.freelancer.impl.ui.tax_hub.transaction_export.period_picker.e) iVar).a(), fVar2.f212314b), bottom_dialog);
        }
        return Unit.f186387a;
    }
}
