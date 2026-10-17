package u99;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f278428w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f278428w |= Integer.MIN_VALUE;
        return this.v.L2(null, this);
    }
}
