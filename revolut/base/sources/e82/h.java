package e82;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.c {
    public dj0.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.multibanco.impl.ui.pay.a f123565w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f123566x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.revolut.feature.apm.multibanco.impl.ui.pay.a aVar, gim.c cVar) {
        super(cVar);
        this.f123565w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f123566x |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.multibanco.impl.ui.pay.a.I2(this.f123565w, null, null, this);
    }
}
