package guf;

import com.revolut.feature.transfer.models.transfer.RecipientTrustState;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends gim.c {
    public TransferRequestApprovalData.MoneyRequestApproval u;
    public RecipientTrustState v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f146914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f146915x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146916y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.f146915x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f146914w = obj2;
        this.f146916y |= Integer.MIN_VALUE;
        return this.f146915x.j(null, this);
    }
}
