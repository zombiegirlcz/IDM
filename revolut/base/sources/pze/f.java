package pze;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f240993w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f240993w |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup_flows.new_card.b.I2(this.v, null, this);
    }
}
