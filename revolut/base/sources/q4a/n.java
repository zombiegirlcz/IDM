package q4a;

import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public WhoToTransferActionItem u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a f242111w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f242112x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar, gim.c cVar) {
        super(cVar);
        this.f242111w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f242112x |= Integer.MIN_VALUE;
        return com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a.I2(this.f242111w, null, this);
    }
}
