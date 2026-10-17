package hfb;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.reverywhere.impl.onboarding.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f151791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.retail.reverywhere.impl.onboarding.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f151791w |= Integer.MIN_VALUE;
        return this.v.L2(this);
    }
}
