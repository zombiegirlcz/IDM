package l42;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f192047w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b bVar, gim.c cVar) {
        super(cVar);
        this.v = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f192047w |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.core.ui.impl.ui.topup_request.details.b.I2(this.v, null, this);
    }
}
