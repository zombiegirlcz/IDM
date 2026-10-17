package b4b;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.cfd.impl.screens.order.v2.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12219w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.revolut.feature.retail.cfd.impl.screens.order.v2.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f12219w |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.cfd.impl.screens.order.v2.a.I2(this.v, null, false, this);
    }
}
