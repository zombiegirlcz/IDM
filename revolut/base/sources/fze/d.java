package fze;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f139176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f139176w |= Integer.MIN_VALUE;
        return this.v.M2(null, null, this);
    }
}
