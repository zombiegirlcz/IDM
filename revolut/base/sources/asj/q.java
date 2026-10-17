package asj;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8947w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f8947w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.impl.budgeting.ui.rev10.set_budgets.flow.b.P2(this.v, this);
    }
}
