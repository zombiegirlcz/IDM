package n8i;

/* JADX INFO: loaded from: classes10.dex */
public final class t0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.topup.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f213472w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.revolut.feature_move_money.impl.topup.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f213472w |= Integer.MIN_VALUE;
        return this.v.K2(null, null, this);
    }
}
