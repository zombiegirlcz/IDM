package wg9;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterDropdownField;
import com.revolut.feature.apm.bills.core.api.model.form.RepeaterField;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.FormScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FormScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FormScreen formScreen, Continuation continuation) {
        super(2, continuation);
        this.v = formScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((ListSubheaderDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ListSubheaderDelegate.Model model = (ListSubheaderDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarE3 = this.v.d();
        Object obj3 = model.f52715m;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.apm.bills.core.api.model.form.BillFormFieldV2");
        BillFormFieldV2 field = (BillFormFieldV2) obj3;
        com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar2 = (com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a) mVarE3;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(field, "field");
        if (field instanceof RepeaterDropdownField) {
            ((jg9.s) aVar2.o).h3((RepeaterDropdownField) field, aVar2.J2(), new o(aVar2, 7));
        } else if (field instanceof RepeaterField) {
            aVar2.K2((RepeaterField) field, null, null);
        }
        return Unit.f186387a;
    }
}
