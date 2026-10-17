package z8k;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a f320163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320164x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.f320163w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320164x |= Integer.MIN_VALUE;
        return this.f320163w.a(null, null, null, null, this);
    }
}
