package ga9;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f142089w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature.onboarding.impl.onboarding.v vVar, gim.c cVar) {
        super(cVar);
        this.v = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f142089w |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.onboarding.v.N2(this.v, null, this);
    }
}
