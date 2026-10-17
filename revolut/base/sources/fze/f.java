package fze;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b f139179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f139180x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar, gim.c cVar) {
        super(cVar);
        this.f139179w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f139180x |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b.J2(this.f139179w, null, this);
    }
}
