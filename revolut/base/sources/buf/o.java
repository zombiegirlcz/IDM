package buf;

import com.revolut.feature.transfer.models.transfer.TransferTrustData;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.c {
    public TransferTrustData u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a f18820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18821x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.f18820w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f18821x |= Integer.MIN_VALUE;
        return this.f18820w.a(null, this);
    }
}
