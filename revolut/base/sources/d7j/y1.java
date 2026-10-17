package d7j;

/* JADX INFO: loaded from: classes10.dex */
public final class y1 extends gim.c {
    public wd6.h u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g f112082w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f112083x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g gVar, gim.c cVar) {
        super(cVar);
        this.f112082w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f112083x |= Integer.MIN_VALUE;
        return this.f112082w.O2(null, this);
    }
}
