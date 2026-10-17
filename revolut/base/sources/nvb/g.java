package nvb;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f219579w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f219579w |= Integer.MIN_VALUE;
        return com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a.I2(this.v, this);
    }
}
