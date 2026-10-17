package hze;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f157169w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f157169w |= Integer.MIN_VALUE;
        return this.v.O2(null, this);
    }
}
