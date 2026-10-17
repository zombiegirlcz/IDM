package a3b;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.flows.withdraw.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.feature.retail.cfd.impl.flows.withdraw.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f1092w |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.cfd.impl.flows.withdraw.a.J2(this.v, this);
    }
}
