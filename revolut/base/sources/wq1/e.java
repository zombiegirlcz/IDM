package wq1;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bills.pagopa.api.R$string;
import com.revolut.feature.apm.bills.pagopa.impl.ui.bill_input.PagoPABillInputScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rp0.t;
import rp0.y;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PagoPABillInputScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(PagoPABillInputScreen pagoPABillInputScreen, Continuation continuation) {
        super(2, continuation);
        this.v = pagoPABillInputScreen;
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
        l lVarT2 = this.v.T2();
        String listId = model.f52580a;
        q qVar = (q) lVarT2;
        xq1.a aVar2 = qVar.f299398w;
        j60.a aVar3 = qVar.v;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "BILL_TYPE_LIST_ID")) {
            h selectedType = ((i) qVar.t2()).f299389a;
            ((xq1.b) aVar2).getClass();
            Intrinsics.checkNotNullParameter(selectedType, "selectedType");
            aVar3.x(new y(v.k(new SingleChoiceDelegate.Model("CHOICE_NOTICE_NUMBER_LIST_ID", new CompositeClause(v.k(new TextLocalisedClause(R$string.pago_pa_choose_option_notice, null, null, 14), new TextLocalisedClause(R$string.pago_pa_bill_type_picker_notice_auxiliary_title, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12), selectedType == h.NOTICE, null, null, 2040), new SingleChoiceDelegate.Model("CHOICE_VEHICLE_LIST_ID", new CompositeClause(v.k(new TextLocalisedClause(R$string.pago_pa_choose_option_vehicle, null, null, 14), new TextLocalisedClause(R$string.pago_pa_bill_type_picker_vehicle_auxiliary_title, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12), selectedType == h.VEHICLE, null, null, 2040)), new t(new TextLocalisedClause(R$string.pago_pa_bill_type_picker_title, null, null, 14), null, null, 30), null, null, null, null, 1020));
        } else if (Intrinsics.f(listId, "VEHICLE_TYPE_LIST_ID")) {
            mq1.a aVar4 = ((i) qVar.t2()).f299390b.f299388c;
            ((xq1.b) aVar2).getClass();
            aVar3.x(new y(v.k(new SingleChoiceDelegate.Model("CHOICE_CAR_LIST_ID", new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_car, null, null, 14), aVar4 == mq1.a.CAR, null, null, 2040), new SingleChoiceDelegate.Model("CHOICE_MOTORCYCLE_LIST_ID", new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_motorcycle, null, null, 14), aVar4 == mq1.a.MOTORCYCLE, null, null, 2040), new SingleChoiceDelegate.Model("CHOICE_TRAILER_LIST_ID", new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_trailer, null, null, 14), aVar4 == mq1.a.TRAILER, null, null, 2040)), new t(new TextLocalisedClause(R$string.pago_pa_vehicle_type_picker_title, null, null, 14), null, null, 30), null, null, null, null, 1020));
        }
        return Unit.f186387a;
    }
}
