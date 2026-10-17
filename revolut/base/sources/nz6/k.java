package nz6;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.onboarding.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f220969w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f220969w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.K2(this.v, this);
    }
}
