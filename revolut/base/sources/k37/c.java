package k37;

import com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.TaxHubPaymentAssessmentScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TaxHubPaymentAssessmentScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = taxHubPaymentAssessmentScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TaxHubPaymentAssessmentScreen taxHubPaymentAssessmentScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) taxHubPaymentAssessmentScreen.d()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b bVar = (com.revolut.feature.freelancer.impl.ui.tax_hub.payment.assessment.b) taxHubPaymentAssessmentScreen.d();
                f fVar = (f) zi0.c.I(((g) ((j2) bVar.u.f22677a).getValue()).f180629b);
                List list = fVar.f180626b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (((ds6.w) obj3).f117251a == ds6.v.BANK_TRANSFER) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    arrayList2.add(((ds6.w) it8.next()).f117252b);
                }
                if (arrayList2.isEmpty()) {
                    bVar.C2(j.f180633a);
                } else {
                    bVar.n2(new k0g.b(bVar, arrayList2, fVar, (Continuation) null, 5), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
