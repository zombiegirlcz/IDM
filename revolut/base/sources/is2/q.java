package is2;

/* JADX INFO: loaded from: classes21.dex */
public final class q extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b f168099w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f168100x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b bVar, gim.c cVar) {
        super(cVar);
        this.f168099w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f168100x |= Integer.MIN_VALUE;
        return com.revolut.feature.blocked_merchants.impl.ui.block_merchant_flow.select_payment.b.y2(this.f168099w, null, this);
    }
}
