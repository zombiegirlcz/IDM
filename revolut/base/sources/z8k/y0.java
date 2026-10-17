package z8k;

/* JADX INFO: loaded from: classes11.dex */
public final class y0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f320235w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f320235w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b.z2(this.v, null, this);
    }
}
