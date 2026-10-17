package t42;

/* JADX INFO: loaded from: classes20.dex */
public final class a0 extends gim.c {
    public com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c f267835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f267836x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f267835w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f267836x |= Integer.MIN_VALUE;
        return com.revolut.feature.apm.core.ui.impl.ui.transfer.amount.c.K2(this.f267835w, null, this);
    }
}
