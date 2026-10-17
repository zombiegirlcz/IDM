package bi8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.creation.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15443w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.junior_onboarding.impl.ui.creation.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f15443w |= Integer.MIN_VALUE;
        return this.v.J2(this);
    }
}
