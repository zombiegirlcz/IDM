package qt1;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f248920w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f248920w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.b.d3(this.v, null, this);
    }
}
