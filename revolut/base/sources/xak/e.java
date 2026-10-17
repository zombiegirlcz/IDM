package xak;

import bbk.q;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$OutputData;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Default;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Navigation;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentResult$Timeout;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ q u;
    public final /* synthetic */ com.revolut.retail.feature.pending_payments.impl.ui.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, com.revolut.retail.feature.pending_payments.impl.ui.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = qVar;
        this.v = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        PendingPaymentResult$Timeout pendingPaymentResult$Timeout = this.u.f14337a;
        boolean z = pendingPaymentResult$Timeout instanceof PendingPaymentResult$Navigation;
        PendingPaymentContract$OutputData.Rejected rejected = PendingPaymentContract$OutputData.Rejected.f102406a;
        com.revolut.retail.feature.pending_payments.impl.ui.a aVar2 = this.v;
        if (z) {
            aVar2.C1(((PendingPaymentResult$Navigation) pendingPaymentResult$Timeout).f102413a);
            aVar2.C2(rejected);
        } else {
            if (!(pendingPaymentResult$Timeout instanceof PendingPaymentResult$Default)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar2.C2(rejected);
        }
        return Unit.f186387a;
    }
}
