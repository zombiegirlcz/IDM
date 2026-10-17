package rze;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f258604w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f258604w |= Integer.MIN_VALUE;
        return com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method.a.J2(this.v, this);
    }
}
