package zs4;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f324812w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.credit.card.impl.ui.instalment.repay.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f324812w |= Integer.MIN_VALUE;
        return this.v.J2(this);
    }
}
