package xk1;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.alipay.impl.ui.qr.scanner.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f306599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.alipay.impl.ui.qr.scanner.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f306599w |= Integer.MIN_VALUE;
        return com.revolut.feature.alipay.impl.ui.qr.scanner.a.I2(this.v, null, this);
    }
}
