package c7j;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f22041w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f22041w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
