package buf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class j0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferRequestApprovalData.GroupBillsApproval f18809w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(a1 a1Var, TransferRequestApprovalData.GroupBillsApproval groupBillsApproval, Continuation continuation) {
        super(1, continuation);
        this.v = a1Var;
        this.f18809w = groupBillsApproval;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j0(this.v, this.f18809w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
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
        TransferRequestApprovalData.GroupBillsApproval groupBillsApproval = this.f18809w;
        a1 a1Var = this.v;
        i0 i0Var = new i0(a1Var, groupBillsApproval, null);
        this.u = 1;
        Object objB0 = zh9.u0.b0(a1Var.X(), "MONEY_REQUEST_TRANSFER_AMOUNT_CTA_BUTTON_TAG", i0Var, this);
        return objB0 == aVar ? aVar : objB0;
    }
}
