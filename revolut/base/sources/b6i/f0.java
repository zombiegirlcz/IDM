package b6i;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.amount.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f12781w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.revolut.feature_move_money.impl.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f12781w |= Integer.MIN_VALUE;
        return com.revolut.feature_move_money.impl.amount.c.K2(this.v, null, null, null, null, this);
    }
}
