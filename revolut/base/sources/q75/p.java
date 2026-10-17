package q75;

/* JADX INFO: loaded from: classes21.dex */
public final class p extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f242756w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f242756w |= Integer.MIN_VALUE;
        return com.revolut.feature.credit.loan.impl.ui.rev10.repayamount.a.I2(this.v, null, this);
    }
}
