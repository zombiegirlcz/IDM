package rze;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f258607w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f258607w |= Integer.MIN_VALUE;
        return this.v.M2(this);
    }
}
