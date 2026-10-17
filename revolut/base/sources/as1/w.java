package as1;

import com.revolut.feature.apm.bills.core.api.model.BillTransferData;
import com.revolut.feature.apm.bills.core.api.model.BillTransferType;
import com.revolut.feature.apm.bills.core.api.model.search.tapi.BillSearchTapiResult;
import com.revolut.feature.apm.bills.tapi.api.model.TapiPaymentMethodDetails;
import com.revolut.feature.apm.core.models.transfers.payments.ApmPaymentSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a0 a0Var, Continuation continuation) {
        super(1, continuation);
        this.v = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        io3.d dVar;
        a0 a0Var = this.v;
        cli.y yVar = a0Var.f8759w;
        h hVar = a0Var.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        yhm.o.b(obj2);
        wo1.b bVar = a0Var.f8755q;
        String strName = hVar.f8763a.f61450a.name();
        BillTransferType billTransferType = BillTransferType.BILL_PAYMENT;
        dj0.d dVar2 = hVar.f8764b;
        ur1.a aVar2 = ((g) ((j2) yVar.f22677a).getValue()).d;
        String str = (aVar2 == null || (dVar = aVar2.f282231b) == null) ? null : dVar.f163145a;
        if (str == null) {
            str = "";
        }
        ApmPaymentSource apmPaymentSource = new ApmPaymentSource(str, t02.c.POCKET);
        String str2 = hVar.f8763a.f61453g;
        String str3 = ((g) ((j2) yVar.f22677a).getValue()).f8762c;
        BillSearchTapiResult.PaymentMethodDetails paymentMethodDetails = hVar.f8763a.i;
        BillTransferData billTransferData = new BillTransferData(strName, billTransferType, dVar2, apmPaymentSource, null, null, str2, str3, null, paymentMethodDetails != null ? new TapiPaymentMethodDetails(paymentMethodDetails.f61456b, paymentMethodDetails.f, paymentMethodDetails.f61458g, paymentMethodDetails.f61459h, paymentMethodDetails.f61457c, paymentMethodDetails.i) : null, null, null, null, 7472);
        this.u = 1;
        Object objC = ((vp1.c) bVar).c(billTransferData, this);
        return objC == aVar ? aVar : objC;
    }
}
