package djc;

import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RentAndBillsManageLinkedPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rentAndBillsManageLinkedPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CellDetailsChevronDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsChevronDelegate.Model model = (CellDetailsChevronDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        s sVarE3 = this.v.R2();
        Intrinsics.h(model);
        b0 b0Var = (b0) sVarE3;
        cli.y yVar = b0Var.f115296x;
        Intrinsics.checkNotNullParameter(model, "model");
        if (Intrinsics.f(model.f51822a, "SHOW_ALL_POINTS_ACTIVITY_CELL_ID")) {
            RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) ((i) ((j2) yVar.f22677a).getValue()).f115301c.getContent();
            List listC = rentAndBillsLinkedPayments != null ? bkc.c.c(rentAndBillsLinkedPayments, ((i) ((j2) yVar.f22677a).getValue()).f115299a) : null;
            if (listC == null) {
                listC = f0.f322471a;
            }
            if (!listC.isEmpty()) {
                b0Var.A1(new a0(b0Var, listC, null), new yi5.b(25));
            }
        }
        return Unit.f186387a;
    }
}
