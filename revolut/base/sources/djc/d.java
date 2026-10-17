package djc;

import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.manage.RentAndBillsManageLinkedPaymentsScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RentAndBillsManageLinkedPaymentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rentAndBillsManageLinkedPaymentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CellDetailsDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsDelegate.Model model = (CellDetailsDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = model.f51832a;
        boolean zF = Intrinsics.f(str, "ALLOWANCE_CELL_DETAILS_ID");
        RentAndBillsManageLinkedPaymentsScreen rentAndBillsManageLinkedPaymentsScreen = this.v;
        if (zF) {
            b0 b0Var = (b0) rentAndBillsManageLinkedPaymentsScreen.R2();
            cli.y yVar = b0Var.f115296x;
            RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) ((i) ((j2) yVar.f22677a).getValue()).f115301c.getContent();
            if (rentAndBillsLinkedPayments != null) {
                Iterator it8 = bkc.c.b(rentAndBillsLinkedPayments, ((i) ((j2) yVar.f22677a).getValue()).f115299a).iterator();
                double d = 0.0d;
                while (it8.hasNext()) {
                    d += ((RentAndBillsLinkedPayments.Category.LinkedPayment) it8.next()).d;
                }
                b0Var.C2(new o(d));
            }
        } else if (Intrinsics.f(str, "EARN_RATE_CELL_DETAILS_ID")) {
            ((b0) rentAndBillsManageLinkedPaymentsScreen.R2()).C2(p.f115311a);
        }
        return Unit.f186387a;
    }
}
