package u99;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c f278423w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f278424x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f278423w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f278424x |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.exchange_global_access.flow_v2.c.I2(this.f278423w, null, this);
    }
}
