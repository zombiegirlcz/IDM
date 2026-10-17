package xub;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.buying.impl.ui.flow.a f309005w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f309006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.rev_points.buying.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f309005w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f309006x |= Integer.MIN_VALUE;
        return com.revolut.feature.rev_points.buying.impl.ui.flow.a.I2(this.f309005w, null, this);
    }
}
