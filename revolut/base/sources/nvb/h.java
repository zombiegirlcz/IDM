package nvb;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f219580w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.rev_points.exclusive_store.impl.ui.flow.root.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f219580w |= Integer.MIN_VALUE;
        return this.v.J2(false, this);
    }
}
