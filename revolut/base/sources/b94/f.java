package b94;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsControllerContract$ModalStep;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(DebtDetailsController debtDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = debtDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f52580a;
        com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        DetailsInputForm.DetailsInputField detailsInputFieldA = aVar2.I2().a(listId);
        if (detailsInputFieldA instanceof DetailsInputForm.DetailsInputField.DropdownField) {
            DetailsInputForm.DetailsInputField.DropdownField dropdownField = (DetailsInputForm.DetailsInputField.DropdownField) detailsInputFieldA;
            oki.h.v2(aVar2.f67495w, new DebtDetailsControllerContract$ModalStep.ValuePicker(dropdownField, d0.g0(dropdownField.f67480c, dropdownField.d)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            int i = jli.h.f175850a;
        }
        return Unit.f186387a;
    }
}
