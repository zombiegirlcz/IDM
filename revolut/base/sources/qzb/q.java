package qzb;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rev_points.impl.ui.opt_in.screen.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f250510w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.feature.rev_points.impl.ui.opt_in.screen.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f250510w |= Integer.MIN_VALUE;
        return com.revolut.feature.rev_points.impl.ui.opt_in.screen.a.I2(this.v, this);
    }
}
