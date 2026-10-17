package z6k;

import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ItemizationReceiptDeletionData.SplitBill f319789w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.b bVar, ItemizationReceiptDeletionData.SplitBill splitBill, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f319789w = splitBill;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g0(this.v, this.f319789w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.retail.feature.payments.money_request.impl.ui_kompot.details.a aVar = this.v.o;
            this.u = 1;
            u71.a aVar2 = ((u6k.h) aVar.f102153b).f277625b;
            ItemizationReceiptDeletionData.SplitBill splitBill = this.f319789w;
            Object objA = nim.a.a(aVar2.deleteSplitBillReceipt(splitBill.f79916a, splitBill.f79917b, splitBill.f79918c), this);
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA != obj3) {
                objA = Unit.f186387a;
            }
            if (objA == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
