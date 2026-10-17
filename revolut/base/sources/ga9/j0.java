package ga9;

/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends gim.c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.v f142085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f142086x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.feature.onboarding.impl.onboarding.v vVar, gim.c cVar) {
        super(cVar);
        this.f142085w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f142086x |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.onboarding.v.M2(this.f142085w, false, this);
    }
}
