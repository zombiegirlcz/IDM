package c7j;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends gim.c {
    public xi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a f22039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22040x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.dialog_provider.a aVar, gim.c cVar) {
        super(cVar);
        this.f22039w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f22040x |= Integer.MIN_VALUE;
        return this.f22039w.a(null, this);
    }
}
