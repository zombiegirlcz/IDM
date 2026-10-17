package y17;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.sales.new_sale.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f310326w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.freelancer.impl.ui.sales.new_sale.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f310326w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.sales.new_sale.a.J2(this.v, this);
    }
}
