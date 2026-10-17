package qzb;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.opt_in.screen.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f250511w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f250511w |= Integer.MIN_VALUE;
        return this.v.J2(this);
    }
}
