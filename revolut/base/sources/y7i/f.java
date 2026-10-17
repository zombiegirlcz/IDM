package y7i;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature_move_money.impl.flow.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f311526w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature_move_money.impl.flow.e eVar, gim.c cVar) {
        super(cVar);
        this.v = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f311526w |= Integer.MIN_VALUE;
        return com.revolut.feature_move_money.impl.flow.e.I2(this.v, this);
    }
}
