package mc9;

/* JADX INFO: loaded from: classes5.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f204328w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.onboarding.impl.qes.waiting_qes_result.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f204328w |= Integer.MIN_VALUE;
        return this.v.O2(null, null, this);
    }
}
