package di8;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.junior_onboarding.impl.ui.onboarding.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114954w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.junior_onboarding.impl.ui.onboarding.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f114954w |= Integer.MIN_VALUE;
        return this.v.M2(this);
    }
}
