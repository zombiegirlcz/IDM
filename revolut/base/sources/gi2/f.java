package gi2;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.wero.impl.ui.pay.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f144063w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.apm.wero.impl.ui.pay.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f144063w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.wero.impl.ui.pay.b.I2(this.v, null, this);
    }
}
