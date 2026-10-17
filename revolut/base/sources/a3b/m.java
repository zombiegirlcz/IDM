package a3b;

/* JADX INFO: loaded from: classes6.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.flows.withdraw.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1093w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.retail.cfd.impl.flows.withdraw.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f1093w |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.cfd.impl.flows.withdraw.a.K2(this.v, this);
    }
}
