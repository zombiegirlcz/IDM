package dh9;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public k71.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_bills_taxes.impl.ui_payment.a f114771w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f114772x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.revolut.feature.pay_bills_taxes.impl.ui_payment.a aVar, gim.c cVar) {
        super(cVar);
        this.f114771w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f114772x |= Integer.MIN_VALUE;
        return com.revolut.feature.pay_bills_taxes.impl.ui_payment.a.I2(this.f114771w, null, null, this);
    }
}
