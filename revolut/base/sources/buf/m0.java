package buf;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class m0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ a1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransferRequestApprovalData.GroupBillsApproval f18818w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(a1 a1Var, TransferRequestApprovalData.GroupBillsApproval groupBillsApproval, Continuation continuation) {
        super(1, continuation);
        this.v = a1Var;
        this.f18818w = groupBillsApproval;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m0(this.v, this.f18818w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        a1 a1Var = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            kuf.d dVar = a1Var.v;
            qq9.d dVar2 = qq9.d.MARK_PAID;
            TransferRequestApprovalData.GroupBillsApproval groupBillsApproval = this.f18818w;
            PaymentGroup paymentGroup = groupBillsApproval.f92451c;
            List list = groupBillsApproval.d;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (((GroupMemberSettleInfo) obj3).f79505c) {
                    arrayList.add(obj3);
                }
            }
            this.u = 1;
            if (dVar.d3(dVar2, paymentGroup, arrayList, null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        a1Var.v2(f.f18798a);
        return Unit.f186387a;
    }
}
