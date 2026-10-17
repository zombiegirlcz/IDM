package bt9;

import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ w v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ItemizationReceiptDeletionData.GroupBill f18474w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar, ItemizationReceiptDeletionData.GroupBill groupBill, Continuation continuation) {
        super(2, continuation);
        this.v = wVar;
        this.f18474w = groupBill;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new q(this.v, this.f18474w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((q) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            dt9.a aVar2 = this.v.f18480w;
            this.u = 1;
            Object objC = ((mr9.a) ((dt9.b) aVar2).f117399a).c(this.f18474w, this);
            if (objC != aVar) {
                objC = Unit.f186387a;
            }
            if (objC == aVar) {
                return aVar;
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
