package oah;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.c {
    public com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a f223643w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f223644x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a aVar, gim.c cVar) {
        super(cVar);
        this.f223643w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f223644x |= Integer.MIN_VALUE;
        return com.revolut.feature.wealth.impl.ui.flows.dual_add_money.a.I2(this.f223643w, null, this);
    }
}
