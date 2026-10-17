package ks9;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class m0 extends gim.c {
    public final /* synthetic */ n0 A;
    public int B;
    public qq9.d u;
    public PaymentGroup v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ArrayList f189349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public dj0.d f189350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TransferRequestApprovalData.GroupBillsApproval f189351y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, gim.c cVar) {
        super(cVar);
        this.A = n0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return n0.b3(this.A, null, null, null, this);
    }
}
