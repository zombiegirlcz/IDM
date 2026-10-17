package bec;

/* JADX INFO: loaded from: classes6.dex */
public final class l0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.revolutpay.shared.ui.pay_with_any.a f14796w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14797x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.revolut.feature.revolutpay.shared.ui.pay_with_any.a aVar, gim.c cVar) {
        super(cVar);
        this.f14796w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f14797x |= Integer.MIN_VALUE;
        return com.revolut.feature.revolutpay.shared.ui.pay_with_any.a.I2(this.f14796w, null, this);
    }
}
