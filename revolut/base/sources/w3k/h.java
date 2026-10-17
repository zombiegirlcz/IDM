package w3k;

import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer.RemittanceTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c f294424w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f294424w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f294424w, continuation, 0);
            default:
                return new h(this.f294424w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar = this.f294424w;
                RemittanceTransferData remittanceTransferDataT2 = cVar.T2();
                Object objB = cVar.u.b(remittanceTransferDataT2, cVar.O2(remittanceTransferDataT2), this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                this.v = 1;
                com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.c cVar2 = this.f294424w;
                RemittanceTransferData remittanceTransferDataT22 = cVar2.T2();
                Object objB2 = cVar2.u.b(remittanceTransferDataT22, cVar2.O2(remittanceTransferDataT22), this);
                return objB2 == aVar2 ? aVar2 : objB2;
        }
    }
}
