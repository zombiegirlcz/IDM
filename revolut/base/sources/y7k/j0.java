package y7k;

/* JADX INFO: loaded from: classes11.dex */
public final class j0 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f311556w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.amount.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f311556w |= Integer.MIN_VALUE;
        return this.v.M2(this);
    }
}
