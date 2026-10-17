package b94;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsController;
import com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DetailsInputForm;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DebtDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DebtDetailsController debtDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = debtDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        DetailsInputForm.DetailsInputField moneyField;
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        n nVarE3 = this.v.d();
        String listId = textData.f52597a;
        String text = textData.f52598b.toString();
        com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a aVar2 = (com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.a) nVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(text, "text");
        DetailsInputForm.DetailsInputField detailsInputFieldA = aVar2.I2().a(listId);
        if (detailsInputFieldA instanceof DetailsInputForm.DetailsInputField.TextField) {
            DetailsInputForm.DetailsInputField.TextField textField = (DetailsInputForm.DetailsInputField.TextField) detailsInputFieldA;
            String id10 = textField.f67486a;
            Clause label = textField.f67487b;
            Clause clause = textField.f67488c;
            Clause clause2 = textField.d;
            boolean z = textField.f;
            boolean z3 = textField.f67489g;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            moneyField = new DetailsInputForm.DetailsInputField.TextField(id10, label, clause, clause2, text, z, z3);
        } else {
            if (!(detailsInputFieldA instanceof DetailsInputForm.DetailsInputField.MoneyField)) {
                throw new IllegalStateException("invalid field");
            }
            DetailsInputForm.DetailsInputField.MoneyField moneyField2 = (DetailsInputForm.DetailsInputField.MoneyField) detailsInputFieldA;
            Long lValueOf = Long.valueOf(aVar2.u.b(text, moneyField2.f.f306286a));
            String id11 = moneyField2.f67481a;
            Clause label2 = moneyField2.f67482b;
            Clause clause3 = moneyField2.f67483c;
            Clause clause4 = moneyField2.d;
            xi0.b currency = moneyField2.f;
            boolean z4 = moneyField2.f67484g;
            boolean z6 = moneyField2.f67485h;
            Intrinsics.checkNotNullParameter(id11, "id");
            Intrinsics.checkNotNullParameter(label2, "label");
            Intrinsics.checkNotNullParameter(currency, "currency");
            moneyField = new DetailsInputForm.DetailsInputField.MoneyField(id11, label2, clause3, clause4, lValueOf, currency, z4, z6);
        }
        aVar2.K2(moneyField);
        return Unit.f186387a;
    }
}
