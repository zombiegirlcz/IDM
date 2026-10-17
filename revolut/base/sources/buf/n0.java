package buf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class n0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ a1 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(a1 a1Var, Continuation continuation) {
        super(2, continuation);
        this.v = a1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new n0(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            a1 a1Var = this.v;
            TransferRequestApprovalData transferRequestApprovalData = ((c) a1Var.t2()).f18784a;
            Intrinsics.i(transferRequestApprovalData, "null cannot be cast to non-null type com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData.GroupBillsApproval");
            m0 m0Var = new m0(a1Var, (TransferRequestApprovalData.GroupBillsApproval) transferRequestApprovalData, null);
            this.u = 1;
            if (zh9.u0.b0(a1Var.X(), "MONEY_REQUEST_MARK_AS_PAID_CTA_BUTTON_TAG", m0Var, this) == aVar) {
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
