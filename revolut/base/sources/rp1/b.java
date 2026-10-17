package rp1;

import com.revolut.feature.apm.bills.core.api.model.BillCopyResult;
import com.revolut.feature.apm.bills.core.impl.data.network.BillsServiceV2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f256235w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f256236x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(j jVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f256235w = jVar;
        this.f256236x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f256235w, this.f256236x, continuation, 0);
            case 1:
                return new b(this.f256235w, this.f256236x, continuation, 1);
            default:
                return new b(this.f256235w, this.f256236x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV2 = this.f256235w.f256245b;
                    this.v = 1;
                    obj2 = billsServiceV2.copyBill(this.f256236x, new wj0.b("BILL_COPY_IDEMPOTENCY_KEY"), this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                hp1.a aVar2 = (hp1.a) obj2;
                Intrinsics.checkNotNullParameter(aVar2, "<this>");
                return new BillCopyResult(aVar2.getPaymentIntentId());
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV22 = this.f256235w.f256245b;
                    this.v = 1;
                    if (billsServiceV22.deleteBill(this.f256236x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    BillsServiceV2 billsServiceV23 = this.f256235w.f256245b;
                    this.v = 1;
                    obj2 = billsServiceV23.getBill(this.f256236x, this);
                    if (obj2 == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return hx7.e.p((hp1.b) obj2);
        }
    }
}
