package bgb;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.flow.ui.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f15172w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.retail.salary_account.impl.flow.ui.d dVar, gim.c cVar) {
        super(cVar);
        this.v = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f15172w |= Integer.MIN_VALUE;
        return com.revolut.feature.retail.salary_account.impl.flow.ui.d.I2(this.v, this);
    }
}
