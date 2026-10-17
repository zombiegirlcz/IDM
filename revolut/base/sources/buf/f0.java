package buf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;

/* JADX INFO: loaded from: classes9.dex */
public final class f0 extends gim.c {
    public TransferRequestApprovalData.GroupBillsApproval u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f18799w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18800x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a1 a1Var, gim.c cVar) {
        super(cVar);
        this.f18799w = a1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f18800x |= Integer.MIN_VALUE;
        return a1.z2(this.f18799w, null, this);
    }
}
