package ag4;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4779w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.credit.application.plugins.impl.ui.overdraft_offer.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f4779w |= Integer.MIN_VALUE;
        return this.v.b(this);
    }
}
