package k65;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a f181642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f181643x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.credit.loan.impl.ui.rev10.cancellation_v2.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f181642w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f181643x |= Integer.MIN_VALUE;
        return this.f181642w.M2(null, this);
    }
}
