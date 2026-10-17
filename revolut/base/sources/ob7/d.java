package ob7;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f223890w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c cVar, gim.c cVar2) {
        super(cVar2);
        this.v = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f223890w |= Integer.MIN_VALUE;
        return com.revolut.feature.hidden_accounts.impl.ui.secret_accounts_flow.c.I2(this.v, this);
    }
}
