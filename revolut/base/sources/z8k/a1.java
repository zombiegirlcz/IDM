package z8k;

/* JADX INFO: loaded from: classes11.dex */
public final class a1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f320156w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f320156w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.b.A2(this.v, this);
    }
}
