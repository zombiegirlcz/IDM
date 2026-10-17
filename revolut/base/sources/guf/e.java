package guf;

import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalData;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends gim.c {
    public TransferRequestApprovalData u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f146906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f146907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146908y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, gim.c cVar) {
        super(cVar);
        this.f146907x = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f146906w = obj2;
        this.f146908y |= Integer.MIN_VALUE;
        return this.f146907x.c(null, this);
    }
}
