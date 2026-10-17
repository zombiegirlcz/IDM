package fze;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.c {
    public zve.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b f139177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f139178x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar, gim.c cVar) {
        super(cVar);
        this.f139177w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f139178x |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b.I2(this.f139177w, null, this);
    }
}
