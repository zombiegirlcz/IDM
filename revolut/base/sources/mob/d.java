package mob;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.savings.impl.ui.add_money.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f207602w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.retail.savings.impl.ui.add_money.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f207602w |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.savings.impl.ui.add_money.b.I2(this.v, null, this);
    }
}
