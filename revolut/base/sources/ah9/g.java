package ah9;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4915w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f4915w |= Integer.MIN_VALUE;
        return com.revolut.feature.pay_bills_taxes.impl.ui_catalogue.flow.b.I2(this.v, null, this);
    }
}
