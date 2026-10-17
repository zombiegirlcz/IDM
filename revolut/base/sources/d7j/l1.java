package d7j;

/* JADX INFO: loaded from: classes10.dex */
public final class l1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f112022w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f112022w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.J2(this.v, this);
    }
}
