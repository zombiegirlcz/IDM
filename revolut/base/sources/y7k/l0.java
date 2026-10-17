package y7k;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f311558w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f311558w |= Integer.MIN_VALUE;
        return com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a.J2(this.v, this);
    }
}
