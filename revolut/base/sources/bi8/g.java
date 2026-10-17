package bi8;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.creation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15445w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.junior_onboarding.impl.ui.creation.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f15445w |= Integer.MIN_VALUE;
        return com.revolut.feature.junior_onboarding.impl.ui.creation.a.I2(this.v, this);
    }
}
