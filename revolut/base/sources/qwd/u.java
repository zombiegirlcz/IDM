package qwd;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.staking.impl.stake.v2.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f249880w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.staking.impl.stake.v2.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f249880w |= Integer.MIN_VALUE;
        return com.revolut.feature.staking.impl.stake.v2.b.I2(this.v, this);
    }
}
