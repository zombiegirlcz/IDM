package ob9;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.plan_selection.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f223898w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.onboarding.impl.onboarding.plan_selection.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f223898w |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.onboarding.plan_selection.a.I2(this.v, this);
    }
}
