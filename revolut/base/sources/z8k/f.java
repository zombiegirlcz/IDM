package z8k;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a f320170w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f320171x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.f320170w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f320171x |= Integer.MIN_VALUE;
        return this.f320170w.c(null, null, null, null, this);
    }
}
