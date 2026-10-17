package exc;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.select.payment.impl.ui.flow.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f130383w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.select.payment.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f130383w |= Integer.MIN_VALUE;
        return com.revolut.feature.select.payment.impl.ui.flow.a.I2(this.v, this);
    }
}
