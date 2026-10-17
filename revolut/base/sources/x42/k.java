package x42;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.time.date_picker.DatePickerBottomSheetController;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ TransferSettingsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransferSettingsScreen transferSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = transferSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) ((g) this.u.S.getValue());
        lVar.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.apm_transfer_amount_settings_field_expiry_dialog_title, null, null, 14);
        LocalDate localDate = ((a) ((j2) lVar.f302783p.f22677a).getValue()).f302774c;
        ApmTransferPayerSettings apmTransferPayerSettings = lVar.o.f62451a;
        lVar.f2(new DatePickerBottomSheetController(new DatePickerBottomSheetController.InputData((Clause) textLocalisedClause, localDate, apmTransferPayerSettings.d, apmTransferPayerSettings.e, false)), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new x0b.c(lVar, 15));
        return Unit.f186387a;
    }
}
