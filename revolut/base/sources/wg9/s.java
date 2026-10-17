package wg9;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f297265w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f297265w |= Integer.MIN_VALUE;
        return com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a.I2(this.v, null, this);
    }
}
