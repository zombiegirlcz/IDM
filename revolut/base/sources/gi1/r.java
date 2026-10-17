package gi1;

/* JADX INFO: loaded from: classes20.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.address.common.impl.flow.screen.add.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f144049w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.revolut.feature.address.common.impl.flow.screen.add.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f144049w |= Integer.MIN_VALUE;
        return com.revolut.feature.address.common.impl.flow.screen.add.a.I2(this.v, this);
    }
}
