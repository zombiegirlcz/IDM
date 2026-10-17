package ix6;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f169395w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g gVar, gim.c cVar) {
        super(cVar);
        this.v = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f169395w |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.invoice.create.screen.g.I2(this.v, this);
    }
}
