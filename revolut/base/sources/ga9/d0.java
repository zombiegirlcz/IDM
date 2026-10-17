package ga9;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f142066w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.revolut.feature.onboarding.impl.onboarding.v vVar, gim.c cVar) {
        super(cVar);
        this.v = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f142066w |= Integer.MIN_VALUE;
        return this.v.Q2(null, null, this);
    }
}
