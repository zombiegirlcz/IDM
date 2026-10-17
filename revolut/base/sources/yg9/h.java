package yg9;

import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.AddressField;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.DateMonthField;
import com.revolut.feature.apm.bills.core.api.model.form.DateOfBirthField;
import com.revolut.feature.apm.bills.core.api.model.form.DateYearField;
import com.revolut.feature.apm.bills.core.api.model.form.DropdownField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreen;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreenContract$InputData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.SubformScreen;
import com.revolut.kompot.common.ModalDestination;
import jg9.q;
import jg9.s;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import y7k.g0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SubformScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SubformScreen subformScreen, Continuation continuation) {
        super(2, continuation);
        this.v = subformScreen;
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
        com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a aVar2 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a) mVarE3;
        y yVar = aVar2.f78740t;
        q qVar = aVar2.f78736p;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.P;
        BillFormFieldV2 billFormFieldV2 = obj3 instanceof BillFormFieldV2 ? (BillFormFieldV2) obj3 : null;
        if (billFormFieldV2 != null) {
            if (billFormFieldV2 instanceof AddressField) {
                AddressField addressField = (AddressField) billFormFieldV2;
                BillInputV2 billInputV2G = foh.i.g(addressField.f61352a, ((k) ((j2) yVar.f22677a).getValue()).f313584c);
                BillInputV2.BillInputAddress billInputAddress = billInputV2G instanceof BillInputV2.BillInputAddress ? (BillInputV2.BillInputAddress) billInputV2G : null;
                ((s) qVar).Z2(addressField, billInputAddress != null ? billInputAddress.d : null, new g0(aVar2, billFormFieldV2, 25));
            } else if (billFormFieldV2 instanceof DateOfBirthField) {
                DateOfBirthField dateOfBirthField = (DateOfBirthField) billFormFieldV2;
                BillInputV2 billInputV2G2 = foh.i.g(dateOfBirthField.f61373a, ((k) ((j2) yVar.f22677a).getValue()).f313584c);
                BillInputV2.BillInputText billInputText = billInputV2G2 instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G2 : null;
                ((s) qVar).c3(dateOfBirthField, billInputText != null ? billInputText.d : null, new o(aVar2, 7));
            } else if (billFormFieldV2 instanceof DateMonthField) {
                DateMonthField dateMonthField = (DateMonthField) billFormFieldV2;
                BillInputV2 billInputV2G3 = foh.i.g(dateMonthField.f61370a, ((k) ((j2) yVar.f22677a).getValue()).f313584c);
                BillInputV2.BillInputText billInputText2 = billInputV2G3 instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G3 : null;
                ((s) qVar).b3(dateMonthField, billInputText2 != null ? billInputText2.d : null, new o(aVar2, 8));
            } else {
                int i = 9;
                if (billFormFieldV2 instanceof DateYearField) {
                    DateYearField dateYearField = (DateYearField) billFormFieldV2;
                    BillInputV2 billInputV2G4 = foh.i.g(dateYearField.f61376a, ((k) ((j2) yVar.f22677a).getValue()).f313584c);
                    BillInputV2.BillInputText billInputText3 = billInputV2G4 instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G4 : null;
                    ((s) qVar).d3(dateYearField, billInputText3 != null ? billInputText3.d : null, new o(aVar2, 9));
                } else if (billFormFieldV2 instanceof DropdownField) {
                    DropdownField formField = (DropdownField) billFormFieldV2;
                    BillFormField.BillFormFieldAttributes billFormFieldAttributes = formField.d;
                    if ((billFormFieldAttributes != null ? billFormFieldAttributes.e : null) != null) {
                        o onResult = new o(aVar2, 2);
                        s sVar = (s) qVar;
                        sVar.getClass();
                        Intrinsics.checkNotNullParameter(formField, "formField");
                        Intrinsics.checkNotNullParameter(onResult, "onResult");
                        sVar.N2(new DropdownSearchableSelectionScreen(new DropdownSearchableSelectionScreenContract$InputData(formField)), ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a, new jeg.g(onResult, i));
                    } else {
                        ((s) qVar).e3(formField, new o(aVar2, 1));
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
