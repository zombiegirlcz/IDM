package zb9;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f320850w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.onboarding.impl.onboarding.waiting_verification.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f320850w |= Integer.MIN_VALUE;
        return this.v.K2(this);
    }
}
