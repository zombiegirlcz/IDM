package nxa;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.referrals.impl.personalized_tracking.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220539w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.revolut.feature.referrals.impl.personalized_tracking.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f220539w |= Integer.MIN_VALUE;
        return com.revolut.feature.referrals.impl.personalized_tracking.a.I2(this.v, this);
    }
}
