package k65;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f181641w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f181641w |= Integer.MIN_VALUE;
        return this.v.L2(null, this);
    }
}
