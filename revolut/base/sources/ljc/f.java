package ljc;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.rewards.api.model.rent_and_bills.RentAndBillsLinkedPayments;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.select_payment.RentAndBillsSelectPaymentScreen;
import e8e.t;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ RentAndBillsSelectPaymentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RentAndBillsSelectPaymentScreen rentAndBillsSelectPaymentScreen, Continuation continuation) {
        super(2, continuation);
        this.v = rentAndBillsSelectPaymentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.k;
        qua.p pVar = null;
        Object obj4 = null;
        qua.p pVar2 = obj3 instanceof qua.p ? (qua.p) obj3 : null;
        if (pVar2 != null) {
            k kVarE3 = this.v.d();
            String paymentId = pVar2.f249314a.f160150a;
            r rVar = (r) kVarE3;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(paymentId, "paymentId");
            y yVar = rVar.v;
            RentAndBillsLinkedPayments rentAndBillsLinkedPayments = (RentAndBillsLinkedPayments) ((g) ((j2) yVar.f22677a).getValue()).f195624c.getContent();
            Set setA = rentAndBillsLinkedPayments != null ? bkc.c.a(rentAndBillsLinkedPayments) : null;
            if (setA == null) {
                setA = h0.f322473a;
            }
            if (!setA.contains(paymentId)) {
                List list = (List) ((g) ((j2) yVar.f22677a).getValue()).f195623b.getContent();
                if (list != null) {
                    Iterator it8 = list.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        Object next = it8.next();
                        if (Intrinsics.f(((qua.p) next).f249314a.f160150a, paymentId)) {
                            obj4 = next;
                            break;
                        }
                    }
                    pVar = (qua.p) obj4;
                }
                rVar.H2(yVar, new t(pVar, 2));
            }
        }
        return Unit.f186387a;
    }
}
