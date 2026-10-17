package cg9;

import com.revolut.feature.apm.bills.core.api.model.Bill;
import com.revolut.feature.apm.bills.core.api.model.BillCopyResult;
import com.revolut.feature.pay_bills_taxes.api.navigation.FormFlowInputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bill f23881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Bill bill, Continuation continuation) {
        super(2, continuation);
        this.v = nVar;
        this.f23881w = bill;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new m(this.v, this.f23881w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        n nVar = this.v;
        Bill bill = this.f23881w;
        if (i == 0) {
            yhm.o.b(obj2);
            ack.n nVar2 = new ack.n(4);
            l lVar = new l(nVar, bill, null, 1);
            this.u = 1;
            obj2 = n14.k.Q(nVar, null, null, nVar2, lVar, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        nii.e eVar = (nii.e) obj2;
        if (eVar instanceof nii.d) {
            nVar.C1(new com.revolut.kompot.common.b(nVar.e1(new ef9.e(new FormFlowInputData(bill.f61246a, ((BillCopyResult) ((nii.d) eVar).f216133a).f61252a))), (ModalDestination.Style) null, 6));
        }
        return Unit.f186387a;
    }
}
