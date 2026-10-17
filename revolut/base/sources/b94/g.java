package b94;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DebtDetailsController debtDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = debtDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = model.f52519a;
        boolean z = model.f52521c;
        com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        DetailsInputForm.DetailsInputField detailsInputFieldA = aVar2.I2().a(listId);
        if (!(detailsInputFieldA instanceof DetailsInputForm.DetailsInputField.CheckboxField)) {
            throw new IllegalStateException("invalid field");
        }
        DetailsInputForm.DetailsInputField.CheckboxField checkboxField = (DetailsInputForm.DetailsInputField.CheckboxField) detailsInputFieldA;
        String id10 = checkboxField.f67475a;
        Clause label = checkboxField.f67476b;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        aVar2.K2(new DetailsInputForm.DetailsInputField.CheckboxField(label, id10, !z));
        return Unit.f186387a;
    }
}
