package za9;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f320590w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f320590w |= Integer.MIN_VALUE;
        return com.revolut.feature.onboarding.impl.onboarding.india_app_redirection.flow.a.I2(this.v, this);
    }
}
