package ga9;

/* JADX INFO: loaded from: classes5.dex */
public final class h0 extends gim.c {
    public wi0.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f142080x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.revolut.feature.onboarding.impl.onboarding.v vVar, gim.c cVar) {
        super(cVar);
        this.f142079w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f142080x |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.onboarding.v.K2(this.f142079w, null, this);
    }
}
