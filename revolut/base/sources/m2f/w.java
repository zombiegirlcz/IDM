package m2f;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f201997w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f201997w |= Integer.MIN_VALUE;
        return com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a.I2(this.v, null, this);
    }
}
