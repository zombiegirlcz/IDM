package th2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.wero.impl.ui.flow.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f271254w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.revolut.feature.apm.wero.impl.ui.flow.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f271254w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.wero.impl.ui.flow.b.I2(this.v, null, this);
    }
}
