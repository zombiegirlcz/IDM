package uob;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ k v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        k kVar = this.v;
        Object content = ((g) ((j2) kVar.f281601s.f22677a).getValue()).f281595a.getContent();
        Intrinsics.i(content, "null cannot be cast to non-null type com.revolut.feature.retail.savings.impl.ui.common.dialogs.next_interest_payment.NextInterestPaymentDialogScreenContract.ContentData.AmountForDailyInterestPayment");
        d dVar = (d) content;
        s15.j jVar = new s15.j(kVar, dVar.f281592b, dVar.f281591a, (Continuation) null, 17);
        this.u = 1;
        Object objP2 = kVar.p2(this, jVar);
        return objP2 == aVar ? aVar : objP2;
    }
}
