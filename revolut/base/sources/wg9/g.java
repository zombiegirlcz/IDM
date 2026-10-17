package wg9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.bills.core.api.model.BillInputV2;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.ChoiceV2;
import com.revolut.feature.apm.bills.core.api.model.form.FormNameField;
import com.revolut.feature.apm.bills.core.api.model.form.NestedItemField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.BillFormFieldControllerModelExtensionV2$BillData;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import vkm.j2;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FormScreen formScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Intrinsics.h(model);
        com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar2 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) mVarE3;
        jg9.q qVar = aVar2.o;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        String str = model.f53228a;
        Object obj4 = null;
        BillFormFieldV2 billFormFieldV2 = obj3 instanceof BillFormFieldV2 ? (BillFormFieldV2) obj3 : null;
        if (billFormFieldV2 != null) {
            if (billFormFieldV2 instanceof FormNameField) {
                FormNameField formNameField = (FormNameField) billFormFieldV2;
                BillInputV2 billInputV2G = foh.i.g(formNameField.f61385a, ((k) ((j2) aVar2.v.f22677a).getValue()).f297250c);
                BillInputV2.BillInputText billInputText = billInputV2G instanceof BillInputV2.BillInputText ? (BillInputV2.BillInputText) billInputV2G : null;
                ((jg9.s) qVar).f3(formNameField, billInputText != null ? billInputText.d : null, new o(aVar2, 4));
            } else if (billFormFieldV2 instanceof NestedItemField) {
                ((jg9.s) qVar).g3((NestedItemField) billFormFieldV2, aVar2.J2(), new o(aVar2, 5));
            } else if (billFormFieldV2 instanceof RepeaterField) {
                if (a0.H(str, "REPEATER_ID_", false)) {
                    aVar2.K2((RepeaterField) billFormFieldV2, d0.e0(str, "REPEATER_ID_"), model.f53230c);
                } else {
                    aVar2.K2((RepeaterField) billFormFieldV2, null, null);
                }
            } else if (billFormFieldV2 instanceof RepeaterDropdownField) {
                if (a0.H(str, "REPEATER_DROPDOWN_ID_", false)) {
                    RepeaterDropdownField repeaterDropdownField = (RepeaterDropdownField) billFormFieldV2;
                    String strE0 = d0.e0(str, "REPEATER_DROPDOWN_ID_");
                    Iterator it8 = repeaterDropdownField.f.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (Intrinsics.f(((ChoiceV2) next).f61366a, strE0)) {
                            obj4 = next;
                            break;
                        }
                    }
                    ChoiceV2 choice = (ChoiceV2) obj4;
                    if (choice != null) {
                        BillFormFieldControllerModelExtensionV2$BillData billData = aVar2.J2();
                        String parentName = repeaterDropdownField.f61409a;
                        o onResult = new o(aVar2, 2);
                        jg9.s sVar = (jg9.s) qVar;
                        sVar.getClass();
                        Intrinsics.checkNotNullParameter(choice, "choice");
                        Intrinsics.checkNotNullParameter(billData, "billData");
                        Intrinsics.checkNotNullParameter(parentName, "parentName");
                        Intrinsics.checkNotNullParameter(onResult, "onResult");
                        sVar.j3(choice, billData, parentName, true, onResult);
                    }
                } else {
                    ((jg9.s) aVar2.o).h3((RepeaterDropdownField) billFormFieldV2, aVar2.J2(), new o(aVar2, 7));
                }
            }
        }
        return Unit.f186387a;
    }
}
