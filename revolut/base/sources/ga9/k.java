package ga9;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f142088x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.onboarding.impl.onboarding.v vVar, gim.c cVar) {
        super(cVar);
        this.f142087w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f142088x |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.onboarding.v.I2(this.f142087w, null, null, this);
    }
}
