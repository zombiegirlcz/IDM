package wg9;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.AddressField;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.DateMonthField;
import com.revolut.feature.apm.bills.core.api.model.form.DateOfBirthField;
import com.revolut.feature.apm.bills.core.api.model.form.DateYearField;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FormScreen formScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.v, continuation);
        hVar.u = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((InputTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.Model model = (InputTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar2 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) mVarE3;
        y yVar = aVar2.v;
        jg9.q qVar = aVar2.o;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.P;
        BillFormFieldV2 billFormFieldV2 = obj3 instanceof BillFormFieldV2 ? (BillFormFieldV2) obj3 : null;
        if (billFormFieldV2 != null) {
            int i = 1;
            if (billFormFieldV2 instanceof AddressField) {
                AddressField addressField = (AddressField) billFormFieldV2;
                BillInputV2 billInputV2G = foh.i.g(addressField.f61352a, ((k) ((j2) yVar.f22677a).getValue()).f297250c);
                BillInputV2.BillInputAddress billInputAddress = billInputV2G instanceof BillInputV2.BillInputAddress ? (BillInputV2.BillInputAddress) billInputV2G : null;
                ((jg9.s) qVar).Z2(addressField, billInputAddress != null ? billInputAddress.d : null, new wg2.g(aVar2, billFormFieldV2, i));
            } else if (billFormFieldV2 instanceof DateOfBirthField) {
                DateOfBirthField dateOfBirthField = (DateOfBirthField) billFormFieldV2;
                BillInputV2 billInputV2G2 = foh.i.g(dateOfBirthField.f61373a, ((k) ((j2) yVar.f22677a).getValue()).f297250c);
                BillInputV2.BillInputText billInputText = billInputV2G2 instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G2 : null;
                ((jg9.s) qVar).c3(dateOfBirthField, billInputText != null ? billInputText.d : null, new o(aVar2, 8));
            } else if (billFormFieldV2 instanceof DateMonthField) {
                DateMonthField dateMonthField = (DateMonthField) billFormFieldV2;
                BillInputV2 billInputV2G3 = foh.i.g(dateMonthField.f61370a, ((k) ((j2) yVar.f22677a).getValue()).f297250c);
                BillInputV2.BillInputText billInputText2 = billInputV2G3 instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G3 : null;
                ((jg9.s) qVar).b3(dateMonthField, billInputText2 != null ? billInputText2.d : null, new o(aVar2, 9));
            } else if (billFormFieldV2 instanceof DateYearField) {
                DateYearField dateYearField = (DateYearField) billFormFieldV2;
                BillInputV2 billInputV2G4 = foh.i.g(dateYearField.f61376a, ((k) ((j2) yVar.f22677a).getValue()).f297250c);
                BillInputV2.BillInputText billInputText3 = billInputV2G4 instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G4 : null;
                ((jg9.s) qVar).d3(dateYearField, billInputText3 != null ? billInputText3.d : null, new o(aVar2, 0));
            } else if (billFormFieldV2 instanceof DropdownField) {
                ((jg9.s) qVar).e3((DropdownField) billFormFieldV2, new o(aVar2, 1));
            }
        }
        return Unit.f186387a;
    }
}
