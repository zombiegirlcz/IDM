package q4a;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f242113w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f242113w |= Integer.MIN_VALUE;
        return com.revolut.feature.payments.who_to_transfer.impl.transfer.search.a.J2(this.v, null, this);
    }
}
