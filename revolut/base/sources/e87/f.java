package e87;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.global_markets.impl.ui.flow.index_details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f123615w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.global_markets.impl.ui.flow.index_details.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f123615w |= Integer.MIN_VALUE;
        return com.revolut.feature.global_markets.impl.ui.flow.index_details.b.I2(this.v, this);
    }
}
